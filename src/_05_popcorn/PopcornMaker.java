package _05_popcorn;

public class PopcornMaker {
	public static void main(String[] args) {
		/* Your mission and you have to accept it:
		 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
		 * The main method should create a bag of Popcorn and cook it in the microwave.
		 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
		 * Don't change the existing methods.
		 */
		Microwave goofy = new Microwave();
		Popcorn pop = new Popcorn("butter");
		goofy.putInMicrowave(pop);
		goofy.setTime(1);
		goofy.startMicrowave();
		goofy.startMicrowave();
	}
}
