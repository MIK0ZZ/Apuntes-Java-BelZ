
Consiste en que una clase tiene más de una superclase.

En Java la herencia múltiple está **prohibida** aunque puede obtenerse un comportamiento similar utilizando interfaces.

El principal problema de la herencia múltiple radica en la herencia en forma de diamante:
![[Pasted image 20240116190618.png]]

```java
A a = new D();
a.p(); //¿Que p() ejecutamos? (Es una pregunta retorica, no se puede ejecutar)
```

[[5 Casting]]