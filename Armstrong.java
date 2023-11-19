package day3;

import java.util.Scanner;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
           
      int originalNumber,remainder,result = 0;
      System.out.println("Enter number : ");
      int number = t.nextInt();

      originalNumber = number;
      while(originalNumber !=0) {
    	  remainder = originalNumber % 10;
    	  result = (int) (result + Math.pow(remainder, 3));
    	  originalNumber = originalNumber / 10;
      }
      if(result == number)
    	  System.out.println(number + " is armstrong number");
      else {
    	  System.out.println(number + " is not armstrong number");
    	  
    	  
    	  t.close();
      }
	}

}
