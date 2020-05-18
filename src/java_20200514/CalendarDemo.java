package java_20200514;

public class CalendarDemo {

	public static void main(String[] args) {

		/*
		 * 달력만들기 1. 1년1월1일 일요일 2. 1년은 365일, 윤년일때는 366일(2월29일) 3. 윤년은 4년마다 발생하고, 그중에는
		 * 100의 배수는 제외하고, 400배수는 제외하지 않는다. 4. 2020년 5월 12일은 무슨요일인가? 5. 2019년까지 총일수 +
		 * 4월까지 총일수 + 12 더해서 7로 나눈 나머지가 1이면 일요일, 2이면 월요일.....
		 * 
		 * (2019*365 +(2019/4-2019/100+2019/400)+31+29+31+30+12)%7
		 * 
		 */

		int year = 2020;
		int month = 5;
		int day = 14;
		int rest = 0;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int totalDay = (year - 1) * 365 + ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);
		char[] date = { '일', '월', '화', '수', '목', '금', '토' };

		if (year <= 0) {
			System.out.println("잘못된 년입니다.");
			return;
		}
		if (month >= 13 || month < 1) {
			System.out.println("잘못된 월입니다.");
			return;
		}
		if (day >= 32 || day < 1) {
			System.out.println("잘못된 일입니다.");
			return;
		}

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalDay += monthArray[i];
		}

		rest = (totalDay + day) % 7;

		for (int j = 0; j <= 6; j++) {
			if (rest == j) {
				message = date[j] + "요일";
			}
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");

	}
}
