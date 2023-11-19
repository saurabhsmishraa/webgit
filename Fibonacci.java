package day3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int count , num1 =0, num2 =1;
	 System.out.println("how many number you want to prit");
	 Scanner t = new Scanner(System.in);
	 count = t.nextInt();
	 System.out.println("fibonacci series of a number is : " + count);
	 int i = 1;
	 while(i <= count) {
		 System.out.println(num1);
		 int sumOfPrevTwo = num1 + num2;
		 num1 = num2;
		 num2 = sumOfPrevTwo;
		 i++;
	 }
	}

}
