
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Java does not allow to declare any "METHODS" in main block
	
	MethodsDemo d = new MethodsDemo();
	d.getData();
	
// We can access methods from another class (MethodsDemo2)
//by creating object of methoddemo2 class
	
	MethodsDemo2 d2 = new MethodsDemo2();
	d2.getUserData();
	
	String name=d.getData();
	System.out.println(name);
	
	}

	public String getData()
	{
		System.out.println("Hello World");
		return "Prasanna";
	}
		
	public String getData1()
	{
		return "Prasanna Rahavi";
	}
// by using STATIC - methods will belong to the class level by not creating object

	public Static String getData2()
	{
	System.out.println("Hello World");
	return "Prasanna Rahavi";
	}
}


