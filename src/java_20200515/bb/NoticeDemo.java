package java_20200515.bb;

import java_20200515.aa.Notice;

public class NoticeDemo extends Notice{  
	                  //extends Notice =>부모 클래스인 Notice에서 상속 받기 코드
	public static void main(String[] args) {
		Notice n1=new Notice();
		n1.number=2;//public
		//protected는 서로 다른 패키지일 경우 상속이 아니면 접근 불가
		//n1.title="상속 x";//protected
		
		//default는 같은 package일경우, private는 같은 class일때만 접근 가능
	
		NoticeDemo n2=new NoticeDemo();
		n2.number=3;
		n2.title="자식은 상속 가능"; //protected 접근 성공적
	
	}
}
