package java_20200521;

public class ImplementsClassDemo {
	public static void main(String[] args) {

		InterA i = new Implements();
		
		i.mA();
		
		i.mB();
		
		i.mC();
		//인터페이스에 있는 변수는 변경 불가  이유: final변수
		//Inter.PI = 3.14;
		
		System.out.println(InterA.PI);
	}
}
