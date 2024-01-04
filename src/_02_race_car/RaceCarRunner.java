package _02_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar buddy = new RaceCar("Apple",5);
		// 2. Print the RaceCar's position in the race
		System.out.println(buddy.getPositionInRace());
		// 3. Crash the RaceCar
		buddy.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(buddy.isDamaged()) {
			buddy.pit();
		}
		// 5. Help the car move into first place.
		int position = buddy.getPositionInRace();
		while(position> 1) {
			buddy.overtake();
			position = buddy.getPositionInRace();
		}
	}
}
