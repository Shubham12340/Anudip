package inheritancepack;
class person
{
	private String name;
	private int age;
	
	//created a constructor of person class 
	public person(String name,int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	//declare method speak
	void speak()
	{
		System.out.println("Name of Student:"+name+"\nAge is:"+age);
	}
}

class Student1 extends person
{
	public Student1(String name,int age, String grade)
	{
		super(name,age);
		this.grade = grade;
	}
	void study()
	{
		System.out.println("Grade is:"+grade);
	}
}

public class InheritanceStudent 
{

	public static void main(String[] args) 
	{
		Student1 sobj = new Student1("Shubham",21,"B");
		//calling both the method of classes from student1 object
		sobj.speak();
		sobj.study();
	}

}
