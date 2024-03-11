
Para lanzar una excepción se utiliza: 

`throw new NombreException(...)`

Si un método lanza una excepción, su cabecera **debe** indicarlo.

`visibilidad tipo nombreMétodo throws NombreException {...}`

---
```Java
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
```

```java
public class ExceptionDivisionByZero extends Throwable {
	public ExceptionDivisionByZero(){
		super();
	}
}
```
---

Cuando se lanza una excepción con `trhow`, con lo que se lanza realmente es un **objeto** de una clase que representa una excepción.

La clase correspondiente a la excepción debe de **existir** y puede contener distintas constructoras y/o métodos.

Un método puede lanzar **distintos** tipos de excepciones.

Cuando la excepción se lanza, esta **sube** por la pila de llamadas hasta que es **capturada** o bien **interrumpe** abruptamente la aplicación.

---
```java
public static void main(String[] args) throws ExceptionDivisionByZero {
	Arithmetic a = new Arithmetic(2,0);
	int z = a.division(); // Lanza excepción “División entre 0”
	System.out.println(z);
}
```

`Exception in thread "main" excepciones.ExceptionDivisionByZero`
	`at excepciones.Arithmetic.division(Arithmetic.java:9)`
	`at excepciones.Main.main(Main.java:8)`

```java
public int division() throws ExceptionDivisionByZero, ExceptionNegativeNumber {
	if (this.a < 0 || this.b < 0) {
		throw new ExceptionNegativeNumber("Error: Negative number");
	} else if (this.b == 0) {
		throw new ExceptionDivisionByZero("Error: Division By Zero");
	} else return {
		this.a / this.b;
	}

}
```
---
```java
public class ExceptionDivisionByZero extends Throwable {
	public ExceptionDivisionByZero(){
		super();
	}
	public ExceptionDivisionByZero(String message){
		super(message);
	}
}
```

```java
public class ExceptionNegativeNumber extends Throwable {
	public ExceptionNegativeNumber(String message){
		super(message);
	}
}
```
---
```java
public class Main {
	public static void main(String[] args) throws ExceptionDivisionByZero, ExceptionNegativeNumber {
		Arithmetic a = new Arithmetic(2,0);
		int z = a.division();
		System.out.println(z);
	}
}
```
---

[[3 Árbol]]