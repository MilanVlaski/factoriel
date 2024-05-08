package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import main.Factorial;

public class TestFactoriel
{

	@Test
	void Factorial_of_zero_is_one()
	{ assertThat(Factorial.factorial(0)).isEqualTo(1); }
}
