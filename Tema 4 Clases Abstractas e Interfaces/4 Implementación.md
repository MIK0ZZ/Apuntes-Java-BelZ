Una clase **puede** implementar una o varias interfaces.

Implementar una interfaz significa **implementar** métodos de la interfaz. Si la clase no implementa algún método de la interfaz, entonces la clase es necesariamente abstracta.

La clase, además, puede tener métodos propios. Si no implementa algún método, entonces es abstracta.

Para poder utilizar una constante declarada en una interfaz, o un atributo estático, es necesario **anteponer** el nombre de la interfaz a la constante.

> Tarea: crea una interfaz y una clase que la implemente. Declara constantes y/o atributos estáticos en ella y observa cómo funcionan.

La jerarquía entre interfaces permite la herencia simple y múltiple.

* Una clase puede implementar varias interfaces.
* Una interfaz puede "extender" a otras interfaces, pero no puede implementarlas.
* Una interfaz no puede tener métodos estáticos (un método estático no puede ser abstracto).

Una clase puede, **simultáneamente**, heredar de otra clase e implementar **una o varias** interfaces.

```java
public class Clase extends SuperClase implements I1, ..., In {
	// Implementación de la clase.
}
```

Una interfaz es un tipo, por lo tanto, el tipo se puede utilizar en cualquier lugar donde se pueda utilizar el identificador de un tipo o de una clase.

---
#### Cambio de tema -> Excepciones

[[Tema 6 Excepciones/1 Introducción|1 Introducción]]
