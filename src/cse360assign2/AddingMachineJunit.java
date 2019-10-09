//Name: Micah Schmidt
//Assignment: Assignment 2
//Class: CSE 360 M 9:40AM
//This is the JUnit test contained in the second commit version.

package cse360assign2;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

public class AddingMachineJunit extends TestCase {
	@Test
	void correctAdd() {
		AddingMachine calc = new AddingMachine();
		calc.add(2);
		int result = calc.getTotal();
		assertEquals(2, result);
	}
	@Test
	void correctAddString() {
		AddingMachine calc = new AddingMachine();
		calc.add(2);
		String result = calc.toString();
		assertEquals("0 + 2 ", result);
	}
	@Test
	void correctSubtract() {
		AddingMachine calc = new AddingMachine();
		calc.subtract(3);
		int result = calc.getTotal();
		assertEquals(-3, result);
	}
	@Test
	void correctSubtractString() {
		AddingMachine calc = new AddingMachine();
		calc.subtract(3);
		String result = calc.toString();
		assertEquals("0 - 3 ", result);
	}
	@Test
	void correctAddAndSubtract() {
		AddingMachine calc = new AddingMachine();
		calc.add(2);
		calc.subtract(3);
		int result = calc.getTotal();
		assertEquals(-1, result);
	}
	@Test
	void correctAddAndSubtractString() {
		AddingMachine calc = new AddingMachine();
		calc.add(2);
		calc.subtract(3);
		String result = calc.toString();
		assertEquals("0 + 2 - 3 ", result);
	}
	@Test
	void correctGetTotal() {
		AddingMachine calc = new AddingMachine();
		calc.add(2);
		calc.subtract(1);
		calc.add(8);
		calc.add(2);
		calc.subtract(5);
		int result = calc.getTotal();
		assertEquals(6, result);
	}
	@Test
	void correcttoString() {
		AddingMachine calc = new AddingMachine();
		calc.add(2);
		calc.subtract(1);
		calc.add(8);
		calc.add(2);
		calc.subtract(5);
		String result = calc.toString();
		assertEquals("0 + 2 - 1 + 8 + 2 - 5 ", result);
	}
}
