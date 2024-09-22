package Arrays;

import java.util.Scanner;

public class Exercise1{

    public static void main(String[] args) {

        int size;

        System.out.println("Enter your num size :-");

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int number[] = new int[size];

        for(int i = 0; i<size ; i++)
        {

            number[i] = sc.nextInt();

        }

        System.out.println("Now select your value of x");
        int x = sc.nextInt();


        for(int i = 0 ; i<number.length; i++)
        {
           if(number[i] == x)
           {
               System.out.println("x found at index :-" + i);
           }
        }

        sc.close();

    }

}
