
| Descripción                                                                                 | Declaración                                               |
| ------------------------------------------------------------------------------------------- | --------------------------------------------------------- |
| Constructor. Requiere de un `InputStream`                                                   | `Scanner(InputStream source)`                             |
| Constructor. Requiere de un objeto que implemente `Readable` (por ejemplo un `FileReader`). | `Scanner(Readable source)`                                |
| Constructor. Requiere un `String`                                                           | `Scanner(String source)`                                  |
| Cerrar.                                                                                     | `void close()`                                            |
| Leer una línea.                                                                             | `String nextLine()`                                       |
| Indica si quedan líneas por leer.                                                           | `boolean hasNextLine()`                                   |
| Lee un booleano.                                                                            | `boolean nextBoolean()`                                   |
| Indica si es posible leer una palabra que se interprete como un booleano/double/int.        | `boolean hasNextBoolean(), hasNextDouble(), hasNextInt()` |
| Leer una palabra.                                                                           | `String next()`                                           |
| Indica si quedan más palabras o datos por leer.                                             | `boolean hasNext()`                                       |
| Leer un double.                                                                             | `double nextDouble()`                                     |
| Leer un int.                                                                                | `int nextInt()`                                           |
| Cambia el delimitador que separa los ítems.                                                 | `Scanner useDelimiter(String pattern)`                    |

[[3 Excepciones de la clase Scanner]]