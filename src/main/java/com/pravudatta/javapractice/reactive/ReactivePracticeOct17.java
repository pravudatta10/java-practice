package com.pravudatta.javapractice.reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ReactivePracticeOct17 {
    record User(String id, String name, int age) {
    }

    record Product(String name, BigDecimal price) {
    }

    record Accounts(String userId, String accountType) {
    }

    //Create a Mono containing a user name and a Flux containing five integers. Subscribe to both and print their values.
    static void question1() {
        Mono<String> userName = Mono.just("Pravudatta");
        Flux<Integer> integerFlux = Flux.just(1, 2, 4, 5, 6, 7);
        userName.subscribe(System.out::println);
        integerFlux.subscribe(System.out::println);
    }

    //    Given a list of users with name and age, use Flux to return only users aged 18 or above.
    static void question2() {
        List<User> userList = List.of(new User("101", "Pravu", 14), new User("102", "Happy", 18), new User("103", "Chandan", 21));
        List<User> adults = Flux.fromIterable(userList).filter(user -> user.age() >= 18).collectList().block();
        System.out.println(adults);
    }

    //Convert a stream of product prices into prices including 18% GST.
    static void question3() {
        List<Product> productList = Flux.just(new Product("Apple", new BigDecimal(100)), new Product("Grapes", new BigDecimal(120))).map(product -> new Product(product.name(), product.price().multiply(new BigDecimal("1.18")))).collectList().block();
        System.out.println(productList);
    }

    //Fetch a user, then fetch their orders asynchronously, and return all orders for that user.
    static void question4() {
        List<String> orders = Mono.just(new User("101", "Pravudatta", 26)).flatMapMany(user -> getOrders(user.id())).collectList().block();
        System.out.println(orders);
    }

    static Flux<String> getOrders(String userId) {
        return Flux.just(userId + " Order1");
    }

    //Given a stream of repeated email addresses, return unique addresses.
    static void question5() {
        List<String> emails = Flux.just("a@test.com", "b@test.com", "a@test.com", "c@test.com", "b@test.com").distinct().collectList().block();
        System.out.println(emails);
    }

    //Fetch a user's profile and account details independently, then combine them into one response DTO. || Concepts: Mono.zip(), DTO mapping
    static void question6() {
        Mono<User> user = Mono.just(new User("101", "Pravudatta", 26));
        Mono<Accounts> salary = Mono.just(new Accounts("101", "SALARY"));
        String result = Mono.zip(user, salary).map(res -> res.getT1().name() + " | " + res.getT2().accountType()).block();
        System.out.println(result);
    }

    //Call three independent services concurrently and combine their results; compare this with sequential execution.  Concepts: Mono.zip(), flatMap(), concurrency
    static void question7() {
        Mono<String> first = Mono.just("Profile");
        Mono<String> second = Mono.just("Orders");

        String sequential = first.flatMap(a -> second.map(b -> a + " | " + b)).block();
        String concurrently = Mono.zip(first, second).map(tuple -> tuple.getT1() + " | " + tuple.getT2()).block();
        System.out.println(sequential);
        System.out.println(concurrently);
    }

    //    If a product service fails, return a default product response instead of propagating the error. Concepts: onErrorResume(), onErrorReturn()
    static void question8() {
        String block = Mono.<String>error(new RuntimeException("Product not available")).onErrorResume(error -> Mono.just("Default Product")).block();
        System.out.println(block);
    }

    //Retry a transiently failing service call up to three times, with a delay between attempts. Concepts: retryWhen(), Retry.backoff(), retry limits
    static void question9() {
        AtomicInteger atomicInteger = new AtomicInteger();
        String result = Mono.fromCallable(() -> {
                    int attempt = atomicInteger.incrementAndGet();
                    if (attempt < 3) {
                        throw new RuntimeException("Service Temporary down");
                    }
                    return "Fetched successfully";
                }).retryWhen(Retry.max(2))
                .block();

        System.out.println(result);
        System.out.println("Attempts: " + atomicInteger.get());
    }

    //If an external service does not respond within two seconds, return a fallback response. Concepts: timeout(), onErrorResume()
    static void question10() {
        String fallbackResponse = Mono.<String>never().timeout(Duration.ofMillis(100)).onErrorReturn("Fallback response").block();
        System.out.println(fallbackResponse);
    }

    public static void main(String[] args) {
        question9();

    }
}
