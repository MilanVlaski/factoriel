package test;

import static main.Factorial.factorial;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestFactorial {
    @ParameterizedTest
    @MethodSource("factorialTestData")
    void factorial_works(int input, int expected) {
	assertThat(factorial(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> factorialTestData() {
	return Stream.of(Arguments.of(0, 1), Arguments.of(1, 1),
		Arguments.of(2, 2), Arguments.of(3, 6), Arguments.of(4, 24),
		Arguments.of(5, 120));
    }
}
