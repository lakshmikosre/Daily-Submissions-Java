package softronix.exception;
import java.io.IOException;

class Test
{
	void add() throws Exception // caller method 
	{
		concat();// method calling
	}
	void concat()throws IOException // present metghod
	{
		throw new IOException("MyIOException");
	}
	
}

public class TestException {

	public static void main(String[] args) throws Throwable{
		       Test t = new Test();
		       t.add();
			}

}
