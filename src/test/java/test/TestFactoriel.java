package test;

import static main.Factorial.factorial;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TestFactoriel
{

	@Test
	void of_zero_is_one()
	{ assertThat(factorial(0)).isEqualTo(1); }

	@Test
	void of_one_is_one()
	{ assertThat(factorial(1)).isEqualTo(1); }

	@Test
	void of_two_is_two()
	{ assertThat(factorial(2)).isEqualTo(2); }

}
