package Pack01;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*

class Tiger{
	
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	
	}

}


class Aaa{
	void f1() {}
	
}

class Bbb extends Aaa{
	void f2() {}
	
}

class Ccc extends Bbb{
	void f3() {}
	void f4() {}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Ccc t1 = new Ccc();
	
	}

}

*/


//ex89))


public class Hello01 {

	public static void main(String[] args) {
		System.out.println("여기는 헬로우");
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		System.out.println("헬로우 종료");
	}

}
/*//ex88 - 8)

class Tiger extends Thread{
	Hello01 Hello;
	public Tiger(Hello01 Hello) {
		this.Hello = Hello;
	}
	
	@Override
	public void run() {
		System.out.println("스레드 시작");
		System.out.println("스레드 끝");
		
		//btn1.setText("호랑이") //바깥에 있기 때문에 사용 불가 
		
		Platform.runLater(() -> {
			//주입방식으로 사용
			Hello.btn1.setText("호랭이"); 
			Hello.btn2.setText("사자"); 
		});
	
		
	}
}

public class Hello01 extends Application{
	
	//멤버변수
	Button btn1 = new Button("Test"); 
	Button btn2 = new Button("Test"); 
	@Override
	public void start(Stage stage) throws Exception {
		
		HBox root = new HBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10); 
		//-------------------------
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Tiger t = new Tiger(Hello01.this); //전체 던지기
				t.start();
				
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Tiger t = new Tiger(Hello01.this); //전체 던지기
				t.start();
				
			}
		});

		root.getChildren().addAll(btn1, btn2);
		
		//-------------------------
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("🐾");
		stage.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}
*/
/*
//ex88 - 7)

public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox root = new HBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10); 
		//-------------------------
		Button btn1 = new Button("Test");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Test");
//				방법1)
//				Thread t = new Thread() {};
//				t.start();
				
//				방법2)
				new Thread() {
					@Override
					public void run() {
						System.out.println("스레드 시작");
						Platform.runLater(() -> {
							btn1.setText("호랑이");
						});
						System.out.println("스레드 종료");
						
					}
				}.start();
			}
		});

		root.getChildren().addAll(btn1);
		
		//-------------------------
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("🐾");
		arg0.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}*/


/*
//ex88 - 6)

public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox root = new HBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10); 
		//-------------------------
		Button btn1 = new Button("이름");
		Button btn2 = new Button("버튼");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				btn2.setText("아현");
				
			}
		});

		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				//btn1.setVisible(false); //숨기기
				//btn1.setVisible(!btn1.isVisible()); 
				
				//btn1.setDisable(true); //비활성화
				btn1.setDisable(!btn1.isDisable()); 
				
			}
		});
		root.getChildren().addAll(btn1,btn2);
		
		
		//-------------------------
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("🐾");
		arg0.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}
*/
/*
//ex88 - 5)



public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {

		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10); 
		//-------------------------
		Button btn1 = new Button("버튼1");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("클릭");
				
			}
		});
		
		TextArea textArea = new TextArea();
		
		TextField textField = new TextField();
		textField.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.println("앵무새"); //Enter를 칠 때 발생
				String s = textField.getText();
				textField.setText("");
				//System.out.println(s);
				textArea.appendText(s +"\n");
				
			}
			
		
		});
		root.getChildren().addAll(btn1, textField, textArea);
		
		
		//-------------------------
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("🐾");
		arg0.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}*/

/*
//ex88 - 4)

//interface A<T>{
//	void f1();
//	
//}
//
//class Tiger{
//	void f100(A<Integer> tt) {
//		
//	}
//}


public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
//		//즉시 실행 함수 (익명 객체)
//		A<Integer> t = new A<Integer>() {
//
//			@Override
//			public void f1() {
//				// TODO Auto-generated method stub
//				System.out.println("test");
//			}
//			
//		};
//		
//		Tiger tiger = new Tiger();
//		tiger.f100(t);
//		
		HBox root = new HBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10); 
		//-------------------------
		Button btn1 = new Button("버튼1");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("클릭됨..!");
				
			}
		});

		Button btn2 = new Button("버튼2");
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("끝..!");
				
			}
		});
		root.getChildren().addAll(btn1,btn2);
		
		
		//-------------------------
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("🐾");
		arg0.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}*/

/*//ex88 - 3)


public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		//VBox root = new VBox(); //세로 배치
		HBox root = new HBox(); //가로 배치
		
		//크기 설정 (적용 전) - 초기화 역할
		root.setPrefSize(400, 300);
		root.setSpacing(10); //객체 사이에 공간 두기
		//-------------------------
		//배치
//		//방법 1
//		Button btn1 = new Button("버튼1");
//		root.getChildren().add(btn1);
//		Button btn2 = new Button("버튼2");
//		root.getChildren().add(btn2);
//		
		//-------------------------
		//방법 2
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		root.getChildren().addAll(btn1, btn2, btn3);
		

		//실제로 보여질 클래스 안에 눈에 보이지 않는 배치를 등록
		
		//-------------------------
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("🐾");
		//scene으로 등록된 것을 화면에 보여준다.
		arg0.show();//다이얼 로그 창 보여주는 역할
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}*/

/*
//ex88 - 2)


public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		
		//크기 설정 (적용 전) - 초기화 역할
		root.setPrefSize(400, 300);
		//-------------------------
		
		//배치
		

		//실제로 보여질 클래스 안에 눈에 보이지 않는 배치를 등록
		
		//-------------------------
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("🐯호랑이🐯");
		//scene으로 등록된 것을 화면에 보여준다.
		arg0.show();//다이얼 로그 창 보여주는 역할
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}
*/
/*//ex88 - 1)


public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(2);
		arg0.show();//다이얼 로그 창 보여주는 역할
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		System.out.println(1);
		launch(); //블로킹 함수
		System.out.println("Exit"); //창 종료후 실행된다. 
	}

	

}*/
/*
//ex87)


//ex87 Q&A)
//Application >> launch(static) {start()}
//		       >> abstract start()
abstract class MyApp {
	static void launch() {
		// Hello3 h = new Hello3(); 성립은 되는데 쓸 수 없음
		// h.start();
		try {
			Class<?> cls = Class.forName("Pack01.Hello01");	
			Constructor<?> constructor = cls.getConstructor();
			Object obj = constructor.newInstance();
			Method start = cls.getMethod("start", String.class);
			System.out.println(start);
			
			// start 함수 호출
			start.invoke(obj, "호랑이");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		//start();
	}
	abstract void start(String s);
}
public class Hello01 extends MyApp {
	@Override
//	public void start(Stage arg0) throws Exception {
//		arg0.show();
//	}
	public void start(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		System.out.println(1);
		// static이냐? 당연히 static임
		launch(); // 내부적으로 start 호출
	}
}


////Application -> launch(static) {start()}
//public class Hello01 extends Application{
//
//	@Override
//	public void start(Stage arg0) throws Exception {
//		// TODO Auto-generated method stub
//		arg0.show();
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(1);
//		launch(); //static 함수 - 부모가 가지고 있다.
//	}
//
//	
//
//}
*/

/*
//ex86)

public class Hello01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.show();
	}
	
	public static void main(String[] args) {
		System.out.println(1);
		launch();
	}

	

}
*/

/*//ex85)


class Tiger extends Thread{
	public void run() {
		System.out.println(1);
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start();

		Thread t2 = new Tiger();
		t2.start();
		
		Thread t3 = new Thread(){
			public void run() {
				System.out.println(2);
			}
		};
		
		t3.start();
		
		
		new Thread(){
			public void run() {
				System.out.println(3);
			}
		}.start();

		
	}

}*/

/*//ex84-2)

class Lion extends Thread{
	public void run() {
		new Scanner(System.in).nextInt();
		System.out.println("독수리");
	}
	
}


class Tiger extends Thread{
	public void run() {
		Lion t1 = new Lion();
		t1.start();
		new Scanner(System.in).nextInt();
		System.out.println("코끼리");
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start();
		new Scanner(System.in).nextInt();
		System.out.println("호랑이");
		
	}

}
*/


/*//ex84-1)

class Tiger extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이: " + i);
			
			try { Thread.sleep(0); } catch (Exception e) { }
		}
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("코끼리: " + i);
			
			try { Thread.sleep(0); } catch (Exception e) { }
		}
	
	}

}

*/

/*
//ex83)

class Tiger extends Thread{
	//interface 상속
	public void run() {
		System.out.println("thread start");
		System.out.println("call");
		System.out.println("thread end");
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		//①
		t1.start();
		//②
		System.out.println("호랑이");
		
		//①, ②는 동시에 수행된다.
		//무엇이 먼저가 되는지는 전적으로 OS에 달렸다.
		//제어권을 누구에게 주는가
		
	}

}*/


/*//ex82)



class A{
	void start() {
		//System.out.println("Start Call");
		run();
	}
	
	void run() {
		System.out.println("A class Run Call");
		
	}
	
}

class B extends A{
	void run() {
		System.out.println("B class Run Call");
		
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		A t1 = new B();
		t1.start(); //자식에게 없으면 부모한테 정의되어있다.
	
	}

}*/

/*
//ex81)

public class Hello01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random(); 
		int random = new Random().nextInt(100); //다음도 가능

//		System.out.println("숫자를 입력하세요");
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		int num2 = sc.nextInt(); //블로킹 함수
//		System.out.println(num+num2);
		
		for (int i = 0; i < 100; i++) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			System.out.println(num);
			if(num == 999) {
				break;
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");

	}

}*/


/*
//ex80-2
class Book{
	String title;
	String author;
	String publisher;
	int price;
	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	//void showInfo()
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + "]";
	}
	

	
}



public class Hello01 {

	public static void main(String[] args) {
		
		//C
		LinkedList<Book> mm = new LinkedList<>();
		mm.add(new Book("자바를 배운다", "홍길동", "열심히출판사", 100));
		mm.add(new Book("늦잠 자는 법", "게으름", "열심히출판사", 150));
		mm.add(new Book("빅데이터란 무엇인가", "이순신", "열심히출판사", 200));
		mm.add(new Book("남을 돕고 살자", "을지문", "열심히출판사", 350));
		System.out.println(mm.size());
	
		System.out.println("-----------");
		//R
		System.out.println(mm);
		for (Book book : mm) {
			System.out.println(book);
		}System.out.println();
		
		System.out.println("-----------");
		
		//검색 Reading
		Book onebook = mm.get(2);
		System.out.println(onebook);
		
		System.out.println("-----------");
		//U
		mm.set(1, new Book("일찍 일어나는 법", "부지런", "열심히출판사", 150));
		for (Book book : mm) {
			System.out.println(book);
		}System.out.println();
	
		System.out.println("-----------");
		//D
		mm.remove(3);
		for (Book book : mm) {
			System.out.println(book);
		}System.out.println();
		
		System.out.println("-----------");
		
		Book findBook = search(mm, "이순신");
		if(findBook != null) {
			System.out.println("찾았다");
			System.out.println(findBook);
		}else {
			System.out.println("저자 없음");
		}
		
	}
	
	//검색을 위한 함수
	static Book search(LinkedList<Book> mm, String name) {
		for (Book book : mm) {
			if(book.author.equals(name)) {
				return book;
			}
		}
		return null;
	}

}
*/
/*
//ex80)


class Tiger{
	
	
}

class Lion<T>{
	T age;
	void setAge(T age) {
		this.age = age;
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Lion<Tiger> t1 = new Lion<>();
	
	}

}
*/


