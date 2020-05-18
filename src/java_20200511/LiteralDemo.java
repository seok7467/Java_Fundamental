package java_20200511;

public class LiteralDemo {

	public static void main(String[] args) {
		// 1. 10진수(124)8진수(076)16진수(0x213)2진수(0d1010)

		// 2. long 리터럴은 숫자뒤에 L or l 추가(추가 안해도 에러 안뜸)(게임에서 21억 이상이면 가끔 에러뜨는 경우 int형 쓴거임)
		long l1 = 12l;
		System.out.println(l1);

		// 3. float은 숫자뒤에 F or f 추가( 추가 안하면 double로 인식해서 에러뜸)
		float f1 = 123.56f;

		// 4. double 리터럴은 숫자뒤에 d or D 추가 생략가능 (용량 문제 없으면 왠만하면 int형 아니면 double형 쓰자~)
		double d1 = 123.56;

		// 5. 산술연산하면 int로 바뀜, byte형 그대로 쓰려면 형변환 하면됨
		byte b1 = 100;
		byte b2 = 100;
		byte b3 = (byte) (b1 + b2);

		// 6. int 오버 플로우는 최솟값으로 넘어가는데 byte는 오류뜨고 안넘어감
		// 오류 뜨는 게 정상
		int high = Integer.MAX_VALUE;
		int overflow = high + 1;
		System.out.println(overflow);

		// 7. 만약에 byte형 오버플로우 찾고싶으면
		byte b = 127;
		byte oldb = b;
		b++;
		if (b < oldb) {
			System.out.println(b);
		}

	}
}
