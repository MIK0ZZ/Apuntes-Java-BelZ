public class Main {
	public static void main(String[] args) throws ExceptionDivisionByZero, ExceptionNegativeNumber {
		Arithmetic a = new Arithmetic(2,0);
		int z = a.division();
		System.out.println(z);
	}
}