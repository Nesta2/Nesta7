import java.util.Scanner;

public class Square2{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

      System.out.println("Enter square size:");
      int side = input.nextInt();

      System.out.println("Enter fill character:");
      char fillCharacter = input.next().charAt(0);

      fillSquare(side, fillCharacter);

}

public static void fillSquare(int side, char fillCharacter){
  for(int row = 1; row <= side; row++){
    for(int col = 1; col <= side; col++){
	  System.out.print(fillCharacter);
     }
      System.out.println();
    }
  }
}