
public class Lab1234 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			int res = 10 / 3;
			System.out.println("result" + res);
			return;

		} catch (Exception E) {
			System.out.println("invalid input");

		} finally {
			System.out.println("finally block");
			System.out.println("Main Completed");
		}
	}

}
