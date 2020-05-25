package java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
		// File 클래스
		// 1. 디렉토리 생성(v)
		// 2. 파일 크기(v), 이름, 경로, 날짜
		// 3. 파일 생성, 삭제(v)
		// 4. 파일 이름 바꾸기(v)
		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if (success) {
			System.out.println("디렉토리를 생성했습니다.");

		} else {
			System.out.println("이미 디렉토리가 있습니다.");
		}

		File f2 = new File("C:\\dev\\HOffice2020_Viewer.exe");

		long fileSize = f2.length() / 1024;
		System.out.println(fileSize);

		String fileName = f2.getName();

		System.out.println(fileName);

		String path = f2.getPath();
		System.out.println(path);

		if (fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");

		} else if (fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");

		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일");
		}

		long lastModified = f2.lastModified();
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

		String date = sdf.format(c.getTime());

		System.out.println(date);

		File f3 = new File("C:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}

//		f3.delete();

		File f4 = new File("c:\\dev\\HelloWorld.java");

		f3.renameTo(f4);

	}

}
