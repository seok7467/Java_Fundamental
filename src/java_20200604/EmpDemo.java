package java_20200604;

import java.util.ArrayList;

public class EmpDemo {

	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		int no= 9011;
		String name = "LEE";
		String job = "ANALYST";
		String hireDate=null;
		int mgr = 7788;
		int sal = 2200;
		int comm=0;
		int deptNo = 30;
		
		int resultCount = dao.insert(new EmpDto(no,name,job,mgr,hireDate,sal,comm,deptNo));
		if(resultCount==1) {
			System.out.println("사원이 정상적으로 추가되었습니다.");
			
		}else {
			System.out.println("오류..");
		}
		
		//UPDATE
		no=9011;
		name="LEE";
		job="SALESMAN";
		mgr=7844;
		sal=2222;
		comm=10;
		deptNo=10;
		
		resultCount = dao.update(new EmpDto(no,name,job,mgr,hireDate,sal,comm,deptNo));
		if(resultCount==1) {
			System.out.println("사원이 정상적으로 수정되었습니다.");
			
		}else {
			System.out.println("오류..");
		}
//		
//		//delete
//		resultCount = dao.delete(no);
//		if(resultCount==1) {
//			System.out.println("사원이 정상적으로 삭제되었습니다.");
//			
//		}else {
//			System.out.println("오류..");
//		
//		}
//		
		//select(0,10)
		int start = 0;
		int len=10;
		
		ArrayList<EmpDto> list = dao.select(start,len);
		for(EmpDto dto : list) {
			System.out.printf("%10d %10s %10s %10d %10s %10d %10d %10d",
					dto.getNo(),dto.getName(),dto.getJob(), 
					dto.getMgr(),dto.getHireDate(),dto.getSal()
					,dto.getComm(),dto.getDeptNO());
			System.out.println();
		}
		
//		
//		no=7839;
//		EmpDto dto = dao.select(no);
//		if(dto!=null) {
//			System.out.printf("%10d %10s %10s %10d %10s %10d %10d %10d",
//					dto.getNo(),dto.getName(),dto.getJob(), 
//					dto.getMgr(),dto.getHireDate(),dto.getSal()
//					,dto.getComm(),dto.getDeptNO());
//		}else {
//			System.out.println("회원정보가 없습니다.");
//		}
		
	}
}
