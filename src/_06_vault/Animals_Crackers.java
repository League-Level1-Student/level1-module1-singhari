package _06_vault;

public class Animals_Crackers {
	public static void main(String[] args) {
		Vault o = new Vault();
		boolean huess = false;
		int correct = 0;
		for(int i = 0; i<100000; i++) {
			if(huess == false) {
			 huess =o.tryCode(i);}
			else {
			 correct = i;
			 System.out.println(huess+ " " + correct);
			}
		}
		
	}
}
