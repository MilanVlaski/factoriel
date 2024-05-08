package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import main.Output;

public class TestOutput
{

	@Test
	void prints_factorial_solution()
	{ assertThat(Output.solveFactorial(5)).isEqualTo("5! equals 120"); }

	@Test
	void prints_alert_that_number_should_not_be_negative()
	{
		assertThat(Output.solveFactorial(-5)).isEqualTo(
		        "-5 is not a positive integer.");
		assertThat(Output.solveFactorial(-2)).isEqualTo(
		        "-2 is not a positive integer.");
	}

	@Test
	void prints_factorial_solution_from_string_that_is_positive_int()
	{ assertThat(Output.accept("3")).isEqualTo("3! equals 6"); }

	@Test
	void prints_alert_that_input_is_invalid_if_letters_used()
	{
		assertThat(Output.accept("five"))
		        .isEqualTo("Input invalid.");
	}

	@Test
	void prints_alert_that_input_is_invalid_if_special_characters_used()
	{
		assertThat(Output.accept(";"))
		        .isEqualTo("Input invalid.");
	}
}
