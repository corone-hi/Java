package Pack;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class ClientThread extends Thread{
	Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
	try {
		InputStream is = socket.getInputStream();
		byte[] recvData = new byte[512];
		//블로킹 함수 - 여기서 진행 X
		//계속 읽겠다
		while(true) {
			int size = is.read(recvData);
			
			if(size == -1) { //클라이언트 접속이 끊김
				System.out.println("클라이언트 종료");
				break;
			}
			String s = new String(recvData, 0, size);
			System.out.println(s);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

class ConnectThread extends Thread{
	@Override
	public void run() {
		try {
			ServerSocket ss = new ServerSocket();
			System.out.println("메인서버 소켓 생성");
			ss.bind(new InetSocketAddress("192.168.0.22",5001));
			System.out.println("바인딩 완료");
			//ss.accept(); //블로킹 함수 - UI는 무한 반복으로 인식
			Socket socket = ss.accept();
			System.out.println("접속 시도");
			
			ClientThread ct = new ClientThread(socket);
			ct.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class Server extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10); 
	
		//-------------------
		
		Button btn1 = new Button("서버 오픈");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {

				ConnectThread ct = new ConnectThread();
				ct.start();
			}
		});
		
		root.getChildren().add(btn1);
		
		//-------------------
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Server");
		stage.show();
	}
	
	

	public static void main(String[] args) {
		launch();
	}



}
