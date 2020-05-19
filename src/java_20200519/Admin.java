package java_20200519;

public class Admin {

	private String id;
	private String pwd;
	private String email;
	private int level;
//	디폴트 생성자 //다른 생성자 있으면 이거 만들어줘야됨
//	alt+shift+s > c
	public Admin() { //private하면 외부에서 객체 생성 안됨(아주 드문경우)
		super(); //모든 생성자의 첫 라인에는 super가 숨어있다. 부모 클래스의 default생성자 호출한다.
	}
	
//	생성자(Constructor), 주로 멤버변수 밑에 선언한다
//	생성자는 반환값이 없고, 이름은 클래스 이름과 동일
//	생성자의 역할은 인스턴스 변수 초기화
//	alt+shift+s > o
	public Admin(String id, String pwd, String email, int level) { //void 붙이면 함수
		super();
		this.id=id;
		this.pwd=pwd;
		this.email=email;
		this.level=level;
	}
	
	public Admin(String id, String pwd, String email) {  //overloading 가능
//		super(); 
//		this.id=id;
//		this.pwd=pwd;
//		this.email=email;	   //자기자신 객체=>this. 다른 생성자 호출=>this(~,~,,,,)
		this(id,pwd,email,0);  //다른 생성자를 호출할 때 씀, 반드시 생성자에서만 호출가능
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getPwd() {
		return this.pwd;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setLevel(int level) {
		this.level=level;
	}
	public int getLevel(){
		return level;
	}
	
	
}
