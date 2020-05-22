package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// import 필요
		// hashset 객체 중복 허용 하지 않음. 순서x ,

		// 1.선언
		//<>:generic :특정 컬렉션에 대입되는 객체를 명시
		HashSet<Integer> set = new HashSet<Integer>();

		// 2.할당
		// integer는 equlas 오버라이딩 되어있음
		set.add(1); // auto Boxing
//		set.add("1");
		set.add(3);
		set.add(4);
		set.add(1);

//		System.out.println(set.size());
		// 3. 출력
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}

		
		HashSet<Customer> set1=new HashSet<Customer>();
		set1.add(new Customer("지원자1"));
		set1.add(new Customer("지원자2"));
		set1.add(new Customer("지원자3"));
		set1.add(new Customer("지원자1"));
		System.out.println("size : "+ set1.size());
		
		
		//로또 복권 - HashSet
		
		//TreeSet =객체의 중복을 허용하지 않음, 오름차순 정렬해줌
		TreeSet<Integer> lotto=new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random()*45)+1;
			lotto.add(random);
			if(lotto.size()==6) break;
			
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+"\t");
		}
	}
	
	
}
