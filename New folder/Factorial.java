public class Factorial{
  public static void main(String[] args){
   System.out.println("n\tn!");
   System.out.println();

    for(int number = 1; number <=20; number++){
      long factorial = 1;

      for(int x = 1; x <= number; x++){
        factorial *= x;
       }
       System.out.println(number+"\t"+factorial);
      }
	}
}