package generics;

class Student<T,U>
{
	private T name ;
	private U rollno ;
	
	public T getName()
	{
		return name;  
    }
	public U getRollno()
	{
		return rollno;
	}
	public void setName(T name)
	{
		this.name = name;
	}
	public void setRollno(U rollno)
	{
		this.rollno = rollno;
	}

	class Main2 {
	    public  void main(String[] args) {
	        // Create a Student object with String for name and Integer for rollno
	        Student<String, Integer> student = new Student<>();

	        // Set values
	        student.setName("John");
	        student.setRollno(101);

	        // Get and print values9
	        System.out.println("Name: " + student.getName());
	        System.out.println("Roll No: " + student.getRollno());
	    }
	}
}
