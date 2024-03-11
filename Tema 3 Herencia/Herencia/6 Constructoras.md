
Para inicializar a un objeto de una subclase es necesario invocar a **alguna** constructora de su superclase.

En caso de no poner la llamada explícita, se invocará por **defecto** a la constructora sin argumentos de la superclase.

La invocación a la constructora de la superclase debe ser **la primera** instrucción de cualquier constructora de la subclase.

Para invocar a la constructora sin argumentos de la superclase:

`super();`

Para invocar a una constructora con argumentos:

`super(a1, ..., an)`

```java
public class A1 {
	public A1() {
		System.out.println("A1: Por defecto");
	}
	public A1(int x) {
		System.out.println("A1: Un argumento");
	}
	
}

```

```java

public class A2 extends A1 {
	public A2(){
		System.out.println("A2: Por defecto");
	}
	public A2(int pp){
		super(pp); // ¿Y si se quita?
		System.out.println("A2: Un argumento");
	}
}
```

```java
A2 a = new A2();
A2 b = new A2(2);
```

```java
public class A3 extends A2 {
	public A3(){
		System.out.println("A3: Por defecto");
	}
	public A3(int p1, int p2){
		super(p1);
		System.out.println("A3: Dos argumentos");
	}
}
```

```java
public class A4 extends A3 {
	public A4(int x){
		super(x,x);
		System.out.println("A4: Un argumento");
	}
}
```

```java
A3 a = new A3();
A3 b = new A3(2,3);

A4 a = new A4(2);
```

[[7 Colisión de nombres con herencia]]