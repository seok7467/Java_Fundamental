package java_20200525;

import javax.print.attribute.standard.MediaSize.Engineering;

public class TryCatchDemo {

	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvg(korean, english);
			System.out.printf("평균 : %f%n", average);
			
		} catch (ArrayIndexOutOfBoundsException e) {
//			일반 출력 System.out 에러 출력 System.err
//			System.err.println("예외 메시지:" + "넣은 값이" + e.getMessage() + "개여서 에러뜸");

//			에러 메시지 상세내역
			e.printStackTrace();
			
//		catch 블럭이 여러개 있을 경우 하위 클래스 => 상위 클래스 순으로 정한다.
		}catch(NumberFormatException e){
			System.err.println("예외 메시지 : "+ e.getMessage());
//			e.printStackTrace();
			
		}finally {
			System.out.println("finally");
		}
	}

}
