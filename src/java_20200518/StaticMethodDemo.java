package java_20200518;

public class StaticMethodDemo {

	String name;
	static double interestRate;

	public void m1() {
//		instance 메서드에서는 instance변수, static 변수 모두 사용가능
//		instance 메서드에서는 instance 메서드, static 메서드 모두 호출 가능
		this.name = "나인스턴스변수야"; // 일반적으로 this 생략
		StaticMethodDemo.interestRate = 4.2; // 자기자신 클래스 이름 생략 //다른 클래스면 static변수명 필요
		m2(); // 일반적으로 this 생략
		m4(); // 일반적으로 클래스 이름 생략
	}

	public void m2() {
		System.out.println("m2() 인스턴스 메서드 호출");
	}

	public static void m3() {
//		static 메서드에서는 static변수만 사용사능 instance 변수 사용불가
//		static 메서드에서는 static 메서드만 호출가능, instance 메서드 호출불가
//		static 메소드에서는 this 사용 불가.

//		name="나인스턴스변수야"; //에러
		interestRate = 3.9;
//		m2();  //에러
		m4();

// 		instance 변수, 메서드 사용하려면 객체 생성 필요		
		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "미이머";
		m1.m2();
	}

	public static void m4() {
		System.out.println("m() static 메서드 호출");
	}

	//main이 있어야 실행가능
	public static void main(String[] args) {
		m4();
		
		StaticMethodDemo m = new StaticMethodDemo();
		m.m1();
		m.name="hdg";
		

	}
}
