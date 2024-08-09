package softronix.exception;
import java.util.Scanner;
public class ExceptionExp {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int arr[ ] = new int[5];
//         arr[ 6] = 10 /0;
       try {
//    	   arr[ 6] = 10 /0;
          arr[ 8] = 10;
          System.out.println("Your Result is :"+ arr);
       }
       catch(ArithmeticException e) {
    	   System.out.println(e.getMessage());
       }
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println(e.getMessage());
       }
       
	}

}
