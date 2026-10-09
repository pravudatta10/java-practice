package com.pravudatta.javapractice.reactive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamComparisonDemo {
    public static void main(String[] args) {
        // Create a large dataset of numbers
        List<Integer> numbers = IntStream.rangeClosed(1, 5_000_000)
                .boxed()
                .collect(Collectors.toList());

        // --- 1. SEQUENTIAL STREAM ---
        long startTime = System.currentTimeMillis();
        long sequentialResult = numbers.stream()
                .map(StreamComparisonDemo::heavyComputation)
                .reduce(0, Integer::sum);
        long sequentialDuration = System.currentTimeMillis() - startTime;
        System.out.println(sequentialResult);
        System.out.println("Sequential Time: " + sequentialDuration + " ms");

        // --- 2. PARALLEL STREAM ---
        startTime = System.currentTimeMillis();
        long parallelResult = numbers.parallelStream()
                .map(StreamComparisonDemo::heavyComputation)
                .reduce(0, Integer::sum);
        System.out.println(parallelResult);
        long parallelDuration = System.currentTimeMillis() - startTime;
        System.out.println("Parallel Time: " + parallelDuration + " ms");
    }

    private static int heavyComputation(int n) {
        // Simulate CPU-bound mathematical work
        return (int) Math.sqrt(n) * 2;
    }
}
