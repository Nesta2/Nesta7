/**
Nesta
19/2/18
*/

import java.util.Scanner;

public class Break_Ex2{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int counter = 0;
    System.out.println("Guess number from 1 to 10.");
    System.out.println("You have 10 attempts.");

    while(input.hasNext()){
      if(input.nextInt()==8){
         System.out.println("Match found. It is 8");
      }

      counter++;
      if(counter == 10){
        System.out.println("No match found");
        break;
      }
    }
  }
}