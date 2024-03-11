
```java
public class Persona {
	protected long dni;
	protected String nombre;
	public Persona() {
		dni = -1;
		nombre = “”;
	}
	public Persona(long dni, String n){
		this.dni = dni;
		this.nombre = n;
	}
	public void setDNI(long dni) {
		this.dni = dni;
	}
	public void setNombre(String n){
		this.nombre = n;
	}
}
```

```java
public class Alumno extends Persona {
	private long idMatricula;
	private int creditosAprobados;
	public Alumno() {
		this.idMatricula = -1;
		this.creditosAprobados = 0;
	}
	public void setIdMatritula(long id) {
		this.idMatricula = id;
	}
	public void setCreditosAP(int ca) {
		this.creditosAprobados = ca;
	}
}
```


Como hemos visto, puedo usar los métodos **heredados** de su super clase y, además, los nuevos métodos que hayamos definido en la propia clase `Alumno`

[[5 Niveles de Protección]]