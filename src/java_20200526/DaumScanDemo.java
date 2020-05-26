package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {
	public static void main(String[] args) throws IOException {

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		fw = new FileWriter("c:\\dev\\daum.html");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw, true);

		URL url = new URL("https://www.daum.net/"); // 네트워크
		InputStream in = url.openStream();

		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
//			System.out.println(readLine); //모니터에 출력
//			bw.write(readLine); //bw
//			bw.newLine();//bw
			pw.println(readLine);  //파일로 출력
		}
//		bw.flush();//bw
	}
}
