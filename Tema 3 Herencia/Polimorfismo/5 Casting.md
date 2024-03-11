
Si B contiene algún método no declarado en A, ni en ninguna de sus posibles superclases, entonces hay que hacer casting. Por ejemplo, si B implementa un método `m` que no está implementado en B, y tenemos la asignación:
`A a = new B();`

Entonces para llamar con `a` al método `m` debemos usar la siguiente sintaxis:
`((B) a).m(...)`

((B) a) hace un casting para que el tipo del objeto A pase a ser B.

[[6 Tipo de un objeto en ejecución]]