package java_20200512;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		
		// b/a하면 인트형이므로 소숫점 잘림
		// (double)b/a하면 casting 되서 소수점도 나옴
		d = b / a;
		System.out.println(d);

		c = a * b;
		System.out.println(c);
		
		
		c=b%a;
		System.out.println(c);
		
		
		int sum=0;
		for(int i=1;i<100;i++) {
			sum+=i;
		
		}
		System.out.println(sum);
		
		a=10;
		b=20;
		
		a++; //a에 1을 더해주는데 대입 후 1 더한다.
		++b; //b에 1을 더해주는데 대입 전 1 더한다.
		
		System.out.println(a);
		System.out.println(b);
		
		c=a++;
		System.out.println(c);

		c=++b;
		System.out.println(c);
		
		a=10;
		b=20;
		d=10.0;
		
		boolean isSuccess=false;
		isSuccess=a>b;
		System.out.println(isSuccess);
		
		isSuccess=a<b;
		System.out.println(isSuccess);
		
		isSuccess=a>=b;
		System.out.println(isSuccess);
		
		isSuccess=a<=b;
		System.out.println(isSuccess);
		
		
		//자료형에 상관없이 값만 같으면 true로 나옴
		isSuccess=a==d;
		System.out.println(isSuccess);
		
		
		a=10;
		b=10;
		
		//앞 논리값이 false이므로 뒤 논리연산은 하지 않음.
		//따라서 a,b 값 변화하지 않음
		isSuccess =(a!=b)&&(++a==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		
		
		//+는 연결연산자(두개중 1개 이상이 문자열), 산술연산자(2개 모두 숫자) 두가지 기능 수행
		System.out.println(1+2+3+"456"); //1,2,3은 산술연산자 그 다음 +는 연결 연산자. 따라서 6456이 됨
		System.out.println("123"+4+5+6); //모든 +가 연결 연산자가 됨. 따라서 123456이 됨.
		
		
		
		
		
	}

}
