package day3;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the product name : ");
     String productName = s.next();
     System.out.println("Enter price of product : ");
     double price = s.nextDouble();
           
     double discount;
     if(price > 2000) {
    	 discount = 0.10 * price;
    	 
     }else {
    	 discount = 0.07 * price;
     }
     System.out.println("Product Name : " + productName);
     System.out.println("Price : " + price);
     System.out.println("Discount : " + discount);
	}

}
