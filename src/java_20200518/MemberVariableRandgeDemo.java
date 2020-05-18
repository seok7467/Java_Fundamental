package java_20200518;

public class MemberVariableRandgeDemo {

	String name;
	int age;
	double weight;
	boolean isReleased;
	
	public void methodA(String id) {

//		지역변수는 접근 한장자를 붙일 수 없다.
//		public int test;//에러
		
//		지역변수는 초기화를 하지 않아도 상관없지만, 다른곳에서 연산하면 에러 발생
		int a;
//		int b=a+10;//에러
	}
	
	public static void main(String[] args) {
		MemberVariableRandgeDemo m = new MemberVariableRandgeDemo();

//		멤버변수는 객체를 생성하면 기본값을 갖는다.
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.weight);
		System.out.println(m.isReleased);
		
	}
}


