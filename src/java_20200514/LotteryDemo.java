package java_20200514;

public class LotteryDemo {

	public static void main(String[] args) {
		// 로또복권
		// 1. 1부터45까지의 숫자 중 임의 숫자 6개 생성한다.
		// 2. 6개의 숫자중 중복된 숫자가 나오면 안된다.
		// Math.random()=>0보다 크거나 같고 1보다 작은 양수를 double값으로 변환한다.

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
//			int sum = 0;
			int random = (int) (Math.random() * 45) + 1;

			/*
			 * // 중복되는 값이 있는지 체크 방법1 for (int j = 0; j < lotto.length; j++) { if (lotto[j]
			 * == random) { sum += 1; }
			 * 
			 * } if (sum == 0) { lotto[i] = random; } else { i--;
			 * 
			 * }
			 */

			// 중복체크 방법2
			/*
			 * for(int i=0;i<lotto.length;i++) { for(int j=0;j<i;j++) {
			 * while(random==lotto[j]) { random = (int) (Math.random() * 45) + 1; } }
			 * 
			 * }
			 */
			
			
			// 중복되는 값이 있는지 체크 방법3
			boolean isExisted = false;

			for (int j = 0; j < i; j++) {
				if (lotto[j] == random) {
					isExisted = true;
					break;
				}
			}
			if (!isExisted) {
				lotto[i] = random;
			} else {

				i--;
			}

		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				/// 내림차순
				if (lotto[j] < lotto[j + 1]) {
					int temp = lotto[j + 1];
					lotto[j + 1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		for (int temp : lotto) {
			System.out.println(temp);

		}
	}
}
