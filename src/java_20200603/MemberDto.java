package java_20200603;

//MEMBER 테이블의 데이터를 관리하기 위한 클래스
//Member 테이블의 컬럼(num, name, addr)을 멤버변수로 정하면됨
//DTO: Data Transfer Object
public class MemberDto {

	private int num;
	private String name;
	private String addr;

	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
