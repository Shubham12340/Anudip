package collectionpack;

import java.util.ArrayList;

class Person
{
	private String name;
	private int age;
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class PersonObjectDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Shubham", 21));
        list.add(new Person("Vaibhav", 21));
        list.add(new Person("Vishal", 20));
        list.add(new Person("Prerna", 21));
        list.add(new Person("Sameera", 21));
        list.add(new Person("Nair", 18));
        list.add(new Person("Raju", 20));
        list.add(new Person("Kaju", 22));
        list.add(new Person("Chutki", 19));
        list.add(new Person("Ram", 21));
        
            for (Person person : list)
            System.out.println(person);
	}
}
