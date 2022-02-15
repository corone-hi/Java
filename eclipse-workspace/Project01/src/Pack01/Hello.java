package Pack01;

import java.util.Random;

/*
// ex)
public class Hello {
	public static void main(String[] args) {
	}
}
*/
// 단축키 ctrl + / , ctrl + \ (주석), ctrl + i (들여쓰기 맞춤), alt 위아래 방향키 (옮기기)


//ex23)
public class Hello {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int num = rnd.nextInt(30);
		switch ( num % 2 ) {
		case 0:{
			for (int i = 0; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + num*i);
			}
		}break;
			
		case 1:{
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println(num + "까지의 합은 : "+ sum);
		}break;
		
		default: break;
		}
	}
}


/*
//ex22)
public class Hello {
	public static void main(String[] args) {
		int score = 100;
		switch (score / 10) {
		case 10: // break;
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

/*
//ex21)
public class Hello {
	public static void main(String[] args) {
		// 1. switch 안에 변수를 사용할 수 있다.
		// 2. case 뒤에 변수를 사용할 수 없다.
		// 3. break를 생략하면 switch를 빠져나오지 않는다.
		// 4. 만족하는 분기문이 없을때는 default로 이동한다.
		// 5. 정수, 문자, 문자열 모두 부기가 가능하다.
		// 6. 의도적으로 break를 생략하기도 한다.
		int num = 90;
		int nn = 10;
		char ch = '한';
		switch ("호랑이") {
		// case nn: >> 사용할 수 없다.
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

/*
//ex20)
public class Hello {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int num = rnd.nextInt();
		if( num < 0 ) {
			num = -num;
		}
		System.out.println(num);
		int sum = 0;
		while(true) {
			if (num / 10 == 0 && num % 10 == 0 ) {
				System.out.println(sum);
				break;
			}else {
				sum += num % 10;
				num /= 10;
			}
		}
		//System.out.println(num);
	}
}
*/

/*
//ex19)
public class Hello {
	public static void main(String[] args) {
		int num = 29292;
		
		while (true) {
			System.out.println(num);
			if( num % 2 == 0 ) {
				num = num / 2;
			}else {
				num = num * 3 + 1;
			}
			num = (num % 2 == 0) ? num / 2 : num * 3 +1;
			if( num == 1 ) {
				System.out.println(num);
				break;
			}
		}
	}
}
*/

/*
//ex18) while( 비슷하게 사용 : for )
public class Hello {
	public static void main(String[] args) {
//		int num = 0;
//		while( true ) {
//			num++;
//			System.out.println(num);
//		}
		
		int num = 0;
		while (num < 4) { // for 로 구현할 수 있는 구문 while 은 반복 횟수를 모르는 경우
			System.out.println(num);
			num++;
		}
		num = 0;
		while(true) {
			if( num == 4 ) {
				System.out.println("탈출전");
				break;
				//System.out.println("unreach code");
			}
			System.out.println(num);
			num++;
		}
		
		// System.out.println("호랑이");
	}
}
*/

/*
//ex17-2)
public class Hello {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) { // 세로
			for (int j = 0; j < 4; j++) { // 가로
				System.out.print("* ");
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println();		
		for (int i = 0; i < 3; i++) { // 세로
			for (int j = 0; j < 4; j++) { // 가로
				System.out.print("[" + i + " " + j + "]");
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println();
		for (int i = 0; i < 5; i++) { // 세로
			for (int j = 0; j < 6; j++) { // 가로
				//if ( (i + j) % 2 == 0) {
				//	System.out.print("O ");
				//}else {
				//	System.out.print("X ");
				//}
				System.out.print( ( i + j) % 2 == 0 ? "O " : "X ");
			}
			System.out.println();
		}
		System.out.println();
		int result;
		if ( 3> 2) {
			result = 10;
		}else {
			result = 20;
		}
		// 무조건 삼항연산으로 수정한다.
		result = ( 3 > 2 ) ? 10 : 20;
		
		int func() {
			if ( 3 > 2 ) {
				return 100;
			}else {
				return 200;
			}
			//( 3 > 2 ) ? return 100 : return 200;  <<-- X
			return ( 3> 2 ) ? 100 : 200;
		}
	}
}
*/

