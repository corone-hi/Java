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
		int num = rnd.nextInt(30); //0~29������ ����
		switch (num % 2) { 
		case 0:{ //�������̸� ���ó��
			
			for (int i = 0; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);

			}
			
		}break;
		
		case 1:{
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println(num + "������ ����: "+ sum);
			
		}break;
		
		default: break; //���� ������ �ܹ�
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
		case 10: //break; -> �Ϲ������� �ǵ����̶�� ���� �˸��� ����
			//break�� ���� 10�� 9�� ������ ����� ��ȯ
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
		//1. switch �ȿ� ������ ����� �� �ִ�.
		//2. case �ڿ� ������ ����� �� ����.
		//3. break�� �����ϸ� switch�� ���������� ���Ѵ�.
		//4. �����ϴ� �б⹮�� ���� ���� default�� �̵��Ѵ�.
		//5. ����, ����, ���ڿ� ��� �бⰡ �����ϴ�.
		//6. �ǵ������� break�� �����ϱ⵵ �Ѵ�.
		
		int num =  20;
		int nn = 10;
		char ch = '��';
		switch ("ȣ����") {
		//case nn: (x)
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


/*//ex20))

public class Hello {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num = rnd.nextInt();
		if(num < 0) {
			num = -num;
		}
		System.out.println(num);
		
		// random ���� �� �ڸ��� ���ϱ�
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
			
			//���� �����ڷ� �Ѵٸ�
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
				System.out.println("Ż����");
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

		//������ ���׿�����
		result = (3 > 2) ? 10 : 20; 
		System.out.println(result);
		
		//System.out.println((i + j) % 2 == 0 ? "O" : "X");

	
	}

}*/

/*
//ex15-2))

public class Hello {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) { //����
			for (int j = 0; j < 4; j++) { //����
				System.out.print("["+i+" "+j+"]");
				
			}
			
			System.out.println();
		}
		
		System.out.println("------------");
		
		int width = 8, height = 7;
		for (int i = 0; i < height; i++) { //����
			for (int j = 0; j < width; j++) { //����
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
		
		//������	
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		
		//������
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(i);
		}
		
		//������ 
		//���� �������� ��ǥ�� ����
		//����ȭ�� ���ؼ� ���
		//���� * 2 + 1�� �۵�
		
		for (int i = -3; i <= 3; i++) {
			System.out.println(i);
		}
		
		//������
		
		int num = 5;
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);

		}
		
		//�ջ�
		
		int sum = 0;
		int want = 1000;
		for (int i = 1; i <= want; i++) {
			sum += i;
			System.out.println(sum);
		
		}
		 
		//�¼�
		 * 
		int sum = 1;
		int a = 3, b = 4;
		//a�� b��
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

		if(3 != 4) { //unreached �ڵ�
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
			System.out.println("Ʋ��");
			//break; 
			//return; 
			//exit(); 
			//continue;
	
		}else {
			System.out.println("����");
			System.out.println("������ �α��� �Ͽ����ϴ�.");
			System.err.println("���� ���� Ȯ��");
		}
	
		int nn = 10;
		if(nn < 0) {
			nn = -nn; //���ȭ
		}else { //if ���� �Ȱɷ��� �� �ӵ��� ���� (����ȭ)
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
		// ��		
		n = n + 10;
		System.out.println(n);
		// �躹�� ���� ������ - �갡 ������ �ӵ��� �� ����
							//���� �ӵ��� ����
		n += 10;
		System.out.println(n);
		
		//assembly - add, move
		n = n + 10; 
		n += 10; 
		//assembly - increase (�ξ� ������)
		n++; //���� ������ - ���� �ӵ��� ���� ����
		++n;
		
		n = 10;
		int a, b;
		a = n++; // ���� �� ���� -> a = 10, n = 11
		System.out.println(a + " " + n);
		n = 10;
		b = ++n; // ���� �� ���� -> b = 11, n = 11
		System.out.println(b + " " + n);
		
		
	}

}

*/
/*

//ex10))
public class Hello {

	public static void main(String[] args) {
		//1. ���� �̸��� �ߺ��� �� ����.
		int apple;
		//int apple; (x)
		
		// 2. ��/�� ���еȴ�.
		int Apple;
		
		// 3. ù���ڰ� ���ڰ� �ƴ϶�� ���� ��� ����
		int Apple123;
		//int 9Apple; (x)
		
		//4. _ (�����), $(�޷�) �ΰ����� Ư�����ڸ� ��밡��
		int apple_num;
		int _34;
		
		//5. �ѱ� ��� ���������� ������ ���ϱ�
		int ��� = 10;
		System.out.println(���);
		
		//6. �ܾ� �ռ� �ÿ��� ī�� ǥ��� ���
		int BananaNumber = 10;
		int bananaNumber = 10; // ����
		
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
		
		byte apple; // ���� - �޸� 1��
		//���� (�� ��ȯ ����) <-> ��� ( �� ��ȯ �Ұ�)
		apple = 10; //���Կ���
		System.out.println("apple:" + apple);
		
		apple =  20;
		System.out.println("apple:" + apple);
		
		apple =  127; // �����뼱
		System.out.println("apple:" + apple);
		
		System.out.println("-------");
		
		// Ÿ�� ���� ���Կ��� ���ͷ�(��)
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
		char t3 = '��';
		char t4 = 65; // �ƽ�Ű�ڵ� Ȯ�ο� - ������ ���ϱ� (������ ��������)
		
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
		
		//if(sum == 10.0f) �Ұ���!
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
									// 1234 % 10 -> �ڸ��� �̱�
		
		System.out.println(3 + 4 * 5); // *, / (1����) +, - (2����)
		System.out.println((3 + 4) * 5); // () (0����)
		System.out.println(2 + 3 * 4 + 5);
		System.out.println((2 + 3) * (4 + 5));
	
		
	}

}

*/

/*
//ex2))
public class Hello {

	public static void main(String[] args) {
		System.out.println(100); // ����
		System.out.println('��'); // ����
		System.out.println("ȣ����"); // ���ڿ�
		
		System.out.println();
		
		System.out.println(100 + 200);// : ���� + ���� - �������
		System.out.println(100 + "ȣ����");// : ���� + ���ڿ� - ���ڿ� (ȣ���� + 100�� ����)
		System.out.println('��' + "ȣ����");// : ���� + ���ڿ� - ���ڿ�
		System.out.println("ȣ����"  + "����"); // : ���ڿ� + ���ڿ� - ���ڿ�
		System.out.println("100" + "���ڿ�"); // : ���ڿ� + ���ڿ� - ���ڿ�
		System.out.println(10 + 20 + "ȣ����"); // : ������� ���� - ���� / ���ڿ�
		System.out.println("ȣ����" + "����" + 100); // : ���ڿ��� ���� �پ����
		System.out.println(10 + " " + 20); // : ���� + ���� - ���ڿ�
		System.out.println(10 + 'A'); // : ���� + ���� - �ƽ�Ű �ڵ� ����
		System.out.println(1 + 'A'); // : ���� + ���� - �ƽ�Ű �ڵ� ����
		System.out.println((char)(1 + 'A')); // : char�� ����� ��ȯ - type casting
		
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
