
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int myNum = 5;
       String website = "Rahul Shetty Academy";
       char letter = 'r';
       boolean mycard = true;
       double dec = 5.99;
       System.out.println(myNum+ " is the value stored in the myNum variable");
	   System.out.println(website);
	   System.out.println(mycard);
	//Arrays - declared in 2 ways
	   int[] arr = new int[5];
	   arr[0] = 1;
	   arr[1] = 2;
	   arr[2] = 4;
	   arr[3] = 5;
	   arr[4] = 6;
	   System.out.println(arr[3]);
	// Array - 2nd way
	   
	   int[] arr2 = {1,2,4,5,6,8,9,10,122};
	   System.out.println(arr2[1]);
	   
	   //FOR LOOP arr.length - 5
	   for(int i = 0; i<arr.length; i++)
	 {
      System.out.println(arr[i]);
	   }
	  //FOR LOOP 2nd way
	   for(int i =0;i<arr2.length;i++)
	   {
		   System.out.println(arr2[i]);   
	   }
	   //for string array
	   String[] name= {"Prasanna","Learning","Selenium"};
	   for(int i=0;i<name.length;i++)
	   {
		   System.out.println(name[i]);   
	   }
	   //Enhance for loop - simplified method
	   for(String s: name)
	   {
		   System.out.println(s);
	   }
   } 
}
