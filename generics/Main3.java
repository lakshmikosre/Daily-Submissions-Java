package generics;

class Team<P,Q>
{
	private P name;
	
	private Q age;
	
	public P getName()
	{
		return name;
	}
	public Q getAge()
	{
		return age;
	}
	
	public void setName(P name)
	{
		this.name = name;
	}
	
	public void setAge(Q age)
	{
		
		this.age = age;
	}
}
 
public class Main3 {

	public static void main(String[] args) {
	 
		Team<String , Integer> team = new Team<>();
		
		team.setName("Virat Kohli");
		team.setAge(36);
		
		System.out.println("Player Name  :-" + team.getName());
		System.out.println("Age :-" + team.getAge());

	}

}
