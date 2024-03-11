
Un bloque `try` / `catch` puede contener tantos `catch` como se desee.

Los `catch`, en caso de que exista una jerarquía de excepciones, deben ir **ordenados** de forma correcta, esto es, desde **abajo** de la jerarquía **hacia arriba**.

Si no están relacionadas, entonces el orden es **irrelevante**.

Como norma siempre indicaremos en la cabecera de un método (cuando sea posible) el tipo de excepción concreta que lanza. Intentaremos **evitar** poner super clases.

Da igual que la excepción se capture o no; si se ejecuta un bloque `try`, entonces su `finally` correspondiente **siempre** se ejecuta.

---
#### Cambio de tema -> Ficheros

[[1 Definición]]