/*
//ex17-1)
public class Hello {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("---------");
			for (int j = 0; j < 4; j++) {
				System.out.println(1);
			}
			System.out.println("*********");
		}
	}
}
*/

/*
//ex16)
public class Hello {
	public static void main(String[] args) {
		int num = 15;
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		System.out.println("--------------------");
		
		int sum = 0;
		int num2 = 1000;
		for (int i = 1; i <= num2; i++) {
			sum += i;
			//System.out.println(sum);
		}
		System.out.println(sum);
		
		int sum2 = 1;
		int a = 3, b = 4;
		// 2의 8승
		for (int i = 0; i < b; i++) {
			sum2 *= a;
		}
		System.out.println(sum2);
	}
}
*/

/*
//ex15)
public class Hello {
	public static void main(String[] args) {
		// 유형1
		for (int i = 0; // 초기
				i < 4; // 조건
				i++) { // 증감
			System.out.println(i);
		}
		System.out.println("---");
		// 유형2
		for (int i = 1; i <= 4; i++) {
			System.out.println(i);
		}
		System.out.println("---");
		// 유형3
		for (int i = -3; i <= 3; i++) {
			System.out.println(i);
		}
	}
}
*/

/*
//ex14)
public class Hello {
	public static void main(String[] args) {
		int score = 87;
		if(score >= 90) {
			System.out.println('A');
		} else if(score >= 80) {
			System.out.println('B');
		} else if(score >= 70) {
			System.out.println('C');
		} else {
			System.out.println('F');
		}
		System.out.println(5);
	}
}
*/

/*
//ex13)
public class Hello {
	public static void main(String[] args) {
		// 1. if() {}
		// 2. if() {} else {}
		// 3. if() {} else if() else if(){}
		int num = 10;
		if(num % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

		int password = 1234;
		if(password != 1234)
		{
			System.out.println("틀림");
			// break, continue, exit()
		}

		System.out.println("맞음");
		System.out.println("유저 로그인 했습니다.");
		System.err.println("다음 정보 확인");
		
		int nn = 10;
		while () {
			if(nn < 0)
			{
				nn = -nn;
			}
			else
			{
				nn = +nn;
			}
		}
	}
}
*/

/*
//ex12)
public class Hello {
	public static void main(String[] args) {
		System.out.println(1);
		if( 3 > 2 ) {
			System.out.println(2);
			if( 3 != 4) {
				System.out.println(3);
			}
			System.out.println(5);
			if( 3+4 >= 5 ) {
				System.out.println(6);
			}
			System.out.println(7);
		}
	}
}
*/

/*
//ex11) if, for, while, switch : >> >> do while(사용안함.)
public class Hello {
	public static void main(String[] args) {
		if(true) {
			System.out.println(1);
			System.out.println(2);
		}
		
		if(false) {
			System.out.println(3);
			System.out.println(4);
		}
		
		System.out.println(5);
		System.out.println("-----------");
		
		if(true) 
		{
			System.out.println(6);
			if(false) 
			{
				System.out.println(7);
			}
			System.out.println(8);
		}
		System.out.println(9);
	}
}
*/

/*
//ex10)
public class Hello {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int t; // temp
		System.out.println(a + " " + b);
		t = a; // t = 10
		a = b; // a = 20
		b = t; // b = 10
		System.out.println(a + " " + b);
	}
}
*/

/*
//ex9)
public class Hello {
	public static void main(String[] args) {
		int n = 10;
		n = 20;
		System.out.println(n);
		n = n + 10;
		System.out.println(n);
		n += 10;
		System.out.println(n);
		n = n + 1;
		n += 1;
		n++;
		++n;
		
		n = 10;
		int a, b;
		a = n++; // 대입 증가
		// a = 10, n = 11
		System.out.println(a + " " + n);
		n = 10;
		b = ++n; // 증가 대입
		// a = 11, n = 11
		System.out.println(b + " " + n);
	}
}
*/

