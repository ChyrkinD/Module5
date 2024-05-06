package org.example;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(new Fibonacci().iterative(1000_000));
        System.out.println(System.currentTimeMillis() - startTime + "ms - find 1000000");

        startTime = System.currentTimeMillis();
        System.out.println(new Fibonacci().recursive(50));
        System.out.println(System.currentTimeMillis() - startTime + "ms - find 50");


        startTime = System.currentTimeMillis();
        System.out.println(new Fibonacci().functional(2000));
        System.out.println(System.currentTimeMillis() - startTime + "ms - find 4000");

        startTime = System.currentTimeMillis();
        System.out.println(new Fibonacci().functional(1000));
        System.out.println(System.currentTimeMillis() - startTime + "ms - find 2000");

        startTime = System.currentTimeMillis();
        System.out.println(new Fibonacci().functional(4000));
        System.out.println(System.currentTimeMillis() - startTime + "ms - find 8000");
    }
}