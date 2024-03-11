En la implementación de la clase `SubClase` podemos utilizar todos los atributos públicos y protegidos de la clase `SuperClase`, pero **nunca** los privados.

El identificador `protected` para métodos y atributos/campos indica que estos se comportan como **públicos** en presencia de herencia.

En caso de que no haya herencia, `protected` se comporta como atributo público dentro del paquete que contiene a la clase.

[[6 Constructoras]]