package Pack01;

import java.util.*;

/*
 
public class Hello {

	public static void main(String[] args) {
	
	
	}

}

*/

//ex24))

public class Hello {

	public static void main(String[] args) {
	
	
	}

}


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