/*
//ex79)

public class Hello01 {

	public static void main(String[] args) {
		LinkedList<Integer> mm = new LinkedList<Integer>(); 
		Random rnd = new Random();
		
		for (int i = 0; i < 20; i++) {
			//mm.add(i*10+i);
			mm.add(rnd.nextInt(100));
		}
		
		mm.add(101);
		mm.add(102);
		mm.add(104);
		mm.add(106);
		mm.add(108);
		System.out.println(mm);
		
		for (int i = 0; i < mm.size(); ) {
			int num = mm.get(i);
			if(num % 2 == 0) {
				mm.remove(i);
			}else { //제거가 안된 경우만 증가
				i++;
			}
		}
		
		System.out.println(mm);
		
	}

}
*/


/*
//ex79)

public class Hello01 {

	public static void main(String[] args) {
		LinkedList<Integer> mm = new LinkedList<Integer>(); 
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		mm.add(101);
		mm.add(102);
		mm.add(104);
		mm.add(106);
		mm.add(108);
		System.out.println(mm);
		
		//제거 이후에 index번호가 새로 조정된다.
		for (int i = 0; i < mm.size(); i++) {
			//짝수 삭제하기
			if(mm.get(i) % 2 == 0) {
				mm.remove(i);
			}
		}
		
		System.out.println(mm);
		
	}

}
*/


/*//ex78)
public class Hello01 {

	public static void main(String[] args) {
		LinkedList<Integer> mm = new LinkedList<Integer>(); 
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		System.out.println(mm);
		
		for (int i = 0; i < mm.size(); i++) {
			if(mm.get(i) == 55) {
				mm.remove(i);
				System.out.println(i + " :Deleted"); 
				break;
			}
		}
		
		System.out.println(mm);
	}

}
*/
/*//ex77)

class Tiger{
	
}


//1. 컬렉션 클래스를 내가 만들 수 있는가? 자료구조! >> C/C++
//2. 이미 제작된 클래스를 잘 사용할 수 있는가?   >> Java ...

public class Hello01 {

	public static void main(String[] args) {
		
		//Tiger t1 = new Tiger();
		LinkedList<Integer> mm = new LinkedList<Integer>(); 
		//(C)RUD + 검색, 정렬
		System.out.println(mm.size());
		mm.add(100);
		System.out.println(mm.size());
		
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		System.out.println(mm.size());
		
		//C(R)UD + 검색, 정렬
		
		//1. 활용도가 떨어진다.
		System.out.println(mm);
		System.out.println(mm.toString()); //위와 동일한 문법
		
		//2. 하나씩 접근하기
		for (int i = 0; i < mm.size(); i++) {
			System.out.print(mm.get(i)*2 + " ");
		}System.out.println();
		
		
		//3. for문의 간략화된 버전 - sugar code
		//forEach
		//data: 실제 데이터 or 인덱스
		//- java에서는 데이터
		for (Integer data: mm) {
			System.out.print(data + " ");
		}System.out.println();
	
		//배열 forEach
		int[] arr = {10, 20, 30};
		System.out.print("배열: " );
		for (int data : arr) {
			System.out.print(data + " ");
		}System.out.println();
		
		//문자열 forEach
		//- Java는 지원 XXXXX
//		String s = "무궁화꽃이피었습니다.";
//		for (char data : s) {
//			
//		}
//		
		
		
		//CR(U)D + 검색, 정렬
		mm.set(5, 99);
		for (Integer data: mm) {
			System.out.print(data + " ");
		}System.out.println();
	
		//CRU(D) + 검색, 정렬
		mm.remove(4);
		for (Integer data: mm) {
			System.out.print(data + " ");
		}System.out.println();
		
		//CRUD + (검색), 정렬
		for (Integer data: mm) {
			if(data == 77) {
				System.out.println("find");
				break;
			}
		}System.out.println();
	
		for (int i = 0; i < mm.size(); i++) {
			Integer value = mm.get(i);
			if(value == 77) {
				System.out.println(i + " :Find"); 
				break;
			}
			if(i == mm.size() - 1)
				System.out.println("Not Found");
		}
		
	}

}
*/


/*
//ex76)

class Tiger{
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}


class Lion{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	
}

class Cat{
	private float data;

	public float getData() {
		return data;
	}

	public void setData(float data) {
		this.data = data;
	}
	
}


//제네릭: 객체를 생성할 때 타입을 정하겠다.
//원시타입 XXX
//원시타입의 성격을 갖는 클래스만 사용가능

//class Dog <U, K>{} //여러개 가능

class Dog <T>{ //<> 이걸 컨테이너라고 부른다
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}




public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.setData(100);
		System.out.println(t1.getData());
		
		Lion l1 = new Lion();
		l1.setData("호랑이");
		System.out.println(l1.getData());
		
		Cat c1 = new Cat();
		c1.setData(3.14f);
		System.out.println(c1.getData());
		
		//제네릭 전달
		Dog<Integer> d1 = new Dog<Integer>();
		d1.setData(100);
		System.out.println(d1.getData());
		
		Dog<Float> d2 = new Dog<Float>();
		d2.setData(100.0f);
		System.out.println(d2.getData());
		//Dog<Float>
		//Dog<Boolean>
	}

}
*/

/*
//ex75)


public class Hello01 {

	public static void main(String[] args) {
		
	
		try {
			
			Reader reader = new FileReader("sample.txt");
			System.out.println(1000);
			//int java.io.Reader.read() throws IOException
			
			
			while (true) { //더이상 읽을게 없으면 -1
				int readData = reader.read();
				if(readData == -1) { //EOF
					System.out.println("끝!");
					break;
				}
				System.out.print((char)readData);
				
				
			}
			
			
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(2000);
	
	}

}*/

/*
//ex74)


public class Hello01 {

	public static void main(String[] args) {
		
	
		try {
			
			Writer writer = new FileWriter("sample.txt");
			
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if(i % 2 == 0)
						writer.write(" O ");
					else
						writer.write(" X ");
				}
				writer.write("\n");
				
			}
		
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}*/

/*//ex74 - 1)

public class Hello01 {

	public static void main(String[] args) {

		System.out.println(1);
		try {
			//open
			//혹시 존재하면 덮어쓴다
			//업케스팅 (부 - 자)
			Writer writer = new FileWriter("sample.txt");
			
			writer.write("apple"); 
			writer.write("\n"); 
			writer.write("호랑이"); 
			
			//close
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(2); //이게 돌아야 정상적으로 돌아가고있다는 것
	
	}

}
*/

/*
//ex73)



public class Hello01 {
	static int m1() {
		return 100;
	}
	
	static void m2(int a, int b) {
		System.out.println("호랑이1");
		if(a > b) {
			System.out.println("호랑이2");
		}else {
			//함수 실행 중단
			return;
		}
		
		//return 만나면 실행 X
		System.out.println("호랑이3");
	}
	
	static void m3(int a, int b) {
		try {
			System.out.println("호랑이1");
			if(a > b) {
				System.out.println("호랑이2");
			}else {
				//함수 실행 중단
				return;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			//return 만나도 실행 O
			System.out.println("호랑이3");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(m1());
		//m2(3, 2);
		//m2(1, 2);
		m3(1, 2);
		
//		try {
//			//System.out.println(2/0);
//			System.out.println(2/1);
//			
//		} catch (Exception e) {
//			System.out.println(1);
//		} finally {
//			System.out.println(2);			
//		}
//		System.out.println(3);			

		
	}

}

*/

/*

//ex72)


class Tiger{
	
	//방법 1)
	void f1(){
		System.out.println("함수 1");
		
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	//방법 2) - 이 함수에서 Exception이 발생한다고 알리기
	//함수를 호출한 쪽에서 throws를 받아준다.
	//Exceprion 떠넘기기!!
	void f2() throws Exception {
		System.out.println("함수 2");
		throw new Exception();
	}
	
	
}

public class Hello01{

	public static void main(String[] args) { 
//	public static void main(String[] args)  throws Exception{ //운영체체로 떠넘기기 가능
		
		Tiger t1 = new Tiger();
		
		//방법 1)
		t1.f1();
		System.out.println("호랑이1");
		
		
		//방법 2)
		//Unhandled exception
		try {
			t1.f2();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("발생");
		}
		
		System.out.println("호랑이2");
		
		//t1.f2(); - 운영체제로 넘기면 에러가 발생 X
		

	
	}

}


*/


/*
//ex71)



public class Hello01 {

	public static void main(String[] args) {
		//Tiger t1 = new Tiger();
	
		int[] arr = new int[3]; // 0 1 2
		System.out.println("호랑이1");
		
		//Exceiption이 발생하면 프로그램이 중단된다!!
		try {
			arr[3] = 10; 
		} catch (Exception e) {
			// Exception이 발생하면 catch 블록으로 들어온다.
			System.out.println("발생");
			//e.printStackTrace();
		}
		
		//Exceiption이 발생하면 프로그램이 중단된다!!
		System.out.println("호랑이2"); 
		//1. ArrayIndexOutOfBoundsException
		//arr[3] = 10; 
		
		//2. ArithmeticException: / by zero
		
		try {
			System.out.println(5/0);
			
		} catch (Exception e) {
			System.out.println("발생");
		}
		
		System.out.println("호랑이3"); 
		
		//3. NullPointerException
		String s = null;
		
		try {
			s.length();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("발생");
		}
		
		System.out.println("호랑이4"); 
		
	
		s = new String("독수리");
		//방어적 프로그래밍
		if(s != null) { //s의 조건에 따라 달라지기에 조건문 사용 (try,catch x)
			s.length();
			
		}
		
	}

}

*/


/*
//ex70) Lambda 함수!!!

interface Aaa{
	void f1();
	
}

interface Bbb{
	void f1(int num);
	
}


interface Ccc{
	int f1();
	
}

interface Ddd{
	String f1(String s, int n);
	
}


public class Hello01 {

	public static void main(String[] args) {
		Aaa t1 = () -> {
			System.out.println(1);
		};
		
		t1.f1();
		
		
		//인수가 있는 Lambda
		Bbb t2 = (num)->{
			System.out.println(num);
		};
		
		t2.f1(100);
		
		//return 값이 있는 Lambda
		Ccc t3 = ()->{
			System.out.println("test1");
			return 200;
		};
		
		System.out.println(t3.f1());
		
		
		//인수, return 둘 다 있는 Lambda
		Ddd t4 = (s, n) -> {
			System.out.println("test2");
			return s + n;
		};
		
		System.out.println(t4.f1("호랑이", 3000));
		
		//리턴코드 1줄만 있는 경우에는 
		//return과 {}를 생략할 수 있다!!
		Ccc t5 = ()->200;
		System.out.println(t5.f1());
		
		Ddd t6 = (s, n) -> s + n;
		System.out.println(t6.f1("맘모스", 4000));
	}

}
*/


