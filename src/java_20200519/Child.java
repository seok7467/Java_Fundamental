package java_20200519;

public class Child extends Parent {

	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	//[중요]overloading overriding 생성규칙
	@Override
	public void play(String starcraft) { //public void playxxxx <= 하지말고
		//super.play(starcraft);
		System.out.println("Child play()");
	}
	
	
	public void setParentMoney(int money) {
		super.money=money;
	}
	public int getParentMoney() {
		return super.money;
	}
}
