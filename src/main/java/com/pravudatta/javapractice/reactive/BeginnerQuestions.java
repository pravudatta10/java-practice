package com.pravudatta.javapractice.reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Focus: Flux.just(), Flux.range(), subscribe()
public class BeginnerQuestions {

    //Create a Flux<Integer> containing numbers 1 to 10 and print each number.
    static void question1() {
        //Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Flux<Integer> integerFlux = Flux.range(1, 10);
        integerFlux.subscribe(System.out::println);
    }

    //Create Mono<String> containing "Java Reactive Programming" and convert it to uppercase.
    static void question2() {
        Mono<String> stringMono = Mono.just("Java Reactive Programming");
        stringMono.map(String::toUpperCase).subscribe(System.out::println);
    }

    //From Flux.range(1, 20), return only even numbers.
    static void question3() {
        Flux<Integer> integerFlux = Flux.range(1, 20);
        integerFlux.filter(item -> item % 2 == 0).subscribe(System.out::println);
    }

    //Convert numbers 1–5 into their squares.
    static void question4() {
        Flux<Integer> integerFlux = Flux.range(1, 5);
        integerFlux.map(item -> item * item).subscribe(System.out::println);
    }

    //Remove Duplicates
    static void question5() {
        Flux<Integer> integerFlux = Flux.just(1, 2, 2, 3, 4, 4, 5);
        integerFlux.distinct().subscribe(System.out::print);
    }

    static void question() {

    }

    public static void main(String[] args) {
        question5();
    }
}