/*

//ex69)


interface Tiger{
	void f1();
	
}

class Lion{
	void f1(Tiger t) {
		//함수를 구현하지 않았지만 사용 가능 - 함수가 있다는 의미
		//익명 객체를 받아서 구현 (뭐가 올지 모른다) - 다형성!!
		t.f1(); 
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Lion lion = new Lion();
		//인터페이스는 객체 생성 X 
		//but, 익명 객체를 만들어서 던질 수는 있다
		lion.f1(new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("호랑이");
			}
		}); 
		
		lion.f1(new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("앵무새");
			}
		}); 
		
		
		Tiger t1 = new Tiger() {
			@Override
			public void f1() {
				System.out.println("독수리");
				
			}
		};
		
		//Lambda 함수
		Tiger t2 = () -> {System.out.println("독수리1");};
		
		Tiger t3 = () -> {
			System.out.println("독수리2");
		};
		
		lion.f1(() -> {
			System.out.println("독수리3");
		});
		
	}

}
*/
/*//ex68)

interface Tiger{
	void f1();
	
}

class Lion{
	void f1(Tiger t) {
		//함수를 구현하지 않았지만 사용 가능 - 함수가 있다는 의미
		//익명 객체를 받아서 구현 (뭐가 올지 모른다) - 다형성!!
		t.f1(); 
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Lion lion = new Lion();
		//인터페이스는 객체 생성 X 
		//but, 익명 객체를 만들어서 던질 수는 있다
		lion.f1(new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("호랑이");
			}
		}); 
		
		lion.f1(new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("앵무새");
			}
		}); 
		
	}

}
*/

/*
//ex67)

interface Tiger{
	void f1();
	
}

class Lion implements Tiger{
	public void f1() {
		
	}
}

public class Hello01 {

	public static void main(String[] args) {
		//인터페이스 -> 객체를 생성싵킬 수가 없다.
		//Tiger t1 = new Tiger();
		
		//인터페이스 사용 방법 1 - Lion 클래스를 만들어 놓고 쓰기
		Lion t1 = new Lion();
		Tiger t2 = new Lion(); //부-자 (업케스팅)
	
		//인터페이스 사용 방법 2 - 익명 클래스
		Tiger t3 = new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("호랑이");
			}
		};
		
		t3.f1();
		
		//인터페이스 사용 방법 3 - 즉시 실행 함수, 익명 객체
		new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("앵무새");
			}
		}.f1();
		
		
	}

}*/



/*//ex66-6)



class Baduk{
	Ai ai;
	
	//생성자는 주입(injection)을 받는다.
	Baduk(Ai ai){
		this.ai = ai;
		System.out.println("대국을 시작합니다.");
	}

	void play() {
		ai.play();
	}
	
	void stop() {
		ai.stop();
	}

}


interface Ai{
	void play();
	void stop();
}

//아마존
class AlphaGo implements Ai{
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	
	public void stop() {
		System.out.println("알파고가 점수를 계산합니다.");
	}

}

//MS
class BetaGo implements Ai{
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
	
	public void stop() {
		System.out.println("베타고가 점수를 계산합니다.");
	}
}


public class Hello01 {

	public static void main(String[] args) {
		Baduk baduk1 = new Baduk(new AlphaGo());
		baduk1.play();
		baduk1.stop();
	
		Baduk baduk2 = new Baduk(new BetaGo());
		baduk2.play();
		baduk2.stop();
	}

}


class Aaa{
	Bbb bbb;
	Aaa(Bbb bbb){
		this.bbb = bbb;
	}
	void f2() {
		bbb.f1();
	};
	
}


interface Bbb{
	void f1();
	
}

class Ccc implements Bbb{
	public void f1() {
		System.out.println("의존");
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Aaa t = new Aaa(new Ccc());
		t.f2();
		
	
	}

}



*/


/*

class Baduk{
	
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	//업케스팅 이용
	//다른 클래스가 추가되어도 변경 필요 없다.
	void play(Ai alphaGo) {
		alphaGo.play();
	}

}



//ex66-4)
abstract class Ai{
	abstract void play();
}


//ex66-5)
interface Ai{
	void play();
}
//아마존
class AlphaGo implements Ai{
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

//MS

class BetaGo implements Ai{
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}


public class Hello01 {

	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
		
	}

}
*/

/*//ex66-3)

class Baduk{
	
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	//업케스팅 이용
	//다른 클래스가 추가되어도 변경 필요 없다.
	void play(Ai alphaGo) {
		alphaGo.play();
	}

}

class Ai{
	void play() {
		
	}
}

//아마존
class AlphaGo extends Ai{
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

//MS

class BetaGo extends Ai{
	void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}


public class Hello01 {

	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
		
	}

}*/

/*
	//ex66-2)) 다른 인공지능으로 수정될 때마다 클래스에 함수를 추가해야하는 문제
	
	class Baduk{
	
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play(AlphaGo alphaGo) {
		alphaGo.play();
	}
	
	void play(BetaGo betaGo) {
		betaGo.play();
	}
	}
	
	//아마존
	class AlphaGo{
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	}
	
	//MS
	
	class BetaGo{
	void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
	}
	
	
	public class Hello01 {
	
	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
		
	}
	
	}*/

/*//ex66-1)) 인공지능이 수정된 경우

class Baduk{
	
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play();
		
	}

}
*/
/*
//ex65)) 

//1. 필드 final(값을 초기화 하는 것이 여기가 마지막이다.)
class Tiger{
	//상수화 되어 버린다.(대입을 못받으면 상수이다.)
	//final int num = 10;
	final int NUM; //대문자로 표기
	Tiger(){
		//num = 30; //수정 불가
		//처음에 초기화를 안시킨 상태라면 생성자에서 한 번 대입 가능
		NUM = 30;
	}
	
	void f1() {
		//this.num = 20; //수정 불가
	}
}


//2. 클래스 앞에 final 붙으면 더 이상 상속이 불가능하다
class Aaa{}
final class Bbb extends Aaa{}
//class Ccc extends Bbb{} //상속 X

//class Ddd extends String{} //String은 final 클래스
//class Eee extends Thread{} //Thread는 final 클래스 X 


//3. 함수 앞에 final 붙으면 더 이상 오버라이딩이 불가능하다.
class Fff{
	final void f1() {}
	void f2() {
		f1();
	}
}

class Ggg extends Fff{
	//void f1() {} //오버라이드 X
}



public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		String s;
		//t1.num = 20;
	}

}
*/

/*
//ex64)) 

//업캐스팅과 관련된 문법을 구사하기 위해서
interface ParentsTiger{
	void f1();
}

class Tiger implements ParentsTiger{
	public void f1() {
		
	}
	
}

class Lion implements ParentsTiger{
	public void f1() {
		
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		ParentsTiger t1 = new Tiger();
	
	}

}
*/

/*//ex))63

class Aaa{
	void f1() {}
}

interface Bbb{
	void f2();
}

interface Ccc{
	void f2();
}

class Ddd extends Aaa implements Bbb, Ccc{
	public void f2(){};	
	public void f3(){};
}


@FunctionalInterface
//위 annotation은 인터페이스에 1개의 메소드만 있을 때 사용할 수 있다.
interface Eee{
	void f1();
}
public class Hello01 {

	public static void main(String[] args) {
		String s;
		Thread t;
	}

}
*/

/*//ex))62

abstract class Aaa{
	abstract void f1();
	abstract void f2();
	
}

class Bbb extends Aaa{
	@Override
	void f1() {
		System.out.println(1);
	}
	@Override
	void f2() {
		// TODO Auto-generated method stub
		
	}
	
}




interface Ccc{
	void f1();	// abstract void f1();
	void f2();// abstract void f2();
}

class Ddd implements Ccc{
	public void f1(){};	
	public void f2(){};
}

public class Hello01 {

	public static void main(String[] args) {
		Aaa a = new Bbb();
		a.f1();
		
		//- 추상 클래스는 객체를 생성할 수 없다!!
		//Aaa t = new Aaa();
		
	}

}
*/

/*
//ex))61



public class Hello01 {

	public static void main(String[] args) {
		int num  = 100;
		
		int r1 = num * 3; //num + num + num
		int r2 = 3 * num; // 3 + 3 + ... + 3
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("-------------");
		int test = 6; //   0110 (6) 
					  //  01100 (12) -> << 1
					  // 011000 (24) -> << 2
		
		System.out.println(test << 1); //6 * 2¹
		System.out.println(test << 2); //6 * 2²
		System.out.println(test << 3); //6 * 2³
		System.out.println(test << 4); //6 * 2⁴
		
		System.out.println("-------------");
		int a = 23;
		
//		for (int i = 0; i < 100; i++) {
//			for (int j = 0; j < 100; j++) {
				System.out.println(800 * a);
				//System.out.println((a << 9) + (a << 8) + (a << 5));
				System.out.println((a << 9) | (a << 8) | (a << 5));
				
//			}
//		}
		
	}

}
*/
/*
//ex))60

public class Hello01 {
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);

		while(s.length() < 32)
			s = "0" + s; //문자열 객체가 매번 새로 만들어진다

		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < 7; i++) 
			sb.insert((7 - i) * 4, " ");	
		
		return new String(sb); 
	
	}

	public static void main(String[] args) {
		int n1 = 0x1234abcd;
		
		//- and(&) 연산 -> 내가 원하는 값 얻기
		//앞에 4자리 거르기
		System.out.println(hexaToBinary(n1));
		//마스크(mask)데이터 - 걸러내어주는 역할
		System.out.println(hexaToBinary(0xffff0000));
		System.out.println(hexaToBinary(n1 & 0xffff0000));
		
		System.out.println("--------------");
		//- or(|) 연산 -> 데이터 합성
		//기존의 데이터를 1로 변경시키고 남아있는 데이터는 그대로
		System.out.println(hexaToBinary(n1 | 0xffff0000));
		
		System.out.println("--------------");
		
//		int a = 0xf3;
//		int b = 0x3600;
//		int c = 0xEC0000;
		
		int a = 0x000000f3;
		int b = 0x00003600;
		int c = 0x00EC0000;
		int d = a | b | c;
		
		
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		System.out.println(hexaToBinary(c));
		System.out.println(hexaToBinary(d));
		
		System.out.println("--------------");
		
		
		//범위를 벗어나면 사라져버린다.
		int e = 0x9;
		System.out.println(hexaToBinary(e));
		System.out.println(hexaToBinary(e << 4));
		System.out.println(hexaToBinary(e >> 4));
		
		System.out.println("--------------");
		
		//0000 0000 0000 0000 1010 1011 1100 1101
		//5개의 비트만 알고 싶어요! -> 0 1101 (13)
		//중간의 6비트만 알고 시퍼요! -> 011 110 (30)
		//그 앞의 5비트만 알고 시퍼요! -> 1010 1 (21)
		
		int data = 0xabcd;
		System.out.println(hexaToBinary(data));
		
		// and 연산
		//1)
		//0000 0000 0000 0000 1010 1011 1100 1101
		//0000 0000 0000 0000 0000 0000 0001 1111 
		System.out.println(hexaToBinary(data & 0x1f));
		System.out.println("1)" + (data & 0x1f) );
		
		
		//2)
		//0000 0000 0000 0000 1010 1011 1100 1101
		//0000 0000 0000 0000 0000 0111 1110 0000 
		System.out.println(hexaToBinary(data & 0x7e0));
		System.out.println("2)" + ((data & 0x7e0) >> 5));
		
		//3)
		//0000 0000 0000 0000 1010 1011 1100 1101
		//0000 0000 0000 0000 1111 1000 0000 0000 
		System.out.println(hexaToBinary(data & 0xf800));
		System.out.println("3)" + ((data & 0xf800)>>11));
		
		
		//성립안되는 경우
		//1. 시프트 연산만 하는 경우
		System.out.println(data>>11);
		System.out.println((data & 0xf800) >> 11);
		System.out.println((data & 0x0000f800) >> 11); //정답!!
		//2. 시프트 연산을 먼저 시키고 & 시키는 경우 -> 가독성이 떨어진다
		System.out.println((data >> 11)& 0x1f);
		
		
		System.out.println("--------------");
		
		System.out.println(hexaToBinary(data));
		System.out.println(hexaToBinary(~data));
		
		System.out.println("--------------");
		
		System.out.println(hexaToBinary(data));
		System.out.println(hexaToBinary(0x0000ffff));
		System.out.println(hexaToBinary(data^0x0000ffff));
		
		
	}

}
*/

