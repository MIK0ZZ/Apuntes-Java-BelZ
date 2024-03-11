Son clases "molde", es decir clases de las cuales se puede heredar pero **nunca** se pueden crear objetos de dicha clase.

Aunque no se pueden crear objetos de una clase abstracta, si **es posible** declarar objetos de ese tipo.

Una clase es abstracta si:
* Contiene algún método abstracto (un método que no contiene implementación, sólo su declaración). El método puede ser heredado.
* Si va precedida de la palabra `abstract`. En tal caso, podría ocurrir que ni siquiera tuviera métodos abstractos.

```java
abstract public class A {
	protected int x;
	A(){
		this.x = 0;
	}
	A(int xx){
		this.x = xx;
	}
	public int getX(){
		return this.x;
	}
	abstract public void increment();
}
```

```java
abstract public class A1 extends A {
	public A1(int xx) {
		super(xx)
	}
	// No se implementa el método increment
	// La clase tiene que ser necesariamente abstracta
}
```

```java
public class A2 extends A1 {
	private int y;
	public A2(int xx,int yy){
		super(xx);
		this.y = yy;
	}
	public void increment(){
		this.y = this.y + this.x;
	}
	public int getY(){
		return this.y;
	}
}
```


[[2 Interfaces y clases abstractas diferencias]]