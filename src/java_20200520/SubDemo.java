package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.work();
		s1.playBadook();
		System.out.println();

		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work(); // overriding 했음
		s2.age = 20;
		System.out.println(s2.age);
		System.out.println(s1.age);
		s2.playBadook();
		System.out.println();

//		Super s3=new Sub(); //오버라이딩일경우 자식의 메소드 호출 //추상클래스일경우 사용, 추상클래스는 new 불가

		Super s3 = s2; // s2 가 Sub이지만 s3 타입이 Super이기 때문에 Super를 가리킴
		
		System.out.println(s3.age);
		s3.playBadook();
		s3.work(); // 원래는 자식꺼라 안되는데 overriding해서 됨

		// s3.height; //자식꺼라 안됨
		// s3.playGame() //자식꺼라 안됨
	}

}