/*//ex))59 

public class Hello01 {
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
//		System.out.println("-------------");
		//32bits에 해당하는 문자열을 만든다
		while(s.length() < 32) {
			s = "0" + s; //문자열 객체가 매번 새로 만들어진다
		}
//		System.out.println(s.length());
//		System.out.println(s);
		
		//String (불변) -> StringBuffer (가변 수정 가능)
		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb);
		
		//0110 0011 1100 1110 0111 1011 1100 1101
		//StringBuffer -> insert() 함수 제공
		//뒤에서 붙어 끊기 -> 앞쪽부터 넣으면 인덱스가 무효화됨
		for (int i = 0; i < 7; i++) {
			//System.out.println((7 - i) * 4);
			sb.insert((7 - i) * 4, " ");			
		}
		
//		System.out.println(sb);
		
		return new String(sb); 
	
	}

	public static void main(String[] args) {
		int num = 0x63ce7bcd; 
		System.out.println(hexaToBinary(num));
		System.out.println(hexaToBinary(0xab));
		System.out.println(hexaToBinary(123456));
		
		System.out.println("-----------");
		
		int num2 = 100;
		System.out.println(hexaToBinary(num2));
		
		System.out.println(hexaToBinary(0x7fffffff));
	}

}
*/
/*//ex))58 진법

public class Hello01 {

	public static void main(String[] args) {
		int num1 = 100; //10진수
		System.out.println(num1);
		
		int num2 = 0x100; //16진수
		System.out.println(num2); //출력은 10진수
		
		int num3 = 0xABCD;
		System.out.println(num3);
		
		//1자리당 4bits, 8bits = 1byte, int는 4byte 따라서 4자리
		// FF FF FF FF
		int num4 = 0x63ce7bcd; 
		//0110 0011 1100 1110 0111 1011 1100 1101
		
		System.out.println();
		
		//primitive type
		int num;
		
		//정수와 관련된 클래스 -> Integer
		//2진수로 치환
		System.out.println(Integer.toBinaryString(num4));
		
		int num5 = 0xab;
		//10101011 -> 0 생략되어 있다.
		System.out.println(Integer.toBinaryString(num5));
		//0000 0000 0000 0000 0000 0000 1010 1011 (32bit)
		//이렇게 출력하고 싶다! -> ex59
	
	}

}
*/

/*//ex))57



public class Hello01 {

	public static void main(String[] args) {
		String s1 = "무궁화꽃이피었습니다";
		
		
		//함수 원형
		//int java.lang.String.length()
		
		//ex1)- 길이
		System.out.println(s1.length());
		
		//ex2) - index의 값
		System.out.println(s1.charAt(3));
		//결과: 꽃 (index)
		
		//ex3) - 찾았을 때의 위치값
		System.out.println(s1.indexOf("이피었"));
		
		//찾지 못한 경우 - 음수 혹은 -1 값이 리턴된다.
		System.out.println(s1.indexOf("읍니다"));
		
		if(s1.indexOf("섭니다") == -1) {
			System.out.println("검색실패");
			
		}else {
			System.out.println("검색성공");
		}
		
		//ex4) - 
		//String.replace( //클래스를 인수로 받는다
		//CharSequence target, CharSequence replacement
		//)
		
		//★주의 - 원본 데이터를 변경하는가 하지 않는가?
		// - 클래스 제작자의 마음
		String s2 = s1.replace("꽃이", "나무가");
		System.out.println(s1);
		
		//이건 변경된 것이 아니다
	    //1. `s1`의 메모리가 삭제된다.
	    //2. `s1` 메모리를 재할당 받는다.
	    //- 즉 새로운 객체가 만들어지는 것이다.
		//s1 = "호랑이";
		//System.out.println(s1);
		
		System.out.println(s2);
		System.out.println(s1.replace("꽃이", "식물이"));
		
		//ex)5
		System.out.println(s1.substring(3));
		//start ~ end - 1 
		//end - start
		System.out.println(s1.substring(3, 5));
		
		//ex6)
		s1 = "Apple";
		
		//Apple apple AppLe - 단어 개수 셀 때 원형을 통일시키기 위해 사용
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//ex7)
		s1 = " A p p l e  ";
		System.out.print(s1);
		System.out.println(1000);
		
		System.out.print(s1.trim());
		System.out.println(2000);
		
		
	}

}
*/

/*//ex))56



abstract class Aaa{
	
	//- 오버라이딩을 목표로 한다.
	//- 정작 본인을 코드를 작성할 생각이 없다.
	//-  `;` 세미콜론을 찍는 순간 미완성 코드가 된다.
	//- `abstract` 키워드를 사용한다.
	
	abstract void f1();
	
}

class Bbb extends Aaa{
	//- 추상클래스를 상속 받은 클래스는 반드시 코드를 완성시켜야 한다
	@Override
	void f1() {
		System.out.println(1);
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Aaa a = new Bbb();
		a.f1();
		
		//- 추상 클래스는 객체를 생성할 수 없다!!
		//Aaa t = new Aaa();
	
	}

}


*/

/*
//ex))55

class Animal{
	void cry() {}
}

class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("🐯 어흥!");
	}
	
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("😺 나용!");
	}
	
}

class Dog extends Animal{
	
	@Override
	void cry() {
		System.out.println("🐾 멍멍!");
	}
	
}

class Snake extends Animal{
	@Override
	void cry() {
		System.out.println("소리낼 수 없음");
	}
}

class Lion extends Animal{
	@Override
	void cry() {
		System.out.println("🦁 으르렁!");
	}
}


//연동 X, 객체를 인수로 받아서 사용하는 클래서
class Zoo{
	
//	void sound(Tiger t) {
//		t.cry();
//	}
//	
//	void sound(Cat t) {
//		t.cry();
//	}
//
//	void sound(Dog t) {
//		t.cry();
//	}
//	
//	void sound(Snake t) {
//		t.cry();
//	}
	
	//부모로 받기
	//결과는 위와 동일하다!!
	// solid패털 - 개발-폐쇄 원칙
	void sound(Animal t) {
		t.cry();
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.sound(new Tiger());
		zoo.sound(new Cat());
		zoo.sound(new Dog());
		zoo.sound(new Snake());
		zoo.sound(new Lion());
		
	
	}

}

*/

/*//ex))54

class Animal{
	void cry() {
		System.out.println("소리낼 수 없음");
	}
}

class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("🐯 어흥!");
	}
	
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("😺 나용!");
	}
	
}

class Snake extends Animal{
	
	
}

public class Hello01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Tiger t0 = new Tiger();
		Cat t1 = new Cat();
		Snake t2 = new Snake();
		
		for (int i = 0; i < 6; i++) {
			switch(rnd.nextInt(3)) {
			case 0 :
				t0.cry();
				break;
			
			case 1 :
				t1.cry();
				break;
			
			case 2 :
				t2.cry();
				break;
			}		
			
		}
		
		System.out.println("-----------");
		
		Animal[] ani = new Animal[] {new Tiger(), new Cat(), new Snake()};
//		ani[0] = new Tiger();
//		ani[1] = new Cat();
//		ani[2] = new Snake();
		
		//업케스팅을 이용해서 switch를 없앨 수 있다
		for (int i = 0; i < 6; i++) { 
			ani[rnd.nextInt(3)].cry();
			
		}
		
	
		
		
	}

}*/

/*//ex))53

class Animal{
	void cry() {
		System.out.println("소리낼 수 없음");
	}
}

class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("🐯 어흥!");
	}
	
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("😺 나용!");
	}
	
}

class Snake extends Animal{
	
	
}

public class Hello01 {

	public static void main(String[] args) {
		

		
		Animal t1 = new Tiger();
		t1.cry();
		Animal t2 = new Cat();
		t2.cry();
		Animal t3 = new Snake();
		t3.cry();
		
		System.out.println("-----------");
		
		Tiger t4 = new Tiger();
		t4.cry();
		Cat t5 = new Cat();
		t5.cry();
		Snake t6 = new Snake();
		t6.cry();
		
		System.out.println("-----------");
		
//		example
//		String s0, s1, s2, s3;
//		s0 = "호랑이0";
//		s1 = "호랑이1";
//		s2 = "호랑이2";
//		s3 = "호랑이3";
		
		String[] ar = new String[4];
		ar[0] = "호랑이0";
		ar[1] = "호랑이1";
		ar[2] = "호랑이2";
		ar[3] = "호랑이3";
		
		String[] ar2 = new String[] {
				new String("호랑이0"),
				"호랑이1","호랑이2","호랑이3"
				};
		
		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
			
		}
		
		//Test[] br = new Test[4]; //Test를 받기위한 변수 4개가 만들어진것
		//br[0] = nes Test();
		
		Test[] br = new Test[] {new Test(), new Test(), new Test(), new Test()}; 
		
		for (int i = 0; i < br.length; i++) {
				br[i].f1();
			
		}
	}

}

class Test{
	
	void f1() {
		System.out.println(1);
	}
	
}
*/
/*
//ex))52 - 2


class Aaa{
	void f1() {}
	void f3() {
		System.out.println(10);
	}
	void f4() {
		System.out.println(20);
	}
}

class Bbb extends Aaa{
	void f2() {}
	@Override
	void f4() {
		System.out.println(40);
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Aaa t = new Bbb();
		t.f3(); //결과: 30
		t.f4();  //결과: 40
		
		System.out.println("-----------");
		
		Bbb t2 = new Bbb();
		t2.f3(); //결과: 30
		t2.f4();  //결과: 40
	}

}

*/

/*//ex))52 - 1

class Aaa{
	void f1() {}
	
}

class Bbb extends Aaa{
	void f2() {}
	
}



public class Hello01 {

	public static void main(String[] args) {
		//경우의 수
		
		//상속과 관계가 없다.
		Aaa t1 = new Aaa(); // 부모 = 부모
		t1.f1();
		
		
		
		
		//업 캐스팅
		Aaa t2 = new Bbb(); // 부모 = 자식
		t2.f1(); //f2(); 메모리가 있으나 사용을 못하는 것
		
		
		//다운 캐스팅 - Java에서 지원X
		//Bbb t3 = new Aaa(); // 자식 = 부모
		
		
		Bbb t4 = new Bbb(); // 자식 = 자식
		t4.f1();
		t4.f2();
		
	}

}*/

