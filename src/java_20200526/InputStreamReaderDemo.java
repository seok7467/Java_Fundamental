package java_20200526;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamReaderDemo {
	public static void main(String[] args) {

		System.out.println("입력하세요>");
		InputStream in = System.in; //표준 입력 장치와 연결(키보드)
		byte[] b= new byte[100];
		try {
			int readByteCount = in.read(b);
			String str = new String(b,0,readByteCount);
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
