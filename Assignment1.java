import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Car ford = new Car("Ford", 2015);
		Car honda = new Car("Honda", 2022);
		Car toyota = new Car("Toyota", 1999);
		Car bmw = new Car("BMW", 2020);
		
	
		//List Demo
		System.out.println("ArrayList of Cars:");
		List<Car> garage = new ArrayList<Car>();
		garage.add(ford);
		garage.add(honda);
		garage.add(toyota);
		garage.add(bmw);
		for(int i=0; i<garage.size(); i++) {
			System.out.println(garage.get(i));
		}
		
		//Map Demo
		System.out.println("\nHashMap of cities:");
		HashMap<String, String> cities = new HashMap<String, String>();
		cities.put("Los Angeles", "California");
		cities.put("New York", "New York");
		cities.put("Chicago", "Illinois");
		cities.put("Houston", "Texas");
		for(Map.Entry<String, String> city : cities.entrySet()) {
			System.out.println(city.getKey() + ", " + city.getValue());
		}
		
		//Set Demo
		System.out.println("\nHashSet of colors:");
		HashSet<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("purple");
		colors.add("blue");
		colors.add("red");		
//		System.out.println(colors + "\n");
		for(String c : colors) {
			System.out.println(c);
		}
		System.out.println();
		
		//File I/O Demo
		try {
			File fruits = new File("fruits.txt");
			if(fruits.createNewFile()) {
				System.out.println("Created file: " + fruits.getName());
			} else {
				System.out.println("This file already exists");
			}
		} catch(IOException e) {
			System.out.println("Error: unable to create file!");
			e.printStackTrace();
		}
			
		try {
			FileWriter writer = new FileWriter("fruits.txt");
			writer.write("apples are red\n");
			writer.write("bananas are yellow\n");
			writer.write("oranges are orange\n");
			writer.write("kiwis are green\n");
			writer.close();
		} catch(IOException e) {
			System.out.println("Error: unable to write to file!");
			e.printStackTrace();
		}
		
		try {
			File fruits = new File("fruits.txt");
			Scanner scanner = new Scanner(fruits);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
			if(fruits.delete()) {
				System.out.println("Deleted file: " + fruits.getName());
			} else {
				System.out.println("Unable to delete file " + fruits.getName());
			}
		} catch(FileNotFoundException e) {
			System.out.println("Error: file not found!");
			e.printStackTrace();
		}
	}
}
