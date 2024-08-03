package softronix.string;

public class StringDemo {

	public static void main(String[] args) {
		
	
	  String s=new String("SOFTRONIX");
	  String s1=new String("SOFTRONIX");
	  
	  System.out.println("========With Respect to String============");
	  System.out.println(s.equals(s1));
	  System.out.println(s==s1);
	  System.out.println(s.hashCode());
	  System.out.println(s1.hashCode());
	  System.out.println(s.toString());
	  System.out.println(s1.toString());
	  System.out.println("===========================================");
	 
	  StringBuffer s2=new  StringBuffer("SOFTRONIX");
	  StringBuffer s3=new  StringBuffer("SOFTRONIX");
		
	  System.out.println("========With Respect to StringBuffer============");
	  System.out.println(s2.equals(s3));// Ref
	  System.out.println(s2==s3);//Ref
	  System.out.println(s2.hashCode());
	  System.out.println(s3.hashCode());
	  System.out.println(s2.toString());
	  System.out.println(s3.toString());
	  System.out.println("===========================================");	

	}

}