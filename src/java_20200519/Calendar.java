package java_20200519;

public class Calendar {
	private int year;
	private int month;
	private int day;

	
	public Calendar(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}

	private int getCount(int year, int month, int day) {

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int totalDay = (year - 1) * 365 + ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);

		if (year <= 0) {
			System.out.println("잘못된 년입니다.");
			System.exit(0);
		}
		if (month >= 13 || month < 1) {
			System.out.println("잘못된 월입니다.");
			System.exit(0);
		}
		if (day >= 32 || day < 1) {
			System.out.println("잘못된 일입니다.");
			System.exit(0);
		}

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalDay += monthArray[i];
		}

		totalDay += day;

		return totalDay;
	}
	
	public void printCalendar(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//2020년 5월 1일의 요일을 구해서 그 전까지는 빈 공백 처리한다. 
		
		int totalDay=getCount(year,month,1);
		int rest= totalDay%7;
		
		for (int i=0;i<rest;i++) {
			System.out.print("\t");
		}
		
		
		for(int i=1;i<=getLastDay(year,month);i++) {
			System.out.print(i+"\t");
			rest++;
			if(rest%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void printCalendarYear(int year) {
		for(int i=1;i<=12;i++) {
			printCalendar(year,i);
		}
	}
	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

			monthArray[1] = 29;
		}
		return monthArray[month-1];
	}

	public void print() {

		char[] date = { '일', '월', '화', '수', '목', '금', '토' };

		int totalDay = getCount(year, month, day);

		int rest = totalDay % 7;

		String message = null;

		for (int j = 0; j <= 6; j++) {
			if (rest == j) {
				message = date[j] + "요일";
			}
		}
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");

	}

	/*
	 * public static void main(String[] args) { Calendar c = new Calendar();
	 * c.set(2020, 5, 18); c.print(); }
	 */
}
