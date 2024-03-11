Si una subclase contiene un atributo con el mismo nombre que su superclase, entonces **toda** referencia a ese atributo en la implantación de la subclase **se referirá** al de la subclase.

Para hacer referencia al de la superclase hay que utilizar la palabra `super`.

```java
class Padre {
	protected int c;
	
	public Padre() {
		this.c = 15;
	}
}
```

```java
class Hija extends Padre {
	protected int c;
	
	public Hija() {
		super();
		this.c = 12;
	}
	
	public int suma(){
		return this.c + super.c;
	}
}
```

[[8 Métodos]]