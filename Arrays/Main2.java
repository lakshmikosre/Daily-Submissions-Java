package Arrays;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int number[] = new int[size];
				
		for(int i = 0; i<size ; i++)
		{
			number[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i< size; i++)
		{
			System.out.println(number[i]);
		}
		
		sc.close();

	}

}
