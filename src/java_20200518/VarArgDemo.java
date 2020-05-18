package java_20200518;

public class VarArgDemo {

	public void print(int... a) {
//		a변수는 배열로 처리함.
		int length=a.length;
		
		for(int value:a) {
			System.out.printf("%d ",value);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		VarArgDemo c1 = new VarArgDemo();
		c1.print(1,2,3);
		c1.print(10,20,30);
		c1.print(100,200,300);
		c1.print(1000,2000,3000);
		
	}
}
