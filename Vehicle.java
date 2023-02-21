package oop.review;

public interface Vehicle {

	void move ();
	int speedUp(int increment);
	int speedDown(int decrement);
	void park();
	String toString();
}