/*//ex))51


//this 생성자는 반드시 위에 와야한다.
class Tiger{
	int num;
	int age;
	
	Tiger(){
		age = 10000; //age는 무조건 10000을 가지게 만든다!
		System.out.println(1);
	}
	Tiger(int a){
		//this(); //기본 생성자가 호출된다.
		num = a;
		System.out.println(2);
	}
	Tiger(int b, int c){
		//this(100); //위에 있는 생성자가 100을 받게 된다.
		this(b*c); //곱한 값을 num에 넣고 싶을 때!!
		System.out.println(3);
		
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger(10);
		Tiger t2 = new Tiger(2, 3);
		
	}

}
*/

/*
//ex))50


class Aaa{
	void f1() {}
	
}

class Bbb extends Aaa{
	void f2() {}
	
}

class Ccc extends Bbb{
	void f3() {}
	void f4() {}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Ccc t1 = new Ccc();
	
	}

}
*/

/*
//ex))49


// 생성자가 호출되는 실행 순서: 

// 부모 -> 자식 (X) 잘못된 해석
// 

class Aaa{ 
	Aaa(){
		System.out.println(1);
		
	}
	
	Aaa(int a){
		System.out.println(3);
		
	}
	
}

class Bbb extends Aaa{ 
	Bbb(){
		//부모 생성자를 콜하는 코드가 생략되었다.
		super(100); //선택적으로 부모 생성자를 생성하기 위해서 사용
		System.out.println(2);
	}
	
	Bbb(int a, int b){
		//부모 생성자를 콜하는 코드가 생략되었다.
		super();
		System.out.println(4);
	}
	
}


public class Hello01 {

	public static void main(String[] args) {
		Bbb b1 = new Bbb();
		Bbb b2 = new Bbb(3, 4);
	
	}

}
*/

/*//ex))48


class Aaa{ //조부
	void f1() {
		System.out.println(1);
	}
	
	
}

class Bbb extends Aaa{ //부모
	void f2() {
		System.out.println(2);
	}
	
	
}

class Ccc extends Bbb{
	
}

class Ddd extends Bbb{
	
}

public class Hello01 {

	public static void main(String[] args) {
		Ccc t1 = new Ccc();
		t1.f1();
	
	
	}

}
*/

/*
//ex))47

class Aaa{ //부모
	void f1() {
		System.out.println(1);
	}
	
	void f3() {
		System.out.println(31);
	}
	
	String f4(int a, int b, String t) {
		return null;
	}
	
	String f5(int a, int b, String t) {
		return null;
	}
	
}

class Bbb extends Aaa{ //자식
	void f2() {
		System.out.println(2);
	}
	
	//오버라이딩
	@Override
	void f3() {
		System.out.println(32);
	}
	
	void f4() { //자식의 것이 아닌 부모의 것을 호출하기위해서 간저적인 방법
		this.f3(); //나의 f3
		super.f3(); //부모의 f3
	}
	
	@Override
	String f5(int a, int b, String t) {
		return "안녕";
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Bbb t1 = new Bbb();
		t1.f1();
		t1.f2();
		t1.f3();
		
		System.out.println("------");
		t1.f4();
		
	
	}

}
*/

/*
//ex))46 - 3


//3. 다른 클래스에 나의 정보를 전달하기 위해서
class Man{
	void f1() {
		Woman w = new Woman();
		boolean result = w.marry(this);
		System.out.println(result ? ":)" : ":(");
	}
	
	String 성격() {
		return "포악";
	}
}

class Woman{
	boolean marry(Man info) {
		String str = info.성격();
		if(str == "포악") {
			return false;
		}else {
			return true;
		}
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Man t1 = new Man();
		t1.f1();
		
		
		//example
		//Controll con = new Controll();
		
		//나를 던진다  (this)
		//con.makeButton(this, "텍스트", "색상");
		//-> this.칠하다();
		
		//void paint(){ //객체 버튼에는 칠하기 함수가 없기 때문에 던진다} 
		
		
	}

}
*/

/*//ex))46 - 2

//2. chainning을 목적으로 한다.
class Tiger{
	//Tiger this; //이것이 생략되어 있다.
	Tiger f1() {
		System.out.println("아침");
		//return null;
		//return new Tiger();
		return this;
	}
	
	Tiger f2() {
		System.out.println("점심");
		return this;
	}
	
	
	void f3() {
		System.out.println("저녁");

	}
	
	
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.f1().f2().f3(); //this가 return 된다. 즉 this, 즉 t1, 따라서 '.'을 사용할 수 있다.
	
		System.out.println("----------");
		
		//코드 인터셉트 불가능
		t1.f1()
		.f1()
		.f2()
		.f3(); //f3은 return없어서 종료
		
		//코드 인터셉트 가능
		t1.f1();
		System.out.println("//끼어들기//");
		t1.f2();
		t1.f3();
	}

}*/

/*//ex))46 - 1

//1. 함수의 전달 인수와 필드를 구분하기 위해서

class Tiger{
	String name;
	int age;
	//Tiger(String name, int age){ //인수를 다르게 잡으면 가독성이 감소
		//name = name;
	//	this.name = name; //필드 = 인수
	//	this.age = age;
	//}
	

	//generator 사용한 코드
	public Tiger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void f1() {
		//System.out.println(name + " " + age);
		//이코드는 암묵적으로 다음을 의미한다.
		System.out.println(this.name + " " + this.age);
	}

	void f2() {
		//f1();
		//이 코드는 암묵적으로 다음을 의미한다.
		this.f1();
	}
	
	void f3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + ", age=" + age + "]";
	}
		
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger("호랑이", 10);
		System.out.println(t1.toString());
	}

}*/

/*
//ex))46


class Lion{}

class Tiger{
	//Lion lion;
	//Tiger t;
	Tiger(){ //모든 클래스는 생성자 코드가 숨겨져있다.
		//this = ?????; //이 코드가 생략되어 있다. - new를 만나면 풀린다.
		//this = t1; //new를 만나면 이렇게 된다. (즉 this와 t1은 메모리를 공유한다!!)
		System.out.println("this.hashCode(): " + this.hashCode());
	} 
	
	//Tiger this; // 모든 클래스는 this 코드가 숨겨져 있다.
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println("t1.hashCode(): " + t1.hashCode());
		Tiger t2 = new Tiger();
		System.out.println("t2.hashCode(): " + t2.hashCode());
	}

}
*/

/*
//ex))45

class Tiger{
	private Tiger() {//객체 생성을 할 수 없다! (not visible)
		
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		//Math m = new Math(); //객체 생성 불가(not visible)
		//m.abs(0);
		//Math.abs(-1); //static이기에 객체 생성하지 않아도 사용 가능
	
		
		Thread.sleep(0);
	}

}
*/

/*//ex))44- 4

class Tiger{
	static int count = 0; //공용 변수
	int num = 0;
	Tiger(){
		count++;
		num++;
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();
		System.out.println("생성된 객체 수는: " + Tiger.count);
		System.out.println("t1.num " + t1.num);
		System.out.println("t2.num " +t2.num);
		System.out.println("t3.num " +t3.num);
	}

}
*/
/*
//ex))44- 3

class Tiger{

	//static 안에서는 static만 사용할 수 있다.
	static void f1() {
		Tiger t = new Tiger();
	}
	
	void f2() {}
	static void f3() {}
	
}

public class Hello01 {
	int n1;
	static int n2;
	void f1() {}
	static void f2() {}
	
	public static void main(String[] args) {
		//f1();
		f2();
		//n1 = 10;
		n2 = 10;
		Hello01 h = new Hello01();
		h.n1 = 10;
		h.n2 = 20;
		h.f1();
	}

}*/

/*
//ex))44- 2


class Tiger{
	int n1;
	static int n2;
	
	//static 안에서는 static만 사용할 수 있다.
	static void f1() {
		//n1 = 100; //멤버 변수는 객체 생성 전에 사용 불가이기 때문에 에러
		n2 = 200;
		//f2(); //멤버 함수는 객체 생성 전에 사용 x
		f3();
	}
	
	void f2() {}
	static void f3() {}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	
	}

}*/

/*//ex44 - 1))

class Tiger{
	
	static void f1() {
		
	}
	
	void f2() {
				
	}
}



//Hello01도 결국 클래스이다!
public class Hello01 {
	
	int age; //따라서 멤버 변수
	
	Hello01(){ //생성자를 사용할 수 잇다.
		
	}
	
	//진입점 (Entry Point)
	//static이 붙음으로서 처음부터 호출이 가능하다
	//main 호출은 OS가 한다.
	public static void main(String[] args) {
		//Tiger t1 = new Tiger();
		//Tiger t2 = new Tiger();
		
	
	}

}*/

/*//ex44 ))

class Tiger{
	
	static int n1; //static 변수
	int n2; //멤버 변수
	
	static void 관제탑() { //static 함수
		System.out.println("콜");
	}
	
	void 날다() { //멤버 함수
		System.out.println("날다");
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger.관제탑(); //객체 생성 전에 사용 가능
		t1.날다(); //객체 생성 전에 사용 불가
		t1.관제탑();
		
		System.out.println(Tiger.n1); //바로 사용 가능
		System.out.println(t1.n2); //객체 생성 후 사용 가능
	
	}

}*/

/*
//ex43))

class Tiger{
	private String name;
	private int age;
	
	String getName() { return name;	}
	void setName(String name) { this.name = name; }
	int getAge() { return age; }
	void setAge(int age) { this.age = age; }
	
	
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	
	}

}
*/

/*
//ex42))

class Tiger{
	//부품취급 (외부에 노출시키는 것을 꺼린다.)
	//클래스 제작자는 사용자가 필드를 알지 못하는 것을 바란다. - 데이터 은닉
	//따라서 함수를 이용하도록 만든다!
	private int age; 
	private int money;
	private String name;
	Tiger(){
		age = 100;
	}
	void f1() { //멤버 함수는 외부에서 필드가 변경된 것을 알지 못한다.
		int sum = money * 10;
		System.out.println(money);
	}
	
	void f2() { 
		
	}
	
	//메소드 은닉
	private void f3() { //f1, f2는 3번을 목적으로 제작되었다.
		f1();
		f2();
	}
	
	//멤버변수 확인 - getter
	int getAge() { 
		return age;
	}
	
	//멤버변수 변경 - setter
	void setAge(int data) { 
		age = data;
	}
	
	void setName(String n) {
		name = n;
	}
	
	String getName() {
		return name;
	}
	
	
	
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		//t1.f1(); //메소드 은닉
		// 멤버필드는 객체를 생성시켜서 
		// 직접 사용하는 것은 거의 불법이다.
		//System.out.println(t1.age);
		//t1.money = 200;
		
		//getter, setter
		t1.setAge(1000);
		System.out.println(t1.getAge());
		
		
	}

}
*/

