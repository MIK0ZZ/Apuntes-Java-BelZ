public class Arithmetic {
	private int a;
	private int b;
	
	public Arithmetic(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int division() throws ExceptionDivisionByZero {
		if (this.b == 0) {
			throw new ExceptionDivisionByZero();
		} else { return this.a / this.b; }
	}
}