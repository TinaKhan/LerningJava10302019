package Learning;

import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);// input reading
	
	System.out.println("Enter your name: ");
	
	String name=scan.nextLine();
	
	
	System.out.println("your name is : "+ name);
	
	System.out.println("Enter your city ");
	String city= scan.next();
	
	System.out.println(" your city: "+ city);
	
	System.out.println("Enter your cell: ");
	long cell= scan.nextLong();
	System.out.println(" your cell number is: "+cell);
	
	

	}

}
