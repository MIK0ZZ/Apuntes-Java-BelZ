
La complejidad algorítmica no tiene una relación directa con la recursividad, pues se trata de un concepto que viene a representar la cantidad de recursos que un algoritmo (ya sea *iterativo* o *recursivo*) necesitará para resolver un problema determinado en el peor de los casos. Sin embargo, ahora que se ha explicado la recursividad es cuando se puede comprender mejor este concepto que permitirá determinar cuán buena es una solución frente a otra.

En realidad, puede existir un gran número de parámetros a tener en cuenta, pero generalmente el estudio se centra en el *tiempo de ejecución* y el *espacio de memoria consumida*. La complejidad se mide utilizando la *notación Big-O* que representa la eficiencia del algoritmo y que permite conocer cómo se comportará en función del número de argumentos que reciba. Las *órdenes de complejidad* existentes se exponen en el cuadro 11.1

| Orden | nombre | Descripción |
| ---- | ---- | ---- |
| O(1) | constante | La complejidad no variará en función del tamaño del dato. |
| O(log n) | logarítmica | Suele corresponder a algoritmos que acotan el problema para abordarlo. Se puede encontrar en bucles en los que la evolución de la variable de control no es lineal o en algoritmos recursivos de *búsqueda dicotónica*. |
| O(n) | lineal | La complejidad es directamente proporcional al tamaño de los datos. Se puede encontrar en bucles que realizan N iteraciones (while o for), algoritmos de búsqueda lineal, cálculo de factorial... |
| O(n log n) | cuasi lineal | Se encuentra en algoritmos que aplican el lema "divide y vencerás". Resuelven el problema dividiéndolo en problemas mas sencillos que resuelve por separado para posteriormente formar la solución. Algunos ejemplos son los algoritmos de ordenación rápida (*quick sort*) o el de ordenación por mezcla (*merge sort*) |
| O(n^2) | cuadrática | Se presenta cuando hay que evaluar todos los emparejamientos de elementos de un conjunto. Bucles anidados de 2 niveles (matrices) |
| O(n^3) | cúbica | Bucles anidados de 3 niveles |
| O(n^a) | polinomial | Bucles anidados de *a* niveles (a>2) |
| O(a^n) | exponencial | En este tipo de orden a>1. La complejidad crece enormemente a medida que van creciendo los datos de entrada. un ejemplo típico son los algoritmos que resuelven problemas por fuerza bruta, los que calculan la secuencia de Fibonacci o el algoritmo de las torres de Hanoi |
| O(n!) | factorial | Es la menos deseable de todas y generalmente se asocia con problemas intratables o resolubles mediante fuerza bruta |
