package Arrayprogram;

import java.util.Scanner;

public class SmallLargeDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		
		//Taking input from user
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter a number:");
			arr[i]=sc.nextInt();
		}
		
		//Display array elements 
		System.out.print("Numbr in array are:");
		for(int i=0;i<0;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//Calculate Larg and Small numbers
		int largest = arr[0],smallest=arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			} else if(arr[i]<smallest)
			{
				smallest =arr[i];
			}
		}
		System.out.print("\nSmallest number in array :"+smallest);
		System.out.print("\nLargest number in array :"+largest);
		sc.close();
	}

}
