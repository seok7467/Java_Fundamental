package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		
		/* 
		 * 달력만들기
		 * 1. 1년1월1일 일요일
		 * 2. 1년은 365일, 윤년일때는 366일(2월29일)
		 * 3. 윤년은 4년마다 발생하고, 그중에는 100의 배수는 제외하고, 400배수는 제외하지 않는다.
		 * 4. 2020년 5월 12일은 무슨요일인가?
		 * 5. 2019년까지 총일수 + 4월까지 총일수 + 12 더해서 7로 나눈 나머지가 1이면 일요일, 2이면 월요일.....
		 * 
		 * (2019*365 +(2019/4-2019/100+2019/400)+31+29+31+30+12)%7
		 *  
		 *  */
		
		int year=2020;
		int month=5;
		int day=13;
		int rest=0;
		String message=null;
		int m1=31,m2=28,m2_윤년=29,m3=31,m4=30,m5=31,m6=30,m7=31,m8=31,m9=30,m10=31,m11=30,m12=31;
		int totalDay=(year-1)*365 +((year-1)/4-(year-1)/100+(year-1)/400);
		
		
		if(year%400==0||(year%100!=0&&year%4==0)) {
			switch(month){
			case 1:rest=(totalDay+day)%7;break;
			case 2:rest=(totalDay+m1+day)%7;break;
			case 3:rest=(totalDay+m1+m2_윤년+day)%7;break;
			case 4:rest=(totalDay+m1+m2_윤년+m3+day)%7;break;
			case 5:rest=(totalDay+m1+m2_윤년+m3+m4+day)%7;break;
			case 6:rest=(totalDay+m1+m2_윤년+m3+m4+m5+day)%7;break;
			case 7:rest=(totalDay+m1+m2_윤년+m3+m4+m5+m6+day)%7;break;
			case 8:rest=(totalDay+m1+m2_윤년+m3+m4+m5+m6+m7+day)%7;break;
			case 9:rest=(totalDay+m1+m2_윤년+m3+m4+m5+m6+m7+m8+day)%7;break;
			case 10:rest=(totalDay+m1+m2_윤년+m3+m4+m5+m6+m7+m8+m9+day)%7;break;
			case 11:rest=(totalDay+m1+m2_윤년+m3+m4+m5+m6+m7+m8+m9+m10+day)%7;break;
			case 12:rest=(totalDay+m1+m2_윤년+m3+m4+m5+m6+m7+m8+m9+m10+m11+day)%7;break;
			
			}
		}
		else {
			switch(month){
			case 1:rest=(totalDay+day)%7;break;
			case 2:rest=(totalDay+m1+day)%7;break;
			case 3:rest=(totalDay+m1+m2+day)%7;break;
			case 4:rest=(totalDay+m1+m2+m3+day)%7;break;
			case 5:rest=(totalDay+m1+m2+m3+m4+day)%7;break;
			case 6:rest=(totalDay+m1+m2+m3+m4+m5+day)%7;break;
			case 7:rest=(totalDay+m1+m2+m3+m4+m5+m6+day)%7;break;
			case 8:rest=(totalDay+m1+m2+m3+m4+m5+m6+m7+day)%7;break;
			case 9:rest=(totalDay+m1+m2+m3+m4+m5+m6+m7+m8+day)%7;break;
			case 10:rest=(totalDay+m1+m2+m3+m4+m5+m6+m7+m8+m9+day)%7;break;
			case 11:rest=(totalDay+m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+day)%7;break;
			case 12:rest=(totalDay+m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+day)%7;break;
		}
		}
		
		
		
		//rest=(2019*365 +(2019/4-2019/100+2019/400)+31+29+31+30+12)%7;
		if (rest==1) {
			message="월요일";
		}
		else if(rest==2) {
			message="화요일";
		}
		else if(rest==3) {
			message="수요일";
		}
		else if(rest==4) {
			message="목요일";
		}
		else if(rest==5) {
			message="금요일";
		}
		else if(rest==6) {
			message="토요일";
		}
		else if(rest==0) {
			message="일요일";
		}
		System.out.println(year+"년 "+month+"월 "+day+"일은 "+message+"입니다.");
		
		
	}
}


