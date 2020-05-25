package java_20200525;

public class ThrowDemo {

//	1. 예외 발생
//	2. 예외 클래스 생성
//	3. throws
//	4. try catch

	public static double withdraw(String account, int amount)
			throws IncorrectAccountException, InsufficientBalanceException {
		double myBalance = 10_000;
		String myAccount = "123-123-123";

		if (myAccount.equals(account)) {
			if (myBalance - amount >= 0) {
				myBalance -= amount;
			} else {
				// 예외발생
				throw new InsufficientBalanceException("잔고가 부족합니다.");
			}

		} else {
			// 예외를 개발자가 임의로 발생
			throw new IncorrectAccountException("잘못된 계정입니다.");
		}
		return myBalance;
	}

	public static void main(String[] args) {

		double balance = 0;

		try {
			balance = withdraw("123-123-123", 1_000);
			System.out.printf("잔고: %f%n", balance);
		} catch (IncorrectAccountException e) {
			System.err.println(e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}

	}
}
