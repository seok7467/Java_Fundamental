package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\HOffice2020_Viewer.exe");

			fos = new FileOutputStream("c:\\dev\\HOffice.exe");

			int readByte = 0;
			//fis.read() : 한바이트 읽어 변환한다. 더이상 읽을 바이트가 없으면 -1을 반환한다.
			while ((readByte = fis.read()) != -1) {
				//fos.write(~) : 한 바이트 쓰기
				fos.write(readByte);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
