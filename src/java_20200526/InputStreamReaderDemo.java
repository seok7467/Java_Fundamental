package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {

		InputStream in = System.in; //표준 입력 장치와 연결(키보드) //1바이트
		InputStreamReader isr = null;
		BufferedReader br = null;
			
		
//		byte[] b= new byte[100];
		try {
			//in.read(b):입력을 기다리고 있고, 키보드 입력중에 enter치면
			//키보드에 입력한 데이터를 b에 저장시킨다.	
			/*
			System.out.print("입력하세요>");				
			
			int readByteCount = 0;//입력을 기다리고 있다.
			while((readByteCount = in.read(b)) != -1){
				String str = new String(b,0,readByteCount);
				System.out.println(str);
				System.out.print("입력하세요>");				
			}
			*/
		
			isr = new InputStreamReader(in);  //1바이트 => 2바이트로 바꿔주는 클래스
			br = new BufferedReader(isr);    //2바이트
			String readLine = null;
			System.out.print("입력하세요>");
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
