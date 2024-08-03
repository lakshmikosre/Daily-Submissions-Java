package softronix.string;
import java.util.StringTokenizer;
public class StringToke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("SOFTTRONIX SOFTWARE SERVICES PVT LTD.");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens());
		{
			System.out.println(st.nextToken());
		}

	}

}
