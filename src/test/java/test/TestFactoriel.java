package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import main.Factorial;

public class TestFactoriel
{

	@Test
	void of_zero_is_one()
	{ assertThat(Factorial.factorial(0)).isEqualTo(1); }

	@Test
	void of_one_is_one()
	{ assertThat(Factorial.factorial(1)).isEqualTo(1); }

	@Test
	void of_two_is_two()
	{ assertThat(Factorial.factorial(2)).isEqualTo(2); }
}
