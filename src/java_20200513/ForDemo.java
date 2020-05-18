package java_20200513;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
	
		System.out.printf("1부터 10까지 합은 %d 입니다%n", sum); //printf %d는 숫자, %n은 엔터

		int sumodd = 0;
		int sumeven = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sumeven += i;
			} else if (i % 2 == 1) {
				sumodd += i;
			}
		}

		System.out.printf("1부터 10까지 짝수합은 %d 입니다%n", sumeven);
		System.out.printf("1부터 10까지 홀수합은 %d 입니다%n", sumodd);
		
		
		/*
		 * for (int i = 2; i <=9; i++) { for (int j = 1; j <=9; j++) {
		 * System.out.printf("%d*%d=%d%n",i,j,i*j); }
		 * 
		 * }
		 */
		
		
		/*9단~ 2단까지
		
		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);
			}
			
		}
		*/
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		/*
		 * for (int i = 1; i <=5; i++) { System.out.println(i); }
		 */
	}

}
