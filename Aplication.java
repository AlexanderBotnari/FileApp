import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) throws IOException {
		
     	        String pizza = "Pizza 75.00 2\n";
		String kebab = "Kebab 45.00 1\n";
		String cola  = "Cola   9.50 3";
		
		double total_price = 75.00 + 45.00 + 9.50;
		
	    FileWriter order = new FileWriter("orders.txt");
    	    order.write(pizza + kebab + cola );
	    order.close();
	
	    File file = new File("orders.txt");
	    String food;
		if(file.exists()) {
			System.out.println("File Found !!!");
			System.out.println("--------------");
			Scanner scanner = new Scanner( file );
			for(int i = 1 ; i <= 3 ; i++) {
			    food = scanner.nextLine();
			    System.out.println(food);
			}
			System.out.println("--------------------");
			System.out.println("Total price : "+total_price);
		}else {
			System.err.println("File Not Found! ");
		}
       }
}
