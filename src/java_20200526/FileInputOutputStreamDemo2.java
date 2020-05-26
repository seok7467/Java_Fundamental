package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\dev\\HOffice2020_Viewer.exe");
			fos = new FileOutputStream("C:\\dev\\HOffice2.exe");

			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 210];

			
			long start = System.currentTimeMillis();
			// fis.read(readBytes) : FileInputStream에 8192바이트를 읽어서
			// readBytes에 저장하고 읽은 바이트수를 반환한다.
			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
			long end=System.currentTimeMillis();
			
			System.out.printf("경과시간 : %d %n",end-start);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
