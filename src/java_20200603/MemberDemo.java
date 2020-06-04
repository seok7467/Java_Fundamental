package java_20200603;

import java.util.ArrayList;

public class MemberDemo {

	public static void main(String[] args) {
		MemberDao mado = new MemberDao();
		int num=1;
		String name="택진1";
		String addr = "한국2";
		
		//MemberDto m = new MemberDto(num,name,addr);
		/*
		int result = mado.insert(new MemberDto(num,name,addr));
		
		if(result==1) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("실패");
		}
		*/
		
		/*int result = mado.update(new MemberDto(num,name,addr));
		
		if(result==1) {
			System.out.println("업데이트 성공");
		}else { 
			System.out.println("실패");
		}
		*/
		/*
		int result = mado.delete(num);
		
		if(result==1) {
			System.out.println("삭제 성공");
		}else { 
			System.out.println("실패");
		}
		*/
		
		ArrayList<MemberDto> list = mado.select();
		for(int i=0;i<list.size();i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d %s %s %n",_num,_name,_addr);
		}
		System.out.println("======================================================");
		
		for(MemberDto m :list) {
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d %s %s %n",_num,_name,_addr);
		}
		System.out.println("======================================================");
		
		MemberDto mdto = mado.select(num);
		if(mdto!=null) {
			int _num = mdto.getNum();
			String _name=mdto.getName();
			String _addr=mdto.getAddr();
			System.out.printf("%d %s %s %n",_num,_name,_addr);
		}else {
			System.out.println("회원정보가 없습니다.");
		}
	}
}
