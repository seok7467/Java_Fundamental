package java_20200519;

public class AdminDemo {

	public static void main(String[] args) {
		//new Admin().setId("sdasda"); 한번만 쓸거면 이 코드도 가능
		
		Admin a= new Admin("ads","21332","dsads@sadh.com",1); //객체생성할때 값정하기(생성자 필요)(setter필요없음)
//		a.setId("saddsa");
//		a.setPwd("213231");
//		a.setEmail("asdbhk@adkjs.ksad");
//		a.setLevel(1);
		
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a1= new Admin("saddsa","sdasda","sadda");
		
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
		
	}
}
