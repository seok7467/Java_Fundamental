package java_20200511;

public class LiterlaDemo {

	public static void main(String[] args) {
		//byte범위 (-128 ~ 127)넘어가면 에러
		/*
		int a1=128;//10진수 표기법
		int a2=076; //8진수 표기법
		int a3=0x123;//16진수 표기법
		int a4=0b1010;//2진수 표기법
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		*/
		
		//Long 리터럴은 숫자뒤에L 또는 ㅣ 추가한다.
		long l1 = 12l;
		
		//float 리터럴은 숫자뒤에 F또는 f추가한다.
		//f안붙이면 double형으로 들어가서 overflow발생
		float f1=123.4f;
		
		
		//double 리터럴은 숫자뒤에 d또는 D로표기, 생략가능
		double d1=123.56;
		
	
		// boolean 리터럴은 true 또는 false
		boolean isExisted = false;
		
		
		//산술연산하면 int로 바뀜
		byte b1=100;
		byte b2=100;
		byte b3=(byte)(b1+b2);
		
		
		System.out.println(b3);
		/*
		 * int 오버플로우는 최솟값으로 넘어가는데 바이트 자료형은 넘어가지 않음
		 * 
		int high = Integer.MAX_VALUE;
		int overflow = high+1;
		
		
		System.out.println(overflow);
		
		
		//byte형 오버플로우 찾기
		byte b=127;
		byte oldb = b;
		b++;
		if(b<oldb) {
		
		System.out.println(b);
			
		}
		*/
	
		
		
	}
}
