package com.pravudatta.javapractice.reactive;

import reactor.core.publisher.Mono;

public class AdvancedQuestions {
    private static final User USER =
            new User("Pravudatta", "U101", "password");

    private static final Address ADDRESS =
            new Address("U101", "Hyderabad", "500001");

    //Retrieve the user's address.
    static void question1() {
        Mono<User> userMono = Mono.just(USER);
        userMono.flatMap(user -> getAddress(user.getUserId())).subscribe(System.out::println);
    }

    static Mono<Address> getAddress(String userId) {
        if (ADDRESS.getUserId().equals(userId)) {
            return Mono.just(ADDRESS);
        }
        return Mono.empty();
    }

    //Combine User + Address
    static void question2() {

    }

    //Handle Empty Response
    static void question3() {

    }

    static void question() {

    }

    public static void main(String[] args) {
    question1();
    }
}
