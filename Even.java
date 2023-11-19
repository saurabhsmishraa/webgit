package day3;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
     System.out.println("Enter your number");
     int number = s.nextInt();
     if(number % 2 == 0)
    	 System.out.println("number is even");
     else
    	 System.out.println("number is odd");
     
    
	}

}