/*
//ex41))


class Tiger{
	String name;
	int age;
	
	Tiger(){} //사용자가 정의 안하면 자동 생성
	Tiger(int data){ //인수 있는 것을 만들려면 기본 생성자를 적어줘야 한다
		//name = null;
		name = "익명";
		age = data;
	} 
	Tiger(String n, int data){
		name = n;
		age = data;
	}
	void showData() { //멤버 필드 확인용
		System.out.println("name: " + name + " age: " + + age);
		
	}
	@Override
	public String toString() {
		return "Tiger [name=" + name + ", age=" + age + "]";
	}
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger(100);
		System.out.println("t1.name: " + t1.name + " t1.age: " + + t1.age);
		Tiger t2 = new Tiger("홍길동", 20);
		t2.showData();
		
		System.out.println(t1.toString());
		System.out.println(t1);
		
		
		
	}

}

*/

/*//ex40 - 1))

class Tiger{
	
	int age = 10;
	
	Tiger() {
		System.out.println(age);
		age = 20;
	}
	
	Tiger(int data) {
		age = data;
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.age);
		System.out.println("----------");
		
		Tiger t2 = new Tiger(100);
		System.out.println(t2.age);
		Tiger t3 = new Tiger(200);
		System.out.println(t3.age);
		
	}

}
*/

/*
//ex40 - 1))

class Tiger{
	
	int age;//초기화 방법 1) - 실행순서는 먼저 실행
	
	Tiger() {
		System.out.println(1);
		age = 100; //초기화 방법 2) - 나중 실행
	}
	
	Tiger(int data) {
		System.out.println(2);
		age = data;
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.age);
		Tiger t2 = new Tiger(999);
		System.out.println(t2.age);
	}

}


*/

/*//ex39))

//- 사용 목적: 필드 초기화

//- 정확한 명칭은 **생성자 메소드**이다.

//- 함수의 이름은 반드시 클래스 이름과 동일해야 한다.

//- 인수를 전달받을 수는 있지만, `return` 값을 가질 수는 없다.

//- 디폴트(default) 생성자: 인수X

//- 호출은 `new` 키워드를 사용할 때 딱 1번 호출된다.

//  - 프로그래머가 임의로 호출할 수 없다.

//- 함수이기 때문에 오버로딩이 가능하다.


class Tiger{
	//필드
	int age;
	//생성자
	Tiger() {
		System.out.println("생성자 콜");
		age = 100;
	}
		
	//메소드
	
}

public class Hello01 {

	public static void main(String[] args) {
		System.out.println(1);
		Tiger t1 = new Tiger(); //이렇게 생긴 함수 호출하세요!
		System.out.println(2);
		Tiger t2 = new Tiger();
		System.out.println(3);
		
		System.out.println("----------");
		
		for (int i = 0; i < 3; i++) {
			Tiger temp = new Tiger();
			System.out.println(temp.hashCode());
			
			
		}
	
	}

}
*/

/*//ex38-2))


class Tiger{
	
	//사각형 면적
	int getRectangle(int w, int h) {
		return w * h;
	}
	
	//좌표 면적
	int getRectangle(int x1, int y1, int x2, int y2){
		int width = x2 - x1 + 1;
		int height = y2 - y1 + 1;
		return width * height;
	}
	
	int getRectangle(int x){ //정사각형
		return x * x;
	}
	
	//★return 값으로는 구분되지 않는다.
	int test(){
		return 0;
	}
	
	float test(){
		return x * x;
	}
	
	
}


public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.getRectangle(10, 5));
		System.out.println(t1.getRectangle(10, 5, 20, 15));
		System.out.println(t1.getRectangle(25));
	}

}*/

/*
//ex38-1))


class Tiger{
	
	void showMeTheMoney(){
		System.out.println(1);
	}
	
	//1. 인수 전달 개수가 다른 경우 
	void showMeTheMoney(int a){
		System.out.println(2);
	}
	
	void showMeTheMoney(int a, int b){
		System.out.println(3);
	}
	
	//2. 전달 인수 개수가 같더라도 타입이 다른 경우
	void showMeTheMoney(float a){
		System.out.println(4);
	}
	
	void showMeTheMoney(Tiger t){
		System.out.println(5);
	}
	
	void showMeTheMoney(short a){
		System.out.println(6);
	}
	
}


public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.showMeTheMoney();
		t1.showMeTheMoney(10);
		t1.showMeTheMoney(10, 20);
		t1.showMeTheMoney(3.14f);
		t1.showMeTheMoney(new Tiger());
		
		System.out.println("--------------");
		
		float f = 3; //소수점이 붙지 않는 경우는 소수점 + f생략 가능
		t1.showMeTheMoney((float)3); //casting할 바에는 3.0f 붙이기
		t1.showMeTheMoney((short)10); //이런 애매한 경우에는 casting으로 지시
		
	}

}
*/
/*//ex37

class Tiger{
	int number;
	
}

class Lion{
	
	Tiger m1(Tiger bbb) { //bbb = aaa: 공유(참조)
		System.out.println(bbb.number);
		System.out.println("bbb: " + bbb.hashCode());
		return bbb;
	}
}

public class Hello01 {

	public static void main(String[] args) {
		Lion t1 = new Lion();
		//t1.m1(new Tiger());
		Tiger aaa = new Tiger();
		aaa.number = 999;
		System.out.println("aaa: " + aaa.hashCode());
		t1.m1(aaa);
		Tiger ccc = new Tiger();
		ccc = t1.m1(aaa);
		System.out.println("ccc: " + ccc.hashCode());
		System.out.println(ccc.number);
	}

}
*/

/*//ex36

class Tiger{
	int num =  100;
	
	
}

public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println("t1 " + t1.hashCode()); //고유번호 - 1023487453
		
		Tiger t2 = new Tiger();
		System.out.println("t2 " + t2.hashCode()); //고유번호 - 1651191114
		
		//Tiger t3 = null; //고유번호 X (NullPointerException)
		//System.out.println(t3.hashCode());
		
		Tiger t3 = null;
		t3 = t1; //참조 (별명) - 고유번호가 동일하다.
		System.out.println("t1 = t3: " + t3.hashCode()); //1023487453
		System.out.println("t1.num: " +t1.num);
		t1.num = 200;
		System.out.println("t3.num: " +t3.num);
		
		
	}

}
*/

/*
//ex35

class Tiger{
	
}

class Lion{
	void m1(int a, String s, Tiger t, Lion l) {
		if(s != null) { //방어적인 프로그램
			
		}
	}
	
	Tiger m2() {
		return null;
	}
	
	Tiger m3() {
		return new Tiger();
	}
	
	Tiger m4() {
		Tiger t =  new Tiger();
		return t;
	}
	
	Tiger m5(Tiger t) {
		return t;
	}
	
}


public class Hello01 {

	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.m1(10, "호랑이", new Tiger(), new Lion());
		l1.m1(10, null,null,null);//거의 대부분 방어적인 부분 포함
	}
	
}

*/

/*
//ex34


class Tiger{
	//primitive 8가지 + 클래스
	void m1(float a, String s) {
		//System.err.println(a); //에러 형태로 표시(빨간색)
		System.out.println(a + " " + s);
		System.out.println(s.length());
		
	}
	
	String m2() {
		//방법 1)
		//return "호랑이";
		//방법 2)
		String s = "독수리";
		return s;
			
	}
	
	String m3() {
		return null; //우선 에러 피하기
	}
	
	
}


public class Hello01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.m1(3.14f, "호랑이");
		System.out.println("-----------");
		//1
		t1.m2();
		
		//2
		String s = t1.m2();
		System.out.println(s);
		System.out.println("-----------");
		//3
		System.out.println(t1.m2());
		
		System.out.println("-----------");
		//String s2; //선언 - 객체 생성 X
		//s2.length() //생성 후 사용 가능
		
		String s2 = null;//아직 객체가 아님을 명시적으로 표시 
		String s3 = "코끼리";
		
		s3 = null; // null로 변경하면 이제부터 객체 X
	}
	
}
*/
/*//ex33


class Tiger{
	
	
}

public class Hello01 {

	public static void main(String[] args) {

		Tiger t1 = new Tiger();
		
		//문자열을 전문적으로 관리한다.
		//첫글자가 대문자이다. - 클래스이다.
		//내가 만든적이 없다. - Java에서 제공하는 표준 클래스
		//도움을 줄만한 메소드를 아는 것이 중요하다
		String s1  = new String();
		s1 = "호랑이";
		System.out.println(s1);
		System.out.println(s1.length());
		
		//약식 표현 - 클래스를 모르는 상태로 사용할 수 있도록
		String s2 = "앵무새";
		System.out.println(s2);
		System.out.println(s2.length());
		
		Thread t;
		Math m;
	}

}*/

/*//ex32


class Tiger{
	int a, b;
	void showData() {
		System.out.println(a + " " + b);
	}
	
	int add() {
		return a + b;
	}
	
	//인수와 멤버변수의 이름이 중첩된 경우
	void m1(int a, int b) {
		//지역변수(인수)가 먼저 사용된다!
		int result = a + b;
		System.out.println(result);
		//필드의 a, b,를 사용하고 싶은 경우
		//this 키워드
		System.out.println(this.a + this.b);
	}
	
}


public class Hello01 {

	public static void main(String[] args) {

		Tiger t1 = new Tiger();
		t1.a = 10;
		t1.b = 20;
		t1.showData();
		System.out.println(t1.add());
		
		t1.m1(100, 400);
		
	
	}

}
*/

/*//ex31))

class Tiger{
	void f1() {
		System.out.println(1);
	}
	
	void f2() {
		f1();
		System.out.println(2);
	}
	
	void f3() {
		f2();
		System.out.println(3);
	}
	
	// 상호호출 - 무한 호출
	void f4() {
		f5(); 
		System.out.println(4);
	}
	
	void f5() {
		f4();
		System.out.println(5);
	}
	
	//재귀호출 (recursive call)
	//잘쓰면 굉장히 유용하다.
	void f6() {
		f6(); 
		System.out.println(5);
	}
}

public class Hello01 {

	public static void main(String[] args) {

		Tiger t1 = new Tiger();
		t1.f6();
		//t1.f4(); //상호호출
		System.out.println(6);
		
	
	}

}*/

