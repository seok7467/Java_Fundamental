package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		//1. char은 유니코드, 문자, 아스키코드 3가지 방법으로 표현 가능
		//48-57 : 0~9
		//65-90: A~Z
		//97-122: a~z
		//
		
		
		//2.  ',",\ 문자 인식시킬 떄 앞에 \붙이면 된다.
		String d="\"";
		System.out.println(d);	
		
		//3. \t는 tab, \n, \r은 엔터
		String f="asd"+"\n"+"sadas";
		System.out.println(f);
		
		
	}
	}
