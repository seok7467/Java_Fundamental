package java_20200515;

public class CustomerDemo {

	public static void main(String[] args) {
		//클래스 객체 생성
		//Customer => 타입
		//c1=> 변수(레퍼런스)
		//new Customer() => 객체 생성
		Customer c1=new Customer();
		
		c1.name="가가가";
		c1.email="1111@11111.com";
		c1.phone="010-1111-1111";
		c1.balance=1_111_111;
		c1.isReleased=false;
		
		System.out.println(c1.name);
		
		
		Customer c2=new Customer();
		c2.name="나나나";
		c2.email="2222@222.com";		
		c2.phone="010-2222-2222";
		c2.balance=2_222_222;
		c2.isReleased=false;
		
		System.out.println(c2.name);
		
		
		//c2가 가르키는 곳을 c3도 가르킨다.
		//그 값을 변경하면 c2,c3모두 값이 바뀐다.(참조 개념)
		Customer c3=c2;
		
		System.out.println(c3.name);
	}
	
}
