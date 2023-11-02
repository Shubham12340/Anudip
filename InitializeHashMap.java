package collectionpack;

import java.util.HashMap;

public class InitializeHashMap 
{

	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("A", 10);
		hm.put("B", 50);
		hm.put("V", 60);
		hm.put("W", 80);
		
		System.out.println("Contain of hash map is :"+hm);
	}

}