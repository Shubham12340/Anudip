package threadpack;

class SquareThread extends Thread
{
	public void run()
	{
        //Declare a array with the type integer 
		int arr[] = {1,20,50,15,30};
		System.out.print("Squares of numbers:");
        for (int num : arr) 
            System.out.print(num * num+" ");
	}	
}
class SumThread extends Thread
{
	public void run()
	{
		int sum = 0;
        for (int i = 1; i <= 10; i++) 
            sum += i;
        System.out.println("Sum of the first 10 numbers: " + sum);	
    }
}

public class ThreadOperationDemo 
{
	public static void main(String[] args) 
	{
		SquareThread st =  new SquareThread();
		SumThread sumt =  new SumThread();
        sumt.setPriority(10);
		sumt.start();
		st.start();
	}
}