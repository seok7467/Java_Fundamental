package java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;

	// year에 대한 setter 메서드
	// setter 메서드를 이용하여 year을 변경한다.
	public void setYear(int year) {
		this.year = year; // this.year은 멤버변수

	}

	// year에 대한 getter 메서드
	// getter 메서드를 이용하여 year을 가져온다.
	public int getYear() {
		return year;
	}

	// this. : 자기자신 객체     this() :다른 생성자 호출
	// 로컬변수와 멤버변수 구분할 때 사용한다. 예)this.year=year
	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount() {

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

	public void print() {

		char[] date = { '일', '월', '화', '수', '목', '금', '토' };

		int totalDay = getCount();

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
