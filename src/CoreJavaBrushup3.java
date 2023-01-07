
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //String is an object // 
	//1. defining string using String Literal
		String s = "Rahul Shetty Academy";
		String S4 = "Hello";
    //it wont allocate memory for S1 bcoz of same value in S	
		String S1 = "Rahul Sheet Academy"; 
	
	//2. defining string with "NEW" memory operator
		String S2 = new String("Welcome");
		String S3 = new String("Welcome");
		
		String S5 = "Prasanna Learning Selenium";
       // String[] splittedString = S5.split(" ");
       // System.out.println(splittedString[0]);
      //  System.out.println(splittedString[1]);
      //  System.out.println(splittedString[2]);
        
        String[] splittedString = S5.split("Learning");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        
    //Removing space before selenium using "TRIM"
        
        System.out.println(splittedString[1].trim());
        
	// Printing char by char
        
	for(int i=0;i<S5.length();i++)
	{
		System.out.println(S5.charAt(i));
	}
	
	// Printing String in REVERSE ORDER
	for(int i=S5.length()-1;i>=0;i--)
	{
		System.out.println(S5.charAt(i));
	}
	
}
	
}
