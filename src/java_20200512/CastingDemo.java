package java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		//1. byte범위 벗어나면 circuit 발생
		
		byte a=(byte)128;
		
		System.out.println(a);
		
		//2. float double 값을 정수형으로 캐스팅하면 소수점 이하가 잘림
		//두개 동시에 발생하면 cut 발생 후 circuit 진행됨
		
		int b=(int)42.5;
		System.out.println(b);
	}
}
