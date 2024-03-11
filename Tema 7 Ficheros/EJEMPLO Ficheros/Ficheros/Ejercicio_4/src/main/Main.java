package main;

//Creating a text File using FileWriter 
import java.io.FileWriter; 
import java.io.IOException; 

class Main {
	public static void main(String[] args) throws IOException {
		try {
			FileWriter f = new FileWriter("./src/data/output.txt");
			f.write("Voy a sacar un 10 en el examen!");
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Fin del programa.");
	}
} 