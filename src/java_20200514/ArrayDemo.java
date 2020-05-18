package java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {

		// reference함수는 참조가능

		// 1. 배열 선언 및 생성(a라는 배열에 4개의 배열추가, default값은 0)
		int[] a = new int[4];
		
		// 배열 선언,생성, 할당이 동시에 이루어짐
		int[] b = { 1, 2, 3, 4, 5 };

		// 배열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;

		// 배열출력 for loop
		// 인덱스 추출 가능(장점)
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}

		// 배열 출력=>enhanced for loop
		// 실수 없이 모든 배열 출력 (장점)
//		for (int temp : a) {
//			System.out.println(temp);
//		}
		
		int [] c=a;
		for(int temp:c) {
			System.out.println(temp);
		}

	}
}
