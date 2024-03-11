Antes de hacer un casting se puede preguntar por el tipo del objeto en tiempo de ejecución. Podemos hacerlo de dos formas:

* Utilizando `getClass()`, heredado de la clase `Object`. Esto devolverá la clase exacta de un objeto en tiempo de ejecución.
* Utilizando `instanceof`. Esto comprobará si el objeto tiene un tipo compatible con la clase correspondiente.

```java
class Simple1 {
	public static void main(Strings args[]) {
		Simple1 s = new Simple1();
		System.out.println(s instanceof Simple1); // true
	}
}
```

---
#### Cambio de tema -> Clases Abstractas e Interfaces

[[1 Clases abstractas]]