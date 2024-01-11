package _03_cat;


import javax.swing.JOptionPane;


public class CatRunner {
	public static void main(String[] args) {
	String answer;
	int p = 0;
	System.out.println("You found a cat! Name the cat!");
	String name = JOptionPane.showInputDialog("What do you want to name the cat?");
	Cat withName = new Cat(name);
	withName.printName();
	while (p == 0) {
		answer = JOptionPane.showInputDialog(null,"Would you like to pet or kill the cat? To exit loop, enter p.");
		answer = answer.toLowerCase();
//		if(answer.equals("name")) {
//			String name = JOptionPane.showInputDialog("What do you want to name the cat?");
//			Cat withName = new Cat(name);
//			withName.printName();
//		}
		if(answer.equals("pet")) {
		withName.meow();
		}
		else if(answer.equals("p")) {
		p++;
		}
		else {
			withName.kill();
		}
	}
  }
}
