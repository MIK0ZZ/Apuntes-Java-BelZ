
Los métodos que tiene la clase CustomReadFile son `void closeReadFile()` (hay que controlar la excepción que seguramente lance e imprimir el mensaje de forma bonita)

`public class CustomReadFile implements ICustomReadFile {}` debe implementar los 2 métodos porque sino se transforma en una clase abstracta

---
Esta clase tiene un método llamado `ArrayList leerJugadores()` 

```txt
21 Marta
42 Jonathan
19 Sara
```

esta clase no va a devolver void, va a devolver ArrayList de tipo `Player`. Que va a leer el primer jugador y cuando cree un jugador lo mete en el array.

---

La clase récord tiene el método que carga el ranking el cual debe crear un objeto de la clase `CustomReadFile`. En el método cargar ranking hay que cargar un ArrayList que obtenga el ArrayList de la clase CustomReadFile (lo de antes) `ArrayList<> jugadores = file.LeerJugador();` para obtener los jugadores.

Luego hay que recorrer el ArrayList y añadirle los jugadores al ArrayList top10.


**APUNTE PARA EL FUTURO: 5 de marzo 2024, me has dicho que puedo quedarme con el ArrayList y no tengo por que cambiarlo a un array primitivo.**

---

La interfaz `ICustomWriteFile` tiene el método que cierra el fichero y el que escribe jugadores. El método `writeJugadores(String _string)` debe recibir un string. La línea de codigo es `this.write(chain)`. Falta el bloque de la excepcion (va a lanzar excepciones)

La clase `CustomReadFile` y `CustomWriteFile` extiende de `FileWriter`. Es decir extends e implements en el titulo xdd.

`public class CustomWriteFile extends FileWriter implements ICustomFileWriter {}`