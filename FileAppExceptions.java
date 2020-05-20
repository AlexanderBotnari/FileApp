import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileAppExceptions {

	public static void main(String[] args) {
     	        
		String pizza = "Pizza 75.00 2\n";
		String kebab = "Kebab 45.00 1\n";
		String cola  = "Cola   9.50 3";
		
		double total_price = 75.00 + 45.00 + 9.50;
		
	    FileWriter order;
	    try {
		order = new FileWriter("orders.txt");
		order.write(pizza + kebab + cola );
		order.close();
	    }catch (IOException e) {
                System.err.println("Operation failed!");
	    }
	    
		File file = new File("orders.txt");
		String food;
	        Scanner scanner;
			try {
			    scanner = new Scanner( file );
			    for(int i = 1 ; i <= 3 ; i++) {
			    food = scanner.nextLine();
			    System.out.println(food);
			    }
			    System.out.println("--------------------");
			    System.out.println("Total price : "+total_price); 
			 }catch (FileNotFoundException e) {
				System.err.println("File not found!");
			 }catch(InputMismatchException e) {
				System.err.println("Wrong format data!");
                         }catch(NullPointerException e) {
				System.err.println("Something is wrong!");
                         }finally{
            	                System.out.println("GOOD LUCK!!!");
                         }
		}
	}
