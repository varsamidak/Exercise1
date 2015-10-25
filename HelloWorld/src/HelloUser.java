import java.util.Scanner;


public class HelloUser {
	
	static String userName;

	 public static void greet()
	   {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter your name : ");
		 userName = input.next(); // getting a String value
		 greetUser();
	 }
	 
	 public static void greetUser(){
		 System.out.println ("Hello " + userName + "!");
	 }
}
