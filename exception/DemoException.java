package softronix.exception;

class Student
{
	String sname;
	String subject;
	int marks;
	
	Student(String sname,String subject,int marks)
	{
		this.sname=sname;
		this.subject=subject;
		this.marks=marks;
		
	}
	void getStudent()
	{

		String status="";
		if(marks>=0 && marks<=100)
		{
			if(marks<35)
			{
				status="fail";
			}
			else if(marks>=35 && marks<50)
			{
				status="pass";
			}
			else if(marks>50 && marks<60)
			{
				status="B-Grade";
			}
			else if(marks>60 && marks<80)
			{
				status="Grade A";
			}
			else
			{
				status="A++";
			}
		}
		else
		{
			throw new RuntimeException("MarksOutOfRange");
		}
		
		System.out.println("=========Report Card============");
		System.out.println("Name of the Student  :"+sname);
		System.out.println("Subject of Student   :"+subject);
		System.out.println("Marks of the Student :"+marks);
		System.out.println("Status of the Student :"+status);
		System.out.println("-------------------------------");
		
		
		
	}
}

public class DemoException {

	public static void main(String[] args)  {
		
		Student std1=new Student("Sudhir","Java",85);
		std1.getStudent();
		Student std2=new Student("Sudhir","Python",95);
		std2.getStudent();
		Student std3=new Student("Rahul","Java",34);
		std3.getStudent();
		Student std4=new Student("Sumit","Java",110);
		std4.getStudent();
		Student std5=new Student("kunal","Java",60);
		std5.getStudent();
		
	}

}