package exceptionkeyword;

public class Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 50;
			int b = 00;
			int c = a / b;

			System.out.println(c);
		}
		//catch (ArithmeticException ae) {
		//	System.out.println(" please check the number");
		//}
		catch (Exception ae) {
		System.out.println(" super class Exception");
		}
		//finally {
		//	System.out.println("final");
	//	}
	}
}