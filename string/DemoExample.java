package softronix.string;

class S
{
	String s=new String("MS DHONI");
     int n=s.length();
	  int sum=0;
	public int hashCode()
	{
		
		for(int i=0;i<n;i++)
		{
		  sum=(int) (sum+(((int)s.charAt(i))*((long)Math.pow(31,n-1-i))));	
		}
		
		
		return sum;
	}
}

public class DemoExample {

	public static void main(String[] args) {
		
		S s1=new S();
		String s2=new String("MS DHONI");
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println((int)'M'); // type casting using cast operator 
		

	}

}