/*//ex30))

class Tiger{
	//리턴이 있다 functionName(){}


	//- return 값이 없다
	void func01(){
		
	}
	
	//- return 값이 있다
	int func02(){
		//return 0; //임시 방편
		System.out.println(1);
		return 100;
	}
	
	//메소드에서 return 키워드를 만나면 함수가 중단된다.
	//어떤 식으로 코드가 진행이 되더라도 return을 만나야 한다.
	int func03() {
		
		if(3 < 2) {
			return 100; //함수 실행 종료
		}else if(false){
			return 200; //함수 실행 종료
		}else {
			System.out.println(1000);
			//return 300;
		}
		
		System.out.println(2000);
		return 100; //함수 실행 종료
		//System.out.println(1000);  //unreached 코드
	}
	
	
	//void 이지만 return 키워드를 사용할 수 있다.
	void func04() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				//break;
				return; //종료를 위해 return 사용 가능
			}
		}
		
		System.out.println("for 중단됨"); // 여기 진행 X
	}
	
	//리턴 값과 인수도 있는 형태
	int func05(int num) {
		//return num*num;
		int result = num*num;
		return result;
	}
	
	
	//return은 다른 곳에 사용하기 위함이다
	int func06(int num) {
		return num*num;
	}
	
	//약속 
	//-1이 return 된 경우는 음수인 경우이다.
	//1 ~~설명
	int func07(int num) {

		if(num < 0) {
			//System.out.println("음수입니다.");
			return -1;
		}
		
		if (num %2 == 0) {
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}
		
		return 1;
		
	}

}


public class Hello01 {

	public static void main(String[] args) {
		
		Tiger t1 = new Tiger();
		
		//1. 외면
		t1.func02();
		
		//2. 받은 값을 사용
		int num = t1.func02();
		//int num = 100; //호출이 끝나면 이 상태가 된다.
		System.out.println(num);
		
		System.out.println("-------------");
		
		//3. 출력 결과에 사용
		System.out.println(t1.func02());
		//System.out.println(100);
		
		System.out.println("-------------");
		
		//에러 발생!! - return 값 없기 때문에 출력할 값이 없기 때문
		//System.out.println(t1.func01());
		System.out.println(t1.func03());
		
		System.out.println("-------------");
		
		//종료를 위한 return 사용
		t1.func04();
		
		System.out.println("-------------");
		System.out.println(t1.func05(5));
		
		System.out.println("-------------");
		System.out.println(t1.func06(3) * t1.func06(5));
	
		System.out.println("-------------");
		
		if(t1.func07(-7)== -1) {
			System.out.println("음수입니다!!");
		}
		
		
		
		
	}

}

*/

/*
//ex29))

class Tiger{
	void m1() {
		System.out.println("🐾 멍!");
	}
	
	void m2(int num) { //대입연산이 일어난다.
		
		System.out.println("🐾 멍!");
	}
	
	void m3(int num) {//인수는 지역변수이다.
		System.out.print("🐾 ");
		for (int i = 0; i < num; i++) {
			System.out.print("멍! ");
		}System.out.println();
		
	}
	
	
	//void m4(int a, b) { //X 
	void m4(int a, int b) { //O 
		System.out.println(a * b);
		System.out.println();
	}
	
				//w, h도 가능
	void m5(int width, int height, char ch, boolean b) { //가로, 세로 순서로 받기
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(ch + " ");
				
			}System.out.println();
			
		}System.out.println();
		
	}
	
	void m6(int n) { //구구단 출력 단
		
		//for (int i = 0; i < 10; i++) {
		//	System.out.println(5 + " * " + i + " = " + i * 5);
		//}		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + i * n);
		}
		System.out.println();
	}
	
	void m7(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			
		}
		System.out.println(sum);
		System.out.println();
		
	}
	
	void m8(int w, int h, char ch1, char ch2) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				//if((i + j) % 2 == 0) {
				//	System.out.print(ch1 + " ");
				//}else {
				//	System.out.print(ch2 + " ");
				//}
				
				System.out.print(
					((i+j) % 2 == 0 ? ch1: ch2)+" "
				);
				
			}System.out.println();
			
		}
		
	}
}

public class Hello01 {

	public static void main(String[] args) {
		//코드의 재활용
		//메소드 - 자주 사용되는 코드를 저장해서 재활용한다.
		//
		Tiger t1 = new Tiger();
		t1.m1();
		t1.m2(3);
		t1.m3(8);
		t1.m4(15, 3);
		t1.m5(5, 4, '★', true); 
		t1.m6(7);
		t1.m7(100);
		t1.m8(8, 7, '■', '□');
	}

}

*/

/*
//ex28))

class Tiger{
	//1. void f1(){}
	//2. void f1(int a){}
	//3. int f1(){}
	//4. int f1(int a){}
	
	//1. 리턴 없다 f1(인수전달 없음){}
	//2. 리턴 없다 f1(인수전달 있음){}
	//3. 리턴 있다 f1(인수전달 없음){}
	//4. 리턴 있다 f1(인수전달 있음){}
	
	void method01() {
		System.out.println("method01");
		System.out.println("method01");
	}
	
	void method02() {
		System.out.println("method02");	
		
	}
	
	
}


public class Hello01 {

	public static void main(String[] args) {
		//코드의 재활용
		//메소드 - 자주 사용되는 코드를 저장해서 재활용한다.
		//
		Tiger t1 = new Tiger();
		System.out.println(1000);
		t1.method01(); //메소드 호출- Jump 발생 (클래스의 메소드로!) -> 스코프 닫힐때까지 실행
		System.out.println(2000);
		t1.method01();
		System.out.println(3000);
		
		//함수는 한 번만 만들어진다.
		Tiger t2 = new Tiger();
		t2.method01();
		
		t1.method02();
		t2.method02();
	}

}

*/

/*
//ex27))

//관례적으로 클래스 이름의 첫글자는 대문자!
//Java에서는 class 뒤에 ; 없음

class Airplane{ //이 안은 전부 멤버
	
	//1. 필드(변수) >> 속성
	//primitive 전부 사용가능
	//배열 가능
	int a;
	float b;
	int seat;
	int[] arr = new int[4]; //new하지 않으면 메모리가 잡히지 않는다.
	
	int num = 99; //모든 비행기는 99를 가지고 생성된다 (전부 메모리는 다르다)
	//2. 생성자
	
	//3. 메소드(함수)
	
	
}

public class Hello01 {
	
	public static void main(String[] args) {
		//Airplane a = new Airplane();
		
		//한대만 만든다는 가정에서 객체의 소문자로 이름 지정
		//Airplane airplane = new Airplane(); 
		//실제 비행기가 만들어졌다.
		Airplane air = new Airplane();
		Airplane air2 = new Airplane();
		
		//필드 사용
		//air.a = 10;
		air.b = 20.0f;
		air.seat = 30;
		
		System.out.println(air.a); // 초기화가 된 상태로 생성된다.
		System.out.println(air.b);
		
		System.out.println("----------");
		air2.seat = 40;
		System.out.println("air.seat: " + air.seat + " air2.seat: " + air2.seat);
		//결과: air.seat: 30 air2.seat: 40
		
		System.out.println("arr length: " +air.arr.length);
		
		for (int i = 0; i < air.arr.length; i++) {
			air.arr[i] = i * 10;
			
		}
		
		
		for (int i = 0; i < air.arr.length; i++) {
			System.out.print(air.arr[i] + " ");
			
		}System.out.println();
		
		System.out.println("arr2 length: " +air2.arr.length);
		
		for (int i = 0; i < air2.arr.length; i++) {
			System.out.print(air2.arr[i]+ " ");
			
		}System.out.println();
		
		System.out.println("----------");
		
		air.arr = new int[8];
		
		System.out.println("arr length: " +air.arr.length);
		
		for (int i = 0; i < air.arr.length; i++) {
			System.out.print(air.arr[i] + " ");
			
		}System.out.println();
		
		air.num = 1000;
		
		
		
		
		
		//System.out.println("----------");
		//int[] ar;
		//ar = new int[10];
		//ar = new int[20]; //ar을 새로 생성하면 이전의 10개는 사라진다.
		
		//메모리 반납 코드
		//delete ar;
		
		
		
	}

}
*/

/*
//ex26))


public class Hello01 {

	public static void main(String[] args) {
		// 0 0 0 0 0 0
		//끝과 끝의 데이터, 앞/뒤 계산한 결과를 출력하고 싶을 때
		
		Random rnd = new Random();
		int num = 20;
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(20); //데이터 갱신
				
		}System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" "); //데이터 출력
		
		}System.out.println();
		
		//⁕데이터 갱신과 출력은 같이 두지 않는다.
		//arr[0] + arr[9] 
		//arr[1] + arr[8] ...
		for (int i = 0; i < arr.length / 2; i++) {
			System.out.print(arr[i] + arr[num - 1- i] + " ");
			//arr.length - 1 도 가능
		}System.out.println();
	}

}*/

/*
//ex25))


public class Hello01 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		}System.out.println();
		System.out.println("독수리");
		
	
	}

}
*/

/*
//ex24))

public class Hello01 {

	public static void main(String[] args) {
		
		//1. 정석
		int[] arr = new int[10];
		
		//int arr0, arr1, arr2, arr3; // 위와 동일
		//수가 많다고 생각한다면 복잡해진다.
		
		//2. 처음부터 초기값 설정
		int[] brr = new int[] {10, 20, 30};
		
		//3. new int[]를 가지지 않는 방법
		int[] crr = {40, 50, 60};
		
		//arr은 변수가 10개 있다.
		arr[0] = 10;
		System.out.println(arr[0]);
		System.out.println(arr[1]); //설정 안하면 초기값 0
		
		//index 접근은 0 ~ 요청 개수 - 1
		arr[9] = 20;
		System.out.println(arr[9]);
		
					
		//arr[-5] = 100; //Exception (ArrayIndexOutOfBound) - 프로그램 중단
		//arr[10] = 20;
		//System.out.println("호랑이");
		
		System.out.println("-----------------");
		
		//배열의 인덱스로 변수 사용 및 산술연산 가능
		int num = 4;
		arr[num*2] = 10;
		arr[num*2 - 7] = 999;
		System.out.println("arr[8] : " + arr[8]);
		System.out.println("arr[1] : " + arr[1]);
		
		System.out.println("-----------------");
	
		arr[5] = 7;
		//arr[arr[5]*2 + 7] = 888; // 문법적으로는 correct, but index 접근 불가
		arr[arr[5]*2 - 7] = 888; 
		System.out.println(arr[7]);
		
		System.out.println("-----------------");
		
		//배열의 길이 구하기
		System.out.println(arr.length);
		
	}

}*/

/*//ex23))


public class Hello {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(30); //0~29사이의 숫자
		switch (num % 2) { 
		case 0:{ //여러줄이면 블록처리
			
			for (int i = 0; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);

			}
			
		}break;
		
		case 1:{
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println(num + "까지의 합은: "+ sum);
			
		}break;
		
		default: break; //조건 없으면 단문
		}
	
	}

}
*/

/*
//ex22))

public class Hello {

	public static void main(String[] args) {
		int score = 87;
		switch (score / 10) {
		case 10: //break; -> 암묵적으로 의도적이라는 것을 알리는 문구
			//break가 없어 10도 9와 동일한 결과를 반환
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	
	}

}
*/

/*//ex21))

public class Hello {

	public static void main(String[] args) {
		//1. switch 안에 변수를 사용할 수 있다.
		//2. case 뒤에 변수를 사용할 수 없다.
		//3. break를 생락하면 switch를 빠져나오지 못한다.
		//4. 만족하는 분기문이 없을 때는 default로 이동한다.
		//5. 정수, 문자, 문자열 모두 분기가 가능하다.
		//6. 의도적으로 break를 생략하기도 한다.
		
		int num =  20;
		int nn = 10;
		char ch = '한';
		switch ("호랑이") {
		//case nn: (x)
		case "호랑이":
			System.out.println(1);
			break;
		case "코끼리":
			System.out.println(2);
			break;
		case "독수리":
			System.out.println(3);
			break;
		default:
			System.out.println("호랑이");
			break;
		}
	
	}

}

*/

/*//ex20))

public class Hello {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num = rnd.nextInt();
		if(num < 0) {
			num = -num;
		}
		System.out.println(num);
		
		// random 숫자 각 자릿수 더하기
		int sum = 0;
		while(true) {
			sum += num % 10;
			num = num / 10;
			System.out.println(sum);
			if (num <= 0) break;
			
		}
		
	}

}
*/

