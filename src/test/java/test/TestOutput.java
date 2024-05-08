package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import main.Output;

public class TestOutput
{

	@Test
	void prints_factorial_solution()
	{ assertThat(Output.solveFactorial(5)).isEqualTo("5! equals 120."); }
	
}
