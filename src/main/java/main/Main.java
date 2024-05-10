package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	System.out.println("Factorial calculator");
	try (Scanner scanner = new Scanner(System.in)) {
	    while (true) {
		System.out.println("\nPlease enter a positive integer.");
		String input = scanner.nextLine();
		System.out.println(Output.accept(input));
	    }
	}
    }
}
