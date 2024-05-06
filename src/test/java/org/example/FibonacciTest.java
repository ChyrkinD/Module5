package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.sql.Time;
import java.util.stream.Stream;

class FibonacciTest {
    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("getValidInputParams")
    void iterativeTest(String name, long input, long expected) {
        long result = fibonacci.iterative(input);

        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("getValidInputParams")
    void recursiveTest(String name, long input, long expected) {
        long result = fibonacci.recursive(input);

        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("getValidInputParams")
    void functionalTest(String name, long input, long expected) {
        Fibonacci fibForFunction = new Fibonacci();
        long result = fibForFunction.functional(input);

        Assertions.assertEquals(expected,result);
    }

    private static Stream<Arguments> getValidInputParams() {
        return Stream.of(
                Arguments.of("get 0 ",0,0),
                Arguments.of("get 1 ",1,1),
                Arguments.of("get 2 ",2,1),
                Arguments.of("get 3 ",3,2),
                Arguments.of("get 4 ",4,3),
                Arguments.of("get 5 ",5,5),
                Arguments.of("get 5 ",9,34),
                Arguments.of("get 5 ",11,89),
                Arguments.of("get 5 ",13,233)
        );
    }
}