package java_20200515;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "watermelon", "blueberry" };

		String[] temp = new String[6];

		//fruits: 원본배열
		//0: 복사를 시작할 원본배열의 위치
		//temp: 복사할 배열
		//2: 복사될 배열의 시작 위치
		//4: 4개의 요소 복사
		System.arraycopy(fruits, 0, temp, 2, 4);
		
		temp[0]="peach";
		temp[1]="pear";
		
		for(int i=0;i<temp.length;i++) {
			System.out.println("temp["+i+"]: "+temp[i]);
		}
		
		for(String value: temp) {
			if(value=="pear") value="asd";

			System.out.println(value);
		}
		
	}
}
