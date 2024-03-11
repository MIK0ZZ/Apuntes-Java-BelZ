package main;

// Reading data from a file using FileReader 
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

class Main {
	public static void main(String[] args) throws IOException {
		try {
			FileWriter f = new FileWriter("https://cdn.educba.com/Users/praashibansal/Desktop/Data/test.txt");
			f.write("Hello");
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}
}