package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {

		PrintStream monitor = System.out; // 출력 장치와 연결된 PrintStream
//		monitor.println("HelloWorld");

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;

		try {
			fis = new FileInputStream("c:\\dev\\123.txt");
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream("c:\\dev\\123_123.txt");
			bos = new BufferedOutputStream(fos);
			// file과 연결된 PrintStream
			ps = new PrintStream(bos, true); // true =>autoFlush

			long start = System.currentTimeMillis();
			int readByte = 0;
			while ((readByte = bis.read()) != -1) {

				// ps.print(readByte); 버퍼기능이 없어서 속도가 느림 ( 다양한 자료형 출력을 위해 만듦)
				ps.write(readByte);
			}
			long end = System.currentTimeMillis();

			System.out.printf("경과시간 : %d %n", end - start);
//			ps.flush();
			// flush() 생략 가능

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ps != null)
				ps.close();
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
