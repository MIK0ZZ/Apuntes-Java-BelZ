Cuando un método es susceptible de lanzar excepción, **siempre que sea posible** conviene darle un tratamiento adecuado. Para ello se usa `try` / `catch`.

Si un método tiene un bloque `try` / `catch` capaz de capturar todas las posibles excepciones que genere su ejecución, entonces el método ya **no lanza** excepción.

Cuando un método es susceptible de lanzar excepción, **siempre que sea posible** conviene darle un tratamiento adecuado. Para ello se usa `try` / `catch`.

Si un método tiene un bloque `try` / `catch` capaz de capturar todas las posibles excepciones que genere su ejecución, entonces el método ya **no lanza** excepción.

```java
try {
	//Código suscepctible a lanzar execpción
} catch (ClaseExcepcion_1) {
	//Tratamiento de la excepción
} catch (ClaseExcepcion_2) {
	//Tratamiento de la excepción
} [finally {
	//A ejecutar en cualquier caso
}] //[significa que es opcional como el default en los switch]
```

[[5 Funcionamiento]]