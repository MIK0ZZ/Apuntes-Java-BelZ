package main;

import java.io.Closeable;
import java.io.File;
// Reading data from a file using FileReader 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner; 
/**
 * I've written a Java program which reads a series of real numbers from a text file 
 * into an array. I would like to use -1.0 as a sentinel so that scanner 
 * stops reading from the file when it reaches -1.0.
 */
class Main {
	public static void main(String[] args) throws FileNotFoundException {
		// Create file and scanner objects
		File inputFile = new File("./src/data/input.txt");
		Scanner in = new Scanner(inputFile);

		// Read numbers from file, add to array and determine min/max values
		while (in.hasNextDouble()) {
			System.out.println(in.nextDouble());
		}
	}
}

