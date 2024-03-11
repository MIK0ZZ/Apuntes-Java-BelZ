package main;

import java.io.Closeable;
import java.io.File;
// Reading data from a file using FileReader 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner; 

class Main {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("./src/data/input.txt");
			int character;

			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}