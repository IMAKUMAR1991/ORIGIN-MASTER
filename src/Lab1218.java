
public class Lab1218 {

	public static void main(String[] args)  {
		System.out.println("Main Started");
		try {
			String data = args[0];
			int x = Integer.parseInt(data);
			int res = 10 / x;
			System.out.println("Result" + res);
		}
		catch (Exception e) {
			System.out.println("Enter correct Value");
}
		System.out.println("Main Completed");
  }
}
