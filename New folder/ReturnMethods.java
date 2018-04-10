public class ReturnMethods{

public static void main(String[] args){
	ReturnMethods m = new ReturnMethods();
	int number = m.method();
	System.out.println("Method 3 returned "+number+" via method 2");
	Index.main(null);
}

public int method(){
	System.out.println("Method 1, can you please ask method 2, to ask method 3 for a number");
	return method1();
	} // end of method

public int method1(){
	System.out.println("No problem. method 2, can you ask method 3 for a number and return it to me?");
	return method2();
	} // end method1

public int method2(){
	System.out.println("Of course I can method 1. Method 3, can you please send me a number.");
	 return method3();
	} // end method2

public int method3(){
	System.out.println("Yea method 2, I will return a number to you now");
	return 5;
	} // end method3

}