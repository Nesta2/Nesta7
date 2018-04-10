import java.util.Scanner;

public class WhileLoopEx0{
public static void main(String[] args){
	int counter = 0;
	Scanner input = new Scanner(System.in);

	while(counter < 10 ){
	counter = counter + 1 ;

	}
	System.out.println("Looped using counter control:"+counter+"times");

	 counter = 0;

	 int sent = 1;

	 while(counter == 0){
		 System.out.print("Enter 0 to loop again. Other number to exit: ");

		if(input.nextInt() != 0){
			counter = 1;
		}else{
		sent = sent + 1;
 	   }
	}
	System.out.println("Looped using sentinel control: "+sent+" times.");
	}
}