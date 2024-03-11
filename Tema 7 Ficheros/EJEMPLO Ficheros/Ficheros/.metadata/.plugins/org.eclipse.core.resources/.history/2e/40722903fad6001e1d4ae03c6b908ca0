package main;

import java.io.Closeable;
import java.io.File;
// Reading data from a file using FileReader 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner; 

class Main {
	public static void main(String[] args) throws Exception {
		// passing the file’s path
		FileReader file = new FileReader("./src/data/jugadores.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		// close the file
		file.close();
	}
}