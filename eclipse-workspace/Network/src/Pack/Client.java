package Pack;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Client extends Application{
	Socket cs; //모든 메소드에서 사용 가능
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10); 
	
		//-------------------
		
		Button btn1 = new Button("접속 버튼");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {

				cs = new Socket();
				try {
					//cs.connect(new InetSocketAddress("localhost",5001));
					cs.connect(new InetSocketAddress("192.168.0.79",5001));
				
				} catch (Exception e) {
					e.printStackTrace();
				}

				
				
			}
		});
		
		Button btn2 = new Button("데이터 전송");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			int count = 0;
			
			@Override
			public void handle(ActionEvent arg0) {
				try {
					OutputStream os = cs.getOutputStream();
					String s = "apple" + count++;
					byte[] data = s.getBytes(); //생략된 건 보류
					os.write(data);
					System.out.println("데이터 보냄");
					
				} catch (Exception e) { e.printStackTrace(); }
							
				
			}
		
		});
		
		
		Button btn3 = new Button("접속 종료");
		btn3.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override public void handle(ActionEvent arg0) { 
	 		try { cs.close(); } catch (Exception e) {e.printStackTrace(); }   }
		
		});
		
		root.getChildren().addAll(btn1, btn2, btn3);
		
		//-------------------
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Client");
		stage.show();
	}
	
	public static void main(String[] args) {
		
		launch();

	}

	

}
