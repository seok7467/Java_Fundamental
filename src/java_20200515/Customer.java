package java_20200515;

//Customer class
public class Customer {

	// 클래스의 멤버 변수 - instance 변수(아무것도 안붙은 변수,값이 각자 다른것)
	// ,static 변수(값이 공통으로 변함,ex>이자율), final 변수

	// 인스턴스 변수(name, email, phone, balance, isReleased)
	// 객체가 생성될 때만 만들어지는 변수(인스턴스 변수)

	// public : 다른 패키지 가능
	// protected: 상속가능한 경우 가능
	// default(""): 같은패키지 까지 가능
	// private :같은 클래스만 가능
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	// 상수는 대문자로 쓴다.(관례)
	// 상수는 한 번 정해지면 값을 변경할 수 없음으로 일반적으로 static과 같이 사용한다.
	public static final String BANKNAME = "신한은행";

}
