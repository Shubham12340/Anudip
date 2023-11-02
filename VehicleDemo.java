package inheritancepack;
class Vehicle
{
	//declare field for class Vehicle
	private String brand;
	private String model;
	private int year;
	
	public Vehicle(String brand,String model,int year)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	void drive()
	{
		System.out.println("Brand is :"+brand+"\nModel is:"+model+"\nYear is :"+year);
	}
}

//Created a child class car vehicle class 
class Car extends Vehicle
{
	private String color;
	public Car(String brand,String model,int year,String color)
	{
		super(brand,model,year);
		this.color = color;
	}
	//declare method honk
	void honk()
	{
		System.out.println("Color is :"+color);
	}
}
public class VehicleDemo 
{

	public static void main(String[] args) 
	{
		Car c = new Car("Audi","Fortuner",2007,"Black");
		c.drive();
		c.honk();
	}
}
