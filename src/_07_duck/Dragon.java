package _07_duck;

public class Dragon {
	int wings;
	String favoriteMetal;
	Dragon(int wings, String favoriteMetal) {
		this.wings = wings;
	    this.favoriteMetal = favoriteMetal;
	}
	public void roar() {
		System.out.println("You stole the dragon's hoard. It consists of "+favoriteMetal + " and other precious metals. Run!");
		}
	public void fly() {
		System.out.println("The dragon is flying! You can feel the beat of "+wings+ " wings beating above.");
	}
}
