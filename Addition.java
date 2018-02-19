/**
Nesta
19/2/18
*/
	import java.util.Scanner;

		public class Addition{
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				int total = 0;
				System.out.print("Enter number (ctrl+z to exit):");

				while(input.hasNext()){
					total += input.nextInt();
			}
			System.out.println("Total is:"+total);
		}
	}

