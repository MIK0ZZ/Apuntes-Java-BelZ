
Dentro del mismo ámbito podemos tener métodos con el mismo nombre, tipo de retorno, mismo número de argumentos pero de **distinto tipo**.

```java
class A {
	public void show(float d){...}
	public void show(String cad){...}
	public void show(int i){...}
}
```

```java
A a = new A();
a.show(3f);
a.show(3);
a.show("hola");
```

(hacer esto es una chapuza pero existe)

[[12 Sobreescritura]]