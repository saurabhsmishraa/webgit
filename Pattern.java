package day3;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		 Scanner t = new Scanner(System.in);
		    System.out.print("Enter number :");
		   int n = t.nextInt();
		    for(int i =1; i <= n; i++) {
		    	for(int j =1; j <= n-i; j++) {
		    		System.out.print(" ");
		    		
		    	}
		    	for(int k =1; k <= 2*i-1; k++) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
	}

}
