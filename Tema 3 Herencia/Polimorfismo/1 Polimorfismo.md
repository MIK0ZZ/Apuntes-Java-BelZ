
De momento hemos visto:

* Sobrecarga: dos métodos tienen el mismo nombre, mismo tipo de retorno pero difieren en los parámetros (número y/o tipo).
* Sobreescritura: Una clase hija redefine un método de su superclase.

Con el polimorfismo entran en juego las variables polimórficas. Una variable polimórfica no es más que una variable que se declara de un tipo (clase) pero en **tiempo de ejecución** puede contener valores de distinto tipo (subclase).

El término polimorfismo significa que hay un nombre (variable, método o clase) y muchos significados diferentes (distintas definiciones).

El polimorfismo implica que toda variable tiene un tipo **estático** y otro **dinámico**.

El _tipo estático_ es el tipo asociado en la **declaración**.

El _tipo dinámico_ es el tipo del objeto **contenido** dentro de una variable.

```java
A a = new B();

//Tipo estático: A
//Tipo dinámico: B

```

TE (x): Tipo Estático de la variable x.

CTD (x): Conjunto de posibles Tipos Dinámicos de x.

![[Pasted image 20240116183558.png]]

Dada una jerarquía de clases:

```java
public class A {...}
public class B extends A {...}
public class C extends B {...}
```

Podemos asignar a un elemento de una superclase cualquiera de sus subclases:

```java
A a1 = new B();
A a2 = new C();
B b = new C();
```

Cuando una clase B extiende a una clase A hay que entender que la clase A está **contenida** en la clase B (por es B la extiende).

Por ejemplo, si A = animales y B = perros, está claro que un perro siempre es un animal, pero un animal no es siempre un perro. Por lo tanto tiene sentido:

```java
A a = new B(); // Un perro es un animal
```

Pero no tiene sentido:

```java
B b = new A(); // Un animal no tiene por que ser un perro 
```


[[2 Vinculación dinámica]]