// Fig. 2.1:Printlines
import java.util.Scanner; // program uses class Scanner
public class Printlines {

	// main method begins execution of Java application
	public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		String Name;
		String College;
		String Course;
		System.out.print("Enter your Name: ");
		Name = input.next();
		System.out.print("Enter your College: ");
		College = input.next();
		System.out.print("Enter your Course: ");
		Course = input.next();
		System.out.print("My name is "+Name+" I attend "+College+" and I study "+Course+"\n");

	} // end method main
} // end class Printlines
