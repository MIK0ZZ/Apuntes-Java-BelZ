
Al establecer una jerarquía de clases, algunas pueden sobrescribir métodos.

En **tiempo de ejecución** se decide qué método se debe aplicar (vinculación dinámica) de acuerdo a las siguientes reglas:
```java
A a = new B(...);
a.p(...);
```

1. Se comprueba que p(...) está definido en A (tipo estático) o en alguna superclase de A. En otro caso, error.
2. Desde B subiendo por sus superclases, buscamos la primera implementación de p(...) y la aplicamos.

[[3 Ejemplos Vinculación dinámica]]