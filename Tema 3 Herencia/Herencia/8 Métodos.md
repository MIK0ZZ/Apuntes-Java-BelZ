
Al igual que los campos, los métodos públicos y protegidos **también** se heredan.

Cualquier método heredado se puede **redefinir**. Se denomina **sobre escritura** de un método.

Cuando se invoca a un método, primero se busca si dicho método existe en la clase del objeto (es decir, en la clase asociada a su `new`). Si existe, se ejecuta. En otro caso, se sube por la jerarquía de clases hasta encontrarle. Y una vez que se encuentra, se ejecuta.

También es posible redefinir un método e invocar dentro de su cuerpo al equivalente en su superclase.

[[9 Ejemplos Métodos]]

Cuando se redefine un método es posible invocar al de la superclase utilizando el objeto `super`.

`super.m();`

Utilizar `super` supone subir por la jerarquía de clases **hasta encontrar** el método con ese nombre y argumentos del mismo tipo.

