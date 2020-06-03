package test;

public class Test {

	public static void main(String[] args) {
		int i = 1;
		int j= 2;
		while(i<9) {
			
			while(j<9) {
				System.out.println(i*j);
				j++;
			}
			
			i++;
		}
		
	}
}
