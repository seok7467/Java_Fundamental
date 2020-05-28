package java_20200528.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {

	private String ip;
	private int port;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		Socket socket = null;

		try {
			// 3. Socket 객체를 생성하여 서버와 연결을 시도한다;
			socket = new Socket(ip, port);

			// 4. Socket 객체로 출력 스트림을 생성하여 서버로 메시지를 보낸다;
			OutputStream out = socket.getOutputStream(); // 1바이트;
			// stream chain;
			OutputStreamWriter osw = new OutputStreamWriter(out); // 2바이트;
			// stream chain;
			BufferedWriter bw = new BufferedWriter(osw);

			
			bw.write("안녕하세요1 .");
			
			bw.newLine();
			bw.write("안녕하세요2 .");
			bw.flush();
			
//			bw.write("안녕하세요2 .");
//			bw.newLine();
//			bw.flush();
			
			
			// 7. Socket 객체로 입력 스트림을 생성하여 서버 메시지를 읽는다.;
			InputStream in = socket.getInputStream();
			// stream chain
			InputStreamReader isr = new InputStreamReader(in);
			// stream chain
			BufferedReader br = new BufferedReader(isr);

			String readLine = br.readLine();

			System.out.println("서버 메시지: " + readLine);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new EchoClient("192.168.0.135", 3000).run();

	}

}
