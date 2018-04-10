import java.util.Scanner;

public class GuessGame2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int number = (int) Math.ceil(Math.random() * 100);
    System.out.println(number);


    int counter = 0;
    while(counter < 6){
    counter++;

       System.out.print("Guess a number from 1 to 100: ");
       int guess = input.nextInt();
       System.out.println();
       if(guess == number){
        System.out.println("Good guess, it was "+number);
       }else{
		   if(guess > number){
       System.out.println("Bad guess, Try again...");
       System.out.println("Hint: it was lower");
   }else{
	   System.out.println("Hint it was higher");
       }

       System.out.println();
   }
}
	System.out.println("Game over..");
}
}
