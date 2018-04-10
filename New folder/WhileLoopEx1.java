import java.util.Scanner;

public class WhileLoopEx1{
  public static void main(String[] arg){
   Scanner input = new Scanner(System.in);

   double gross = 0.0;
   double earnings;
   int product = 0;
   int numberSold;

   while(product < 4){
    product = product +1;

    System.out.print("Enter number sold of product item"+product+":");
    numberSold = input.nextInt();

    if(product == 1)
      gross = gross + (numberSold * 239.99);
     else if(product == 2)
     gross = gross + (numberSold * 129.75);
      else if(product == 3)
     gross = gross + (numberSold * 99.96);
      else if(product == 4)
     gross = gross + (numberSold * 350.89);

    }
    earnings = 0.09 * gross +200;
    System.out.println("Earnings this week: "+Math.round(earnings));
}
}