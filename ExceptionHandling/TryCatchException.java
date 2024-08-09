package ExceptionHandling;

public class TryCatchException {

	public static void main(String[] args) {
	
		System.out.println("Before Try Block");
		try {
			System.out.println("Before Raise Exception");
			System.out.println("Before Raise Exception");
			System.out.println("Before Raise Exception");
			System.out.println("Before Raise Exception");
			int c = 100/0;
		
			System.out.println("After Raise Exception");
			System.out.println("After Raise Exception");
			System.out.println("After Raise Exception");
			System.out.println("After Raise Exception");
			System.out.println("After Raise Exception");
		}
       catch (Exception e) {
    	   e.printStackTrace();
    		System.out.println("================");
    		System.out.println(e);
    		System.out.println("================");
    		System.out.println(e.getMessage());
       }
	}

}
