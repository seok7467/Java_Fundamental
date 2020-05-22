package java_20200522;

public class StringMethodDemo {

	public static void main(String[] args) {
		String ssn = "111111-1111118";
		//charAt(int index) : 문자열에서 특정 index에 있는 문자열 반환
		char c = ssn.charAt(0);
		System.out.println(c);
		
		//☆concat(String msg) : 문자열 연결
		ssn = ssn.concat("abcd");
		System.out.println(ssn);
		
		//☆endsWith(String msg): msg문자열로 끝나면 true 아니면 false
		String fileName = "abcd.doc";
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
			
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else {
			System.out.println("일반 파일입니다.");
		}
		
		//☆StartsWith(String msg) : msg 문자열로 시작하면 true 아니면 false
		String url="http://www.naver.com";
		String path = "/news/ssss/do?id=123";
		if(path.startsWith("/news")) {
			System.out.println("뉴스페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		
		//equalsIgnoreCase(String msg):대소문자 구분하지 않고
		//문자열을 비교하여 같으면 true, 아니면 false
		boolean success= fileName.equalsIgnoreCase("abcd.DOC");
		System.out.println(success);
		
		//☆indexOf(String msg): msg문자열의 위치를 반환
		int index = ssn.indexOf("-"); //111111-1111118 0부터 시작
		System.out.println(index);

		//☆lastIndexOf(String msg) : msg문자열의 위치를 마지막에서 시작하여 찾는다.
		//index는 처음부터 msg문자열까지 index반환
		//찾는 값 없으면 -1값 출력
		fileName="abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
		
		//배열의 길이" length, 문자열의 길이 length()
		//trim(): 앞 뒤 문자열 공백 제거
		String dbId="asdasd".trim();
		String userId="asdasd ".trim();
		System.out.println(dbId.equals(userId));
		
		
		//☆substring(int false, int last)
		//first(포함) 부터 second(포함하지 않음)사이의 문자열 추출
		//☆substring(int first)
		//first(포함)보다 큰 모든 문자열 추출
		fileName="abc.abc.abc.abc.doc";
		String first=fileName.substring(0,fileName.lastIndexOf(".")); 
		String last=fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(first);		
		System.out.println(last);		
		
		//first문자열을 second문자열로 변환
		String html = "안녕하세요\n수험번호 52122입니다.\n잘부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		//toUpperCase():대문자로 변환
		String m1 = "hello";
		m1=m1.toUpperCase();
		
		System.out.println(m1);
		
		//toLowerCase() :소문자로 변환
		m1= m1.toLowerCase();
		System.out.println(m1.toString());
		
		//String.valueOf(~) : Primitive data type을 문자열로 변환
		//char을 문자열로 변환할 때 씀 //유일
		char[] c1= {'a','b','c'};
		String msg=String.valueOf(c1);
		
		System.out.println(msg);
		
		//split 문자 쪼개기. 반환은 배열로
		ssn = "111111-1111118";
		
		String[] str = ssn.split("-");
		String ss1=str[0];
		String ss2=str[1];
		
		System.out.println(ss1);
		System.out.println(ss2);
		
		String str2= String.format("%,.2f", 123123123.4567);
		System.out.println(str2);
		//3$ : 문자열 위치 바꿀 때 // ,: 컴마 사용 // 20 : 20자리로 맞춘다 // .2 :소수 2째짜리까지 표시
		str2= String.format("%3$,20.2f %2$,20.2f %1$,20.2f",111111111.1111,2222222.222,333333333.33333333);
		System.out.println(str2);
	}
}
