package Pack01;

import java.util.Random;

/*
// ex)
public class Hello {
	public static void main(String[] args) {
	}
}
*/
// ����Ű ctrl + / , ctrl + \ (�ּ�), ctrl + i (�鿩���� ����), alt ���Ʒ� ����Ű (�ű��)


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
			System.out.println(num + "������ ���� : "+ sum);
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
		// 1. switch �ȿ� ������ ����� �� �ִ�.
		// 2. case �ڿ� ������ ����� �� ����.
		// 3. break�� �����ϸ� switch�� ���������� �ʴ´�.
		// 4. �����ϴ� �б⹮�� �������� default�� �̵��Ѵ�.
		// 5. ����, ����, ���ڿ� ��� �αⰡ �����ϴ�.
		// 6. �ǵ������� break�� �����ϱ⵵ �Ѵ�.
		int num = 90;
		int nn = 10;
		char ch = '��';
		switch ("ȣ����") {
		// case nn: >> ����� �� ����.
		case "ȣ����":
			System.out.println(1);
			break;
		
		case "�ڳ���":
			System.out.println(2);
			break;
		
		case "������":
			System.out.println(3);
			break;
			
		default:
			System.out.println("ȣ����");
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
//ex18) while( ����ϰ� ��� : for )
public class Hello {
	public static void main(String[] args) {
//		int num = 0;
//		while( true ) {
//			num++;
//			System.out.println(num);
//		}
		
		int num = 0;
		while (num < 4) { // for �� ������ �� �ִ� ���� while �� �ݺ� Ƚ���� �𸣴� ���
			System.out.println(num);
			num++;
		}
		num = 0;
		while(true) {
			if( num == 4 ) {
				System.out.println("Ż����");
				break;
				//System.out.println("unreach code");
			}
			System.out.println(num);
			num++;
		}
		
		// System.out.println("ȣ����");
	}
}
*/

/*
//ex17-2)
public class Hello {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) { // ����
			for (int j = 0; j < 4; j++) { // ����
				System.out.print("* ");
			}
			System.out.println(); // �ٹٲ�
		}
		System.out.println();		
		for (int i = 0; i < 3; i++) { // ����
			for (int j = 0; j < 4; j++) { // ����
				System.out.print("[" + i + " " + j + "]");
			}
			System.out.println(); // �ٹٲ�
		}
		System.out.println();
		for (int i = 0; i < 5; i++) { // ����
			for (int j = 0; j < 6; j++) { // ����
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
		// ������ ���׿������� �����Ѵ�.
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
		// 2�� 8��
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
		// ����1
		for (int i = 0; // �ʱ�
				i < 4; // ����
				i++) { // ����
			System.out.println(i);
		}
		System.out.println("---");
		// ����2
		for (int i = 1; i <= 4; i++) {
			System.out.println(i);
		}
		System.out.println("---");
		// ����3
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
			System.out.println("Ʋ��");
			// break, continue, exit()
		}

		System.out.println("����");
		System.out.println("���� �α��� �߽��ϴ�.");
		System.err.println("���� ���� Ȯ��");
		
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
//ex11) if, for, while, switch : >> >> do while(������.)
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
		a = n++; // ���� ����
		// a = 10, n = 11
		System.out.println(a + " " + n);
		n = 10;
		b = ++n; // ���� ����
		// a = 11, n = 11
		System.out.println(b + " " + n);
	}
}
*/

/*
//ex8)
public class Hello {
	public static void main(String[] args) {
		// 1. ���� �̸��� �ߺ��� �� ����.
		int apple;
		// int apple; (x)
		
		// 2. ��� ���еȴ�.
		int Apple;
		
		// 3. ù���ڰ� ���ڰ� �ƴ϶�� ���� ��밡��
		int Apple123;
		// int 9Apple; // (X)
		// 4. _ $ 2���� �����ϸ� Ư������ ��� �Ұ�.
		int apple_num;
		int _34;
		
		// 5. �ѱ� ��� ����(������ ���Ѵ�.)
		int ��� = 10;
		System.out.println(���);
		
		// 6. �ܾ� �ռ��ÿ� ī��ǥ���
		int BananaNumber = 10;
	}
}
*/

/*
//ex7)
public class Hello {
	public static void main(String[] args) {
		// byte, short, int, long : ���� ����
		// boolean, char, float, double
		
		byte apple; // ���� <-> ���
		// = �� ���Կ�����
		apple = 10;
		System.out.println(apple);
		apple = 20;
		System.out.println(apple);
		apple = 127;
		
		// 
		// short type
		// banana ����(variable)
		// = ���Կ�����
		// 20; ���ͷ�
		
		short banana = 20;
		
		int orange = 222222222;
		
		long kiwi = 222922922;
		
		// boolean(1), char(2), float(4�Ҽ���), double(8�Ҽ���)
		boolean t1 = true;
		char t2 = 'A';
		char t3 = '��';
		// ���� ���α׷��� ������ ���Ѵ�.
		char t4 = 65; // t2 �� ���� ������, �������� ������
		System.out.println(t2);
		System.out.println(t3);
		System.out.println((int)t2);
		System.out.println((char)(t3+1)); // short �� +- 30000 char �� 0 ���� 60000
		System.out.println((int)Character.MAX_VALUE);
		
		float t5 = 3.14f; // 4byte
		double t6 = 3.14; // 8byte
		// float �� double ���� ������ ����°� ��ü�� x
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
		System.out.println(Byte.MIN_VALUE); // �ٸ��� ��Ʈ�� + I
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
		System.out.println(3+6>7 && 1+6<8); // ���>����>��
		System.out.println(!true);
		System.out.println(!(3>2));
	}
}
*/

/*
//ex4)
public class Hello {
	public static void main(String[] args) {
		System.out.println(10>5); // �� 6����
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
		System.out.println(17+3); // 5Ģ����
		System.out.println(17-3);
		System.out.println(17*3);
		System.out.println(17/3);
		System.out.println(17%3);
		System.out.println(3+4*5); // �켱������ ���� ����
		System.out.println((3+4)*5);
		System.out.println((2+3)*(4+5));
	}
}
*/

/*
//ex2)
public class Hello {
	public static void main(String[] args) {
		System.out.println(100); // ����
		System.out.println('��'); // ����
		System.out.println("ȣ����"); // ���ڿ�
		System.out.println(100+200); // ���� + ����
		System.out.println(100+"ȣ����");
		System.out.println("ȣ����" + 100);
		System.out.println("ȣ����" + "����");
		System.out.println("100" + 100);
		System.out.println(10 + 20 + "ȣ����"); //���ʿ��� å �е���
		System.out.println("ȣ����" + 10 + 20);
		System.out.println(10 + " " + 20 + " " + 30);
		System.out.println((char)(1 + 'A')); // ���ڴ� �ƽ�Ű�ڵ峪 �����ڵ�� ġȯ
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