package java_20200515.aa;

public class NoticeDemo {

	public static void main(String[] args) {
		Notice n1 =new Notice();
		n1.number=1;//public
		n1.title="제목";//protected
		n1.hit=100;//default
		//private는 같은 클래스에서만 접근 가능
		//n1.regdate="2020-05-15";//private
	}
}
