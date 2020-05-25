package java_20200525;

public class ThrowsDemo {

	public static int getDivide(int first, int second) throws ArithmeticException {
		int result = first / second; // 예외 발생 코드
		return result;
	}

	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);

			int result = getDivide(first, second);
			System.out.printf("결과: %d%n", result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력하세요ㅗ");

		} catch (NumberFormatException e) {
			System.err.println("인자에는 숫자넣어ㅓ");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");

		} finally {
			System.out.println("finally");
		}
		
		System.out.println("끝");
	}
}
