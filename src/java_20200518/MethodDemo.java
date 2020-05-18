package java_20200518;

public class MethodDemo {

//	메서드를 정의
//	boolean은 메서드의 반환값
//	instance 메서드 => public (  ) boolean => 객체생성 필수
//	int year=>매개변수(parameter)
	public boolean isLeafYear(int year) {
//		메서드의 반환값이 boolean이기 때문에 return value의 value도 boolean이어야 한다.
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		return isLeaf;
	}

	public long plus(int first, int second) {
		return (long) first + (long) second;
	}

	public double divide(int first, int second) {
//		리턴값 자료형 하나만 바꿔도 됨
		return (double) first / second;
	}
	
	public void println(String message) {
		System.out.println(message);
	}
	public void println(long message) {
		System.out.println(message);
	}
	public void println(double message) {
		System.out.println(message);
	}
	
	
	
	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				/// 내림차순:   <       오름차순: >
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		
		//객체생성 필수
		MethodDemo m = new MethodDemo();
		
		boolean test=m.isLeafYear(2100); //Argument
		
		if (test){
				m.println("윤년입니다");
		}else {
			m.println("윤년이 아닙니다");
		}
		
		long result = m.plus(100000000, 123123123);
		m.println(result);
		
		double result2=m.divide(12,5);
		m.println(result2);
		
		int[] temp= {1,412,532,532,423,234,324,234,234,4};
		
		for(int value:temp) {
			System.out.print(value+" ");
			
		}
		System.out.println();
		
		int[] result3=m.ascending(temp);
		
		for(int value:result3) {
			System.out.print(value+" ");
		}
		
		
	}
	
}
