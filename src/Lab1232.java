
public class Lab1232 {
public static void main(String[] args) {
	System.out.println("Main Started");
	try{
		int res=10/0;
		System.out.println("result:"+res);
	}
catch(NumberFormatException e){
	System.out.println("Invalid input");
	
}
	finally{
		System.out.println("Finally block");
		System.out.println("main Completed");
	}
}
}