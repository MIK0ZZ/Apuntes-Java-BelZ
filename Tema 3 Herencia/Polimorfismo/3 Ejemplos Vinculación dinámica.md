
## Ejemplo 1

```java
class A {
	public void p(int x){
		System.out.println(“p: A”);
	}
}

class B extends A {}

class C extends B {}

class D extends C {}
```

```java
B b = new C(); // Tipo estático B. Tipo dinámico C.
b.p(2); // ¿Correcto? R: Si xd
```

## Ejemplo 2

```java
class A {
	public void p(int x){
		System.out.println(“p: A”);
	}
}

class B extends A {
	public void p(int x){
		System.out.println(“p: B”);
	}
}

class C extends B {}

class D extends C {}
```

```java
B b = new C(); // Tipo estático B. Tipo dinámico C.
b.p(2); // ¿Correcto? ¿Qué escribe? R: Si, 'p: B'
```

## Ejemplo 3

```java
class A {}

class B extends A {
	public void p(int x){
		System.out.println(“p: B”);
	}
}

class C extends B {
	public void p(int x){
		System.out.println(“p: C”);
	}
}

class D extends C {}
```

```java
B b = new C(); // Tipo estático B. Tipo dinámico C.
b.p(2); // ¿Correcto? ¿Qué escribe? R: Si, 'p: C'
```

## Ejemplo 4

```java
class A {}

class B extends A {}

class C extends B {
	public void p(int x){
		System.out.println(“p: C”);
	}
}

class D extends C {}
```

```java
B b = new C(); // Tipo estático B. Tipo dinámico C.
b.p(2); // ¿Correcto? ¿Qué escribe? R: Si, 'p: C'
```

## Ejemplo 5

```java
class A {}

class B extends A {}

class C extends B {}

class D extends C {
	public void p(int x){
		System.out.println(“p: D”);
	}
}
```

```java
B b = new C(); // Tipo estático B. Tipo dinámico C.
b.p(2); // ¿Correcto? ¿Qué escribe? R: No, nada
```

[[4 Herencia múltiple]]