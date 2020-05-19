package java_20200519;
import java.lang.*; //숨겨져 있음
public class SuperDemo extends Object{

	public SuperDemo() { //디폴트 생성자는 클래스 접근한정자 따라감.
		super();
	}

}

class A extends Object{
	A(){} //default생성자 는 항상 만들어주는 습관을 가지는게 좋다.
	
	A(int a){ //생성자가 만들어져 있어 default 생성자가 자동으로 생성되지 않음. default 생성자 없으면 에러.
		
	}
	
}


class B extends A{
	
}












/* class A extends Object{

	A() {
		super();
	}
	
}

class B extends A{
	B(){
		super();
	}
}
*/