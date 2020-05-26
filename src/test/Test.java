package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("경로");
			fos = new FileOutputStream("경로");

			int readCount = 0;

			byte[] readBytes = new byte[1024 * 8];

			while ((readCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readCount);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			{
				try {
					if (fis != null)
						fis.close();
					if (fos != null)
						fos.close();
				} catch (IOException e) {
						e.printStackTrace();
					// TODO Auto-generated catch block
				}
			}
		}
	}
}
