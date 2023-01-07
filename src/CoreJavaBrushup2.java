import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {1,2,4,5,6,8,9,10,122};	
		// check if array has multiple of 2 using if else condition 2,4,6,8,10,122
	for(int i=0;i<arr2.length;i++)
	{
		if(arr2[i]%2==0)
		{
			System.out.println(arr2[i]);
		}
		else
		{
			System.out.println(arr2[i] + "is not multiple of 2");
		}
	}
	//Arraylist - dynamically increase size of the array
	//Create object of the class - object.method
	ArrayList<String> a = new ArrayList<String>();
	a.add("Prasanna");
	a.add("Learning");
	a.add("Selenium");
	System.out.println(a.get(2));
	
	for(int i = 0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println("*****************");
	for(String val : a)
	{
		System.out.println(val);
	}
	
	//To check a item is present in Arraylist
	System.out.println(a.contains("Selenium"));
	
	// Shorcut for normal array is present then change to list and use as arraylist
	String[] name = {"rahul","shetty","selenium"};
	List<String> nameArrayList =Arrays.asList(name);
	nameArrayList.contains("selenium");
	}
	
}
