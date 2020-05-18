package java_20200518;

public class MethodOverloadingDemo {

//	MethodOverloadingDemo 클래스에서는 print 메서드를 4가지로 오버로딩
//	 오버로딩 작성규칙
//	1. 같은 클래스 내에서
//	2. 메서드 이름은 같아야 한다.
//	3. ☆매개변수 갯수가 같으면 자료형이 달라야한다.
//	4. 매개변수 갯수가 달라야한다.
//	5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.
//	[참고]메소드 이름은 동사만쓰고 목적어는 매개변수를 본다.

	public void print(String str) {
		System.out.print(str);
	}

	private void print(int i) {
		System.out.print(i);

	}

	private void print(double d) {
		System.out.print(d);

	}

	private void print(boolean b) {
		System.out.print(b);

	}


	
	// variable arguments (ex. printf)
	// 배열로 받음
	public void test(int... a) {
		for(int temp: a) {
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.print("ads");
		m.print(100);
		m.print(1.2);
		m.print(true);
		
		m.test(1);
		m.test(1,2);
		m.test(1,2,3);
		
	}
}