/*
//ex19))


public class Hello {

	public static void main(String[] args) {
		int num = 17;
		while(true) {
			System.out.println(num);
			if(num % 2 == 0)
				num = num / 2;
			else
				num = num * 3 + 1;
			
			//삼항 연산자로 한다면
			num = (num % 2 == 0 ) ? num / 2 : num * 3 + 1;
			
			if(num == 1) {
				System.out.println(num);
				break;
			}
			
			
		}
	
	}

}
*/
/*//ex18))

public class Hello {

	public static void main(String[] args) {
		int num = 0;
		while(true) {
			if(num == 4) {
				System.out.println("탈출전");
				break;
				//System.out.println("unreach code");
			}
			
			System.out.println(num);
			num++;
		}
	
	}

}
*/
/*
//ex17))

public class Hello {

	public static void main(String[] args) {
		int num = 0;
		while(true) {
			num++;
			System.out.println(num);
		}
		
	
	}

}

*/

/*

//ex16))
public class Hello {

	public static void main(String[] args) {
	
		int result;
		if(3 > 2) {
			result = 10;
		}else {
			result = 20;
		}

		//무조건 삼항연산자
		result = (3 > 2) ? 10 : 20; 
		System.out.println(result);
		
		//System.out.println((i + j) % 2 == 0 ? "O" : "X");

	
	}

}*/

/*
//ex15-2))

public class Hello {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) { //세로
			for (int j = 0; j < 4; j++) { //가로
				System.out.print("["+i+" "+j+"]");
				
			}
			
			System.out.println();
		}
		
		System.out.println("------------");
		
		int width = 8, height = 7;
		for (int i = 0; i < height; i++) { //세로
			for (int j = 0; j < width; j++) { //가로
				if((i+j) % 2==0) {
					System.out.print("O ");
				}else {
					System.out.print("X ");
				}		
				
			}
			
			System.out.println();
		}
		
		System.out.println("------------");
		
	}

}
*/

/*
//ex15-1))

public class Hello {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("-------------");
			for (int j = 0; j < 4; j++) {
				System.out.println(1);
				
			}
			System.out.println("*************");
			
		}
	
	}

}
*/

/*//ex14))

public class Hello {

	public static void main(String[] args) {
		
		//유형①	
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		
		//유형②
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(i);
		}
		
		//유형③ 
		//원점 기준으로 좌표축 위함
		//최적화를 위해서 사용
		//조건 * 2 + 1번 작동
		
		for (int i = -3; i <= 3; i++) {
			System.out.println(i);
		}
		
		//구구단
		
		int num = 5;
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);

		}
		
		//합산
		
		int sum = 0;
		int want = 1000;
		for (int i = 1; i <= want; i++) {
			sum += i;
			System.out.println(sum);
		
		}
		 
		//승수
		 * 
		int sum = 1;
		int a = 3, b = 4;
		//a의 b승
		for (int i = 0; i < b; i++) {
			sum *= a;

		}
		System.out.println(sum);
		
		
	}

}
*/

/*
//ex13))

public class Hello {

	public static void main(String[] args) {
		
		if(3 > 2) {
			System.out.println(1);
			System.out.println(2);

		}

		if(3 != 4) { //unreached 코드
			System.out.println(3);
			System.out.println(4);
		}

		System.out.println(5);

		if(3+4 >= 7) {
			System.out.println(6);
			if(true) {
				System.out.println(7);
			}
			System.out.println(8);

		}

		System.out.println(9);

	}

		int num = 2;
		
		if(num %2 == 0) {
			System.out.println("Even");
	
		}else {
	
			System.out.println("Odd");
		}
	
		int password = 1234;
		if(password != 1234) {
			System.out.println("틀림");
			//break; 
			//return; 
			//exit(); 
			//continue;
	
		}else {
			System.out.println("맞음");
			System.out.println("유저가 로그인 하였습니다.");
			System.err.println("다음 정보 확인");
		}
	
		int nn = 10;
		if(nn < 0) {
			nn = -nn; //양수화
		}else { //if 문에 안걸렸을 때 속도가 증가 (안정화)
			nn = +nn; 
		}
	
	
		//1. if() {}
		//2. if() {}else {}
		//3. if() {} else if() {} else {}
	
		int score = 87;
		if(score >= 90) {
			System.out.println('A');
	
	
		}else if(score >= 80){
			System.out.println('B');
	
		}else if(score >= 70){
			System.out.println('C');
	
		}else {
			System.out.println('F');
		}
	
		System.out.println(5);
	}

}
*/

/*//ex12))

public class Hello {

	public static void main(String[] args) {
		int a = 10, b =  20;
		int t;
		System.out.println(a + " " + b);
		
		//swap
		t = a; // t = 10
		a = b; // a = 20
		b = t; // b = 10
		System.out.println(a + " " + b);
	}

}
*/

/*

//ex11))

public class Hello {

	public static void main(String[] args) {
		
		int n  = 10;
		n = 20;
		System.out.println(n);
		// ①		
		n = n + 10;
		System.out.println(n);
		// ②복합 대입 연산자 - 얘가 컴파일 속도가 더 빠름
							//실행 속도는 동일
		n += 10;
		System.out.println(n);
		
		//assembly - add, move
		n = n + 10; 
		n += 10; 
		//assembly - increase (훨씬 빠르다)
		n++; //단항 연산자 - 실행 속도가 제일 빠름
		++n;
		
		n = 10;
		int a, b;
		a = n++; // 대입 후 증가 -> a = 10, n = 11
		System.out.println(a + " " + n);
		n = 10;
		b = ++n; // 증가 후 대입 -> b = 11, n = 11
		System.out.println(b + " " + n);
		
		
	}

}

*/
/*

//ex10))
public class Hello {

	public static void main(String[] args) {
		//1. 변수 이름은 중복될 수 없다.
		int apple;
		//int apple; (x)
		
		// 2. 대/소 구분된다.
		int Apple;
		
		// 3. 첫글자가 숫자가 아니라면 숫자 사용 가능
		int Apple123;
		//int 9Apple; (x)
		
		//4. _ (언더바), $(달러) 두가지의 특수문자만 사용가능
		int apple_num;
		int _34;
		
		//5. 한글 사용 가능이지만 가급적 피하기
		int 사과 = 10;
		System.out.println(사과);
		
		//6. 단어 합성 시에는 카멜 표기법 사용
		int BananaNumber = 10;
		int bananaNumber = 10; // 이쪽
		
	}

}

*/

/*

//ex9))

public class Hello {

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}

}

*/

/*
//ex8))

public class Hello {

	public static void main(String[] args) {
		//byte 1byte, short 2byte, int 4byte, long 8byte
		
		byte apple; // 선언 - 메모리 1개
		//변수 (값 변환 가능) <-> 상수 ( 값 변환 불가)
		apple = 10; //대입연산
		System.out.println("apple:" + apple);
		
		apple =  20;
		System.out.println("apple:" + apple);
		
		apple =  127; // 마지노선
		System.out.println("apple:" + apple);
		
		System.out.println("-------");
		
		// 타입 변수 대입연산 리터럴(값)
		short banana = 20;
		System.out.println("banana:" + banana);
		int orange = 30;
		System.out.println("orange:" + orange);
		long kiwi = 22292999;
		System.out.println("kiwi:" + kiwi);
		
		System.out.println("-------");
		
		//boolean 1byte, char 2byte, float 4byte, double 8byte  
		boolean t1 = true; //false
		char t2 = 'A';
		char t3 = '한';
		char t4 = 65; // 아스키코드 확인용 - 가급적 피하기 (가독성 떨어진다)
		
		System.out.println("t2:" + t2);
		System.out.println("t3:" + t3);
		System.out.println("(int)t2:" + (int)t2);
		System.out.println("(int)t3:" + (int)t3);
		System.out.println("(char)t3+1:" + (char)(t3+1));
		System.out.println("t4:" + t4);
		
		System.out.println("-------");
		
		System.out.println(Short.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		System.out.println("-------");
		
		char a = 'A', b = 20;
		System.out.println(a + b);
		
		float t5 = 3.14f;
		double t6 = 3.14;
		
		double sum = 0.0f;
		
		for(int i = 0; i <  100; i++) {
			sum = sum + 0.1;
		}
		System.out.println(sum);
		
		//if(sum == 10.0f) 불가능!
	}

}


*/
/*
//ex7))

public class Hello {

	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

}

*/

/*

//ex6))

public class Hello {

	public static void main(String[] args) {
		
		System.out.println(( 3 + 2 > 7 && 2 + 6 < 8 ));
		System.out.println("-----------");
		System.out.println(!true);
		System.out.println(!(3 > 2));
	}

}
*/

/*
//ex5))

public class Hello {

	public static void main(String[] args) {
		
		//or
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("---------------");
		//and
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		
		
	}

}

*/

/*
//ex4))

public class Hello {

	public static void main(String[] args) {
		System.out.println(10 > 5);
		System.out.println(10 >= 5);
		System.out.println(10 < 5);
		System.out.println(10 <= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		
		
	
	}

}

*/

/*

//ex3))
public class Hello {

	public static void main(String[] args) {
		
		System.out.println(17 + 3);
		System.out.println(17 - 3);
		System.out.println(17 * 3);
		System.out.println(17 / 3);
		System.out.println(17 % 3); // ? % n => 0 ~ n-1
									// 1234 % 10 -> 자릿수 뽑기
		
		System.out.println(3 + 4 * 5); // *, / (1순위) +, - (2순위)
		System.out.println((3 + 4) * 5); // () (0순위)
		System.out.println(2 + 3 * 4 + 5);
		System.out.println((2 + 3) * (4 + 5));
	
		
	}

}

*/

/*
//ex2))
public class Hello {

	public static void main(String[] args) {
		System.out.println(100); // 정수
		System.out.println('한'); // 문자
		System.out.println("호랑이"); // 문자열
		
		System.out.println();
		
		System.out.println(100 + 200);// : 숫자 + 숫자 - 산술연산
		System.out.println(100 + "호랑이");// : 숫자 + 문자열 - 문자열 (호랑이 + 100도 도일)
		System.out.println('한' + "호랑이");// : 문자 + 문자열 - 문자열
		System.out.println("호랑이"  + "사자"); // : 문자열 + 문자열 - 문자열
		System.out.println("100" + "문자열"); // : 문자열 + 문자열 - 문자열
		System.out.println(10 + 20 + "호랑이"); // : 순서대로 실행 - 숫자 / 문자열
		System.out.println("호랑이" + "사자" + 100); // : 문자열로 전부 붙어버림
		System.out.println(10 + " " + 20); // : 숫자 + 공백 - 문자열
		System.out.println(10 + 'A'); // : 숫자 + 문자 - 아스키 코드 연산
		System.out.println(1 + 'A'); // : 숫자 + 문자 - 아스키 코드 연산
		System.out.println((char)(1 + 'A')); // : char로 명시적 변환 - type casting
		
	}

}

*/

/*

ex1))

public class Hello {

	public static void main(String[] args) {

		System.out.println(1000); //ctrl + f11 (compile + execute)
		//System.out.println(2000);
		
	}

}

*/
