///////////////////////////
//        HOMEWORK       //
//   1~100까지 소수구하기        //
///////////////////////////


//방법: 1부터 x까지 %(나머지구하기)을 했을 때 0이 나온 횟수가 2번이면 소수임을 이용 



package java_20200514;

public class Homework {
	public static void main(String[] args) {
		int input = 100; // 마지막 정수
		System.out.printf("1~%d까지 소수: ", input);
		for (int i = 2; i <= input; i++) { // 1부터 마지막 정수까지 for loop
			int count = 0; // 나머지가 0일 경우를 count하는 변수
			for (int j = 1; j <= i; j++) { // 1부터 자기자신까지 %(나머지)연산
				if (i % j == 0) {
					count += 1; // %결과가 0일경우 count
				}
			}
			if (count == 2) { // count가 2이면 1과 자기자신으로밖에 안나눠짐 =>소수
				System.out.printf("%d ", i);
			}
		}
	}
}
