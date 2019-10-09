//Name: Micah Schmidt
//Assignment: Assignment 2
//Class: CSE 360 M 9:40AM
//This is the version contained in the second commit version.

package cse360assign2;

public class AddingMachine {

	private int total;
	private String str; //hold toString
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		str = "0 "; //initialize toString with "0 "
	}
	
	public int getTotal () {
		return total; //iii.
	}
	
	public void add (int value) {
		total += value; //i.
		str += "+ " + value + " ";//when add is called, concatenate a plus sign with the value
	}
	
	public void subtract (int value) {
		total -= value; //ii.
		str += "- " + value + " ";//when add is called, concatenate a minus sign with the value
	}
		
	public String toString () { //iv.
		
		return str;//return toString of function history
	}

	public void clear() {
	
	}
}
