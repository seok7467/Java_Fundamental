package java_20200522;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberManagementDemo {
	private ArrayList<Member> list = new ArrayList<Member>();

	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");
	}

	public String input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();// 키보드에서 입력한 데이터를 반한해준다.
	}

	public void run(String inputData) {
		if (inputData.equals("1")) {
			insert();
		} else if (inputData.equals("2")) {
			update();
		} else if (inputData.equals("3")) {
			delete();
		} else if (inputData.equals("4")) {
			search();
		} else if (inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
		} else {
			System.out.println("없는 메뉴입니다.");
			print();
			String inputD = input("번호를 선택하세요>");
			run(inputD);
		}
	}

	// 1. 아이디를 입력받는다.
	// 2. 이름을 입력받는다.
	// 3. ArrayList에 고객을 추가한다.
	// 4. ArrayList에 있는 모든 고객을 출력한다.
	// 5. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 수 키보드로 입력을 받게 한다.
	public void insert() {
		String id = input("아이디>");
		String name = input("이름>");

		Member m = new Member(id, name);
		list.add(m);

		System.out.println("\n-----List-----");
		for (Member mem : list) {
			System.out.printf("아이디 : %s, 이름: %s %n", mem.getId(), mem.getName());
		}
		System.out.println();

		print();

		String inputData = input("번호를 선택하세요>");
		run(inputData);

	}
	//

//	1.수정할 아이디를 입력받는다.
//	2.ArrayList에 있는 고객정보에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고, ArrayList에 고객정보를 수정한다.
//	   만약, 수정할 아이디가 없으면 "수정할 아이디가 없습니다."메세지를 출력한다. 
//	3. ArrayList에 있는 모든 고객을 출력한다.
//	4. print() 메서드 호출
//	5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void update() {
		String ChoiceId = input("수정할 아이디를 입력하세요>");

		int i = 0;
		// for문 돌려서 입력 ID랑 같으면 수정할 이름 입력받아서 수정
		// 없으면 끝내고 메세지 출력
		for (Member mem : list) {
			String name = mem.getId();
			if (name.equals(ChoiceId)) {
				String inputName = input("수정할 이름을 입력하세요>");
				mem.setName(inputName);
				i++;
			}
		}
		if (i == 0) {
			System.out.println("수정할 아이디가 없습니다.");
		}

		// list출력
		System.out.println("\n-----List-----");
		for (Member mem : list) {
			System.out.printf("아이디 : %s, 이름: %s %n", mem.getId(), mem.getName());
		}
		System.out.println();

		// print()메서드 출력
		print();

		// 번호 선택 메세지 출력
		String inputData = input("번호를 선택하세요>");
		run(inputData);

	}

//	1.삭제할 아이디를 입력받는다.
//	2. ArrayList의 Member 객체중에서 삭제할 아이디를 찾아 있으면 삭제하고, 없으면 "삭제할 아이디가 없습니다." 메세지를 출력한다.
//	3. ArrayList에 있는 모든 고객을 출력한다.
//	4. print() 메서드 호출
//	5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete() {

		String ChoiceId = input("삭제할 아이디를 입력하세요>");
		int i = 0;

		Iterator<Member> iter = list.iterator();
		while (iter.hasNext()) {
			Member name = iter.next();
			String name1 = name.getId();
			if (name1.equals(ChoiceId)) {
				iter.remove();
				i++;
			}
		}
		if (i == 0) {
			System.out.println("삭제할 아이디가 없습니다.");
		}


		// list출력
		
		System.out.println("\n-----List-----");
		for (Member mem : list) {
			System.out.printf("아이디 : %s, 이름: %s %n", mem.getId(), mem.getName());
		}
		System.out.println();

		// print()메서드 출력
		print();

		// 번호 선택 메세지 출력
		String inputData = input("번호를 선택하세요>");
		run(inputData);

	}

//	1. 검색할 아이디를 입력 받는다.
//	2. ArrayList의 Member 객체 중에서 검색할 아이디를 찾아서 있으면 출력하고 없으면"검색된 결과가 없습니다."메세지 출력한다.
//	3. ArrayList에 있는 모든 고객을 출력한다.
//	4. print() 메서드 호출
//	5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void search() {

		String ChoiceId = input("검색할 아이디를 입력하세요>");
		int i = 0;
		// for문 돌려서 입력 ID랑 같으면 출력
//		// 없으면 끝내고 메세지 출력
		for (Member mem : list) {
			String name = mem.getId();

			if (name.equals(ChoiceId)) {
				System.out.printf("아이디 : %s, 이름: %s %n", mem.getId(), mem.getName());
				i++;
			}

		}
		if (i == 0) {
			System.out.println("검색된 결과가 없습니다.");
		}

		// list출력
		System.out.println("\n-----List-----");
		for (Member mem : list) {
			System.out.printf("아이디 : %s, 이름: %s %n", mem.getId(), mem.getName());
		}
		System.out.println();

		// print()메서드 출력
		print();

		// 번호 선택 메세지 출력
		String inputData = input("번호를 선택하세요>");
		run(inputData);

	}

	public static void main(String[] args) {
		MemberManagementDemo m = new MemberManagementDemo();
		m.print();
		String inputData = m.input("번호를 선택하세요>");
		m.run(inputData);
	}

}
