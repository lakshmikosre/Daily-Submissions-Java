package CollectionFramework;
import java.util.ArrayList;
import java.util.List;

class Collection
{
	public static void main(String[]args){
		
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.add(5);
		System.out.println(list);
		list.add(10);
		System.out.println(list);
	    
		list.add(1,69);
		System.out.println(list);
		
	}
}