package com.pravudatta.javapractice.reactive;

import reactor.core.publisher.Flux;

import java.util.List;

public class IntermediateQuestions {

    //Calculate the sum of numbers 1–100.
    static void question1() {
        Flux<Integer> integerFlux = Flux.range(1, 100);
        integerFlux.reduce(Integer::sum).subscribe(System.out::println);
    }

    //Find Maximum
    static void question2() {
        Flux<Integer> integerFlux = Flux.just(10, 25, 5, 40, 15);
        integerFlux.reduce(Integer::max).subscribe(System.out::println);
    }

    // Convert Objects
    static void question3() {
        Flux<User> userFlux = Flux.just(
                new User("Pravudatta", "user", "pwd"),
                new User("Chandan", "user", "pwd"));
        userFlux.map(User::getName).subscribe(System.out::println);
    }

    //Flatten a Flux
    static void question4() {
        Flux<List<Integer>> numberLists = Flux.just(List.of(1, 2), List.of(3, 4), List.of(5, 6));
        numberLists.flatMap(Flux::fromIterable).subscribe(System.out::println);
    }


    static void question() {

    }

    public static void main(String[] args) {
        question4();
    }
}
