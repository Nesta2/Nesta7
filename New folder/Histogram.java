import java.util.Scanner;

public class Histogram{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.println("Enter number: ");
   int number1 = input.nextInt();
      System.out.println("Enter number: ");
   int number2 = input.nextInt();
      System.out.println("Enter number: ");
   int number3 = input.nextInt();
      System.out.println("Enter number: ");
   int number4 = input.nextInt();
      System.out.println("Enter number: ");
   int number5 = input.nextInt();
   int value =0;

   for(int counter = 1; counter <=5; counter++){
     if(counter == 1)
       value=number1;
       else if(counter ==2)
       value = number2;
        else if(counter ==3)
        value = number3;
         else if(counter ==4)
        value = number4;
         else if(counter ==5)
	 value = number5;

	 for(int inner = 1; inner <=value; inner++){
	  System.out.print("*");
	 }
	 System.out.println();
	 }
}
}


