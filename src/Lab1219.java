
public class Lab1219 {

	public static void main(String[] args) {
		try {
			String data = args[0];
			int x = Integer.parseInt(data);
			int res = 10 / x;
			System.out.println("Result" + res);
			}
		   catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("PROVOIDE one value as CLA ");
		}
		catch (NumberFormatException e) {
			System.out.println("PROVOIDEINT value as CLA");
		
		}
		catch (ArithmeticException e) {
			System.out.println(" PROVIDE NON ZERO INT VALUE AS CLA");
			}
		System.out.println("Main completed");
		}
}
