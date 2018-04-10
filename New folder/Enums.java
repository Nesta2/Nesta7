public class Enums{

public enum Month{
 January, February, March, April, May, June,
 July, August, September, November, December
 }

 public enum Day{
 Sunday, Monday, TUESDAY, Wednesday, Thursday, Friday, Saturday
 }

 public static void main(String[] args){

   int months = Month.values().length;
   int days = Day.values().length;
   System.out.println("Number of months in a year: "+months);
   System.out.println("Number of days in a week: "+days+"\n");

   System.out.println("Months: \n");
   for(int i = 0; i < months; i++){
    System.out.println(Month.values()[i]);
   }
    System.out.println("\nDays: \n");
      for(Day d: Day.values()){
    System.out.println(d);
    }
    System.out.println();
    }
   }