/*
//ex8)
public class Hello {
	public static void main(String[] args) {
		// 1. 변수 이름은 중복될 수 없다.
		int apple;
		// int apple; (x)
		
		// 2. 대소 구분된다.
		int Apple;
		
		// 3. 첫글자가 숫자가 아니라면 숫자 사용가능
		int Apple123;
		// int 9Apple; // (X)
		// 4. _ $ 2개를 제외하면 특수문자 사용 불가.
		int apple_num;
		int _34;
		
		// 5. 한글 사용 가능(가급적 피한다.)
		int 사과 = 10;
		System.out.println(사과);
		
		// 6. 단어 합성시에 카멜표기법
		int BananaNumber = 10;
	}
}
*/

/*
//ex7)
public class Hello {
	public static void main(String[] args) {
		// byte, short, int, long : 정수 관련
		// boolean, char, float, double
		
		byte apple; // 변수 <-> 상수
		// = 을 대입연산자
		apple = 10;
		System.out.println(apple);
		apple = 20;
		System.out.println(apple);
		apple = 127;
		
		// 
		// short type
		// banana 변수(variable)
		// = 대입연산자
		// 20; 리터럴
		
		short banana = 20;
		
		int orange = 222222222;
		
		long kiwi = 222922922;
		
		// boolean(1), char(2), float(4소숫점), double(8소숫점)
		boolean t1 = true;
		char t2 = 'A';
		char t3 = '한';
		// 밑의 프로그램은 가급적 피한다.
		char t4 = 65; // t2 와 완전 같으나, 가독성이 떨어짐
		System.out.println(t2);
		System.out.println(t3);
		System.out.println((int)t2);
		System.out.println((char)(t3+1)); // short 는 +- 30000 char 는 0 부터 60000
		System.out.println((int)Character.MAX_VALUE);
		
		float t5 = 3.14f; // 4byte
		double t6 = 3.14; // 8byte
		// float 과 double 에서 같은지 물어보는거 자체가 x
		double sum = 0.0;
		
		for (int i = 0; i < 100; i++) {
			sum = sum + 0.1;
		}
		System.out.println(sum);
		
	}
}
*/

/*
//ex6)
public class Hello {
	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE); // 줄맞춤 컨트롤 + I
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
//ex5)
public class Hello {
	public static void main(String[] args) {
		System.out.println(false || false); // OR
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("------------");
		System.out.println(false && false); // AND
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("------------");
		System.out.println(3+6>7 && 1+6<8); // 산술>관계>논리
		System.out.println(!true);
		System.out.println(!(3>2));
	}
}
*/

/*
//ex4)
public class Hello {
	public static void main(String[] args) {
		System.out.println(10>5); // 총 6가지
		System.out.println(10>=5);
		System.out.println(10<5);
		System.out.println(10<=10);
		System.out.println(10==5);
		System.out.println(10!=5);
	}
}
*/

/*
//ex3)
public class Hello {
	public static void main(String[] args) {
		System.out.println(17+3); // 5칙연산
		System.out.println(17-3);
		System.out.println(17*3);
		System.out.println(17/3);
		System.out.println(17%3);
		System.out.println(3+4*5); // 우선순위에 따라 연산
		System.out.println((3+4)*5);
		System.out.println((2+3)*(4+5));
	}
}
*/

/*
//ex2)
public class Hello {
	public static void main(String[] args) {
		System.out.println(100); // 정수
		System.out.println('한'); // 문자
		System.out.println("호랑이"); // 문자열
		System.out.println(100+200); // 숫자 + 숫자
		System.out.println(100+"호랑이");
		System.out.println("호랑이" + 100);
		System.out.println("호랑이" + "사자");
		System.out.println("100" + 100);
		System.out.println(10 + 20 + "호랑이"); //왼쪽에서 책 읽듯이
		System.out.println("호랑이" + 10 + 20);
		System.out.println(10 + " " + 20 + " " + 30);
		System.out.println((char)(1 + 'A')); // 문자는 아스키코드나 유니코드로 치환
	}
}
*/

/*
// ex1)
public class Hello {

	public static void main(String[] args) {
		System.out.println( 1000 );
		System.out.println( 2000 );
	}

}
*/