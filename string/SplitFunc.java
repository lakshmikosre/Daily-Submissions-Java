package softronix.string;

public class SplitFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Softronix@IT@Training@in@Nagpur");
	
		
		String [] str = s.split("@"); // indexing s1[ ]
		for(String x : str)
		{
			System.out.println(x);
		}
        String s1 = String.join("_", str);
        System.out.println(s1);
	}

}
