package java_20200512;

public class SwitchDemo {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		String season=null;
		//month => 수식(char, byte, int, String)
		switch(month) {
		//case 평가값은 반드시 유일해야 함.
		case 12:  //12면 break가 없어서 밑으로 내려오기 때문에 겨울이 입력됨
		case 1: 
		case 2: season="겨울";break;
		case 3: 
		case 4: 
		case 5: season="봄";break;
		case 6: 
		case 7: 
		case 8: season="여름";break;
		case 9: 
		case 10: 
		case 11: season="가을";break;
		
		//default의 위치는 어디 있든 상관없음.
		//마지막 문장에 있으면 break 문을 사용하지 않지만 다른 곳에 있으면 사용해야 한다.
		default: season="없는 계절";//break;
		}

		
		System.out.println(month+"월은 "+season+"입니다.");
	}
}
