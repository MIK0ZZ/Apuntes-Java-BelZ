
Consideramos la clase ``Arithmetic``. Además, asumimos que las clases ``ExceptionNegativeNumber`` y ``ExceptionDivisionByZero`` extienden de la clase ``Error``.

```java
public static void main(String[] args){
	try {
		Arithmetic a = new Arithmetic(-2,3);
		int z = a.division();
		System.out.println(z);
	} catch (ExceptionDivisionByZero e){
		System.out.println(e.getMessage());
	} catch (ExceptionNegativeNumber e){
		System.out.println(e.getMessage());
	} System.out.println("La ejecución sigue a partir de aquí");
}
```

Debemos considerar **todas** las excepciones que un código puede lanzar.

*Antes* (Solo la de DivisionByZero)
```java
public static void main(String[] args){
	try { Arithmetic a = new Arithmetic(-2,3);
		int z = a.division();
		System.out.println(z);
	} catch (ExceptionDivisionByZero e){
		System.out.println(e.getMessage());
	} System.out.println("La ejecución sigue a partir de aquí");
}
```

*Después* (Con la NegativeNumber)
```java
public static void main(String[] args){
	Arithmetic a = new Arithmetic(-2,3);
	try {
		int z = a.division();
		System.out.println(z);
	} catch (ExceptionDivisionByZero e){
		System.out.println(e.getMessage());
	} catch (ExceptionNegativeNumber e){
		System.out.println(e.getMessage());
	} finally {
		System.out.println("En último lugar entro aquí");
	} System.out.println("La ejecución sigue a partir de aquí");
}
```

[[6 Aclaraciones (Extra)]]