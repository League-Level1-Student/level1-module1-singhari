package _07_duck;

public class Duckly {
	int numberOfFriends;
	String favoriteFood;
	Duckly(String favoriteFood, int numberOfFriends){
		this.favoriteFood = favoriteFood;
	    this.numberOfFriends = numberOfFriends;
	}
	public void quack() {
		System.out.println("The duck says Quack! It's calling its "+numberOfFriends+" over!");
		
	}
	public void waddle(){
		System.out.println("Duck waddles to you. You have "+favoriteFood+", it's favorite food!");
	}
	
	}
