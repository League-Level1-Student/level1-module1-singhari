package _06_vault;

public class Animals_Crackers {
	public static void main(String[] args) {
		Vault o = new Vault();
		boolean huess = false;
//		int correct = 0;
		for(int i = 0; i<1000001; i++) {
			huess = o.tryCode(i);
			if(huess) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
