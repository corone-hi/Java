import java.util.*;

public class Array {

	public static void main(String[] args) {
		//p.117
		
		// 문제1)
		
		int[] arr = new int[100];
		
		System.out.println("-----------");
		
		// 문제2)
		
		/*
		for (int i = 0; i < array.length; i++) {
			array[i] = i;	
		}
		*/
		Random rnd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100);	
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;	
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------");
		//문제3)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr2 = new double[n];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			
		}
		
		
		
		System.out.println("-----------");
		
		//문제4) 
		int[] arr3 = new int[]{1, 2, 3, 4, 5};
		int[] arr4 = new int[5];
		
		for (int i = 0; i < arr2.length; i++) {
			arr4[i] = arr3[i];
			
		}
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);

		}
		
		System.out.println("-----------");
		
		//문제5)
		
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("배열 크기");
		int n2 = sc.nextInt();
		int[] arr5 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr5[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n2; i++) {
			for (int j = i; j < n2; j++) {
				if(arr5[i] > arr5[j]) {
					int tmp = arr5[i];
					arr5[i] = arr5[j];
					arr5[j] = tmp;
				}
				
			}
		}
		
		for (int i = 0; i < n2; i++) {
			System.out.println(arr5[i] + " ");
			
		}
		
		//문제6)
		
		int[][]arr6 = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr6[i][j] = rnd.nextInt(10);
			}
		}
		
		int sum = 0;;
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				sum += arr6[i][j];
				count++;
			}
		}
		
		System.out.println("sum: " + sum + " avg: " + sum/count);
		
		
		
	}

}
