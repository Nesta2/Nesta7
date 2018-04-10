import java.util.Scanner;

public class Grades{

	public static void main (String[] args){

	Scanner input = new Scanner(System.in);

	int x;

	System.out.print("Enter a number between 1 and 100");
	x = input.nextInt();

	if(x >= 85){
		System.out.println("Your grade is A");
	}else{
		if(x >= 70){
			System.out.println("Your grade is B");
		}else{
			if(x >= 55){
				System.out.println("Your grade is C");
			}else{
				if(x >= 55){
					System.out.println("Your grade is D");
				}else{
					System.out.println("Fail");
				}
			}
		}
	}
}
}



