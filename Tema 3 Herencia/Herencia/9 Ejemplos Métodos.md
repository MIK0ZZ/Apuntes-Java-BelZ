
## Ejemplo 1


```java
public class A1 {
	public void m(){
		System.out.println("A1: metodo m");
	}
}
public class A2 extends A1 {}
public class A3 extends A2 {}
```

## Ejemplo 2

```java
public class A1 {
	public void m(){
		System.out.println("A1: metodo m");
	}
}
public class A2 extends A1 {
	public void m(){
		System.out.println("A2: metodo m");
	}
}
public class A3 extends A2 {}
```

```java
A3 a = new A3();
a.m();
```

## Ejemplo 3

```java
public class A1 {
	public void m(){
		System.out.println("A1: metodo m");
	}
}
public class A2 extends A1 {
	public void m(){
		System.out.println("A2: metodo m");
	}
}
public class A3 extends A2 {}
```

```java
A2 a = new A2();
a.m();
```

[[8 Métodos]]

## Ejemplo 4

```java

public class A1 {
	public void m(){
		System.out.println("A1: metodo m");
	}
}

public class A2 extends A1 {}

public class A3 extends A2 {
	public void m(){
		System.out.println("A3: metodo m");
	super.m();
	}
}

public class A4 extends A3 {}
```

[[10 Modificador `final`]]