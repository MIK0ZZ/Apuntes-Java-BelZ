Una excepción es un **evento** que puede ocurrir durante la ejecución de un programa y que **interrumpe** la ejecución normal del mismo.

Cuando se genera una excepción dentro de un método, el método **crea** un objeto y lo lanza. Dicho objeto se denomina `execption object` y contiene información sobre el error, incluyendo el **tipo** de error y l **estado** dl programa cuando ocurrió el error.

Las excepciones se pueden **capturar** para tratarlas de forma adecuada y dejar la aplicación en un estado **estable**.

Existen tres tipos fundamentales de errores:

* **Errores**: Indican un error **irrecuperable**. Lo normal es que el programa se interrumpa.
* **Excepciones no comprobables**: Se generan en **tiempo de ejecución**. Por ejemplo invocar a un método usando una variable a `null`.
* **Excepciones comprobables**: Constituyen **fallos menores**, como leer de un fichero que no existe.

Existen tres tipos de soluciones que podemos aplicar:

* *Separar el manejo de errores del código normal*: el código susceptible de generar excepciones se **separa** del resto de código. Fácilmente localizable.
* *Propagar los errores sobre la pila de llamadas*: Si un método lanza una excepción, o bien la **captura** o bien la **relanza** sobre la pila de llamadas.
* *Agrupar los errores y diferenciarlos*: Permite tratar de forma similar errores **similares**.

Una excepción se puede producir por varios motivos:

* Porque un método reciba datos de entrada que **no sabe** procesar.
* Porque se produzca una situación excepcional, como por ejemplo invocar a un método con un objeto a null: `NullPointerException`.
* Porque se produzca un **error de entrada/salida**. Por ejemplo intentar leer un fichero que no existe: `IOException`.

Cuando un método lanza una excepción, puede:

* **Tratarla** de forma que la aplicación siga estable.
* **Lanzarla** para que otro método (siguiendo la pila de llamadas) la trate.

[[2 Lanzamiento]]