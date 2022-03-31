package Project;

import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CurrencyConverter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
		   double amount;
		   double INR, Dollar, pound, Euro, JPY, MYR;
		   int choice; 
				 
	 DecimalFormat f = new DecimalFormat("##.##");
				 
	 Scanner P = new Scanner(System.in);
				 
	 System.out.println("Following___are__the__ Choices:");
	 System.out.println("Enter 1: Ruppe");
	 System.out.println("Enter 2: Dollar");
	 System.out.println("Enter 3: Pound");
     System.out.println("Enter 4: Euro");
	 System.out.println("Enter 5: JPY");
	 System.out.println("Enter 6: MYR");
				 
	 System.out.print("\nChoose From above Any One Currency......: ");
	 choice = P.nextInt();
				 
	  System.out.println("Enter the amount you want to convert....?");
	 amount = P.nextFloat();
				 
 switch (choice)
				      {
 case 1: 
	     Dollar =amount / 76.28;
	    System.out.println(amount + " Indian Rupees Converter in to American Dollar $ " + f.format(Dollar) + " Dollar");
				 
	     pound = amount / 100.61;
	     System.out.println(amount + " Indian Rupees Converter in to Londan Pounds $ " + f.format(pound) + " Pound");
				 
	     Euro = amount / 83.82;
	     System.out.println(amount + " Indian Rupees Converter in to Europe Currency $ " + f.format(Euro) + " Euro");
				 
		 JPY = amount / 0.62;
		 System.out.println(amount + " Indian Rupees Converter in to Japan Currency $ " + f.format(JPY) + " JPY");
				 
		 MYR = amount / 18.12;
		 System.out.println(amount + " Indian Rupees Converter in to Malaysia Currency $ " + f.format(MYR) + " MYR");
		 
		 
		 
 break;
 case 2:  
		 INR = amount * 76.28;
		System.out.println(amount + " American Dollar Converter in to indian Rupees $ " + f.format(INR) + "INR");
				 
		 pound = amount *1.32;
		 System.out.println(amount + " American Dollar Converter in to Londan Pounds $ " + f.format(pound) + " Pound");
				 
		  Euro = amount *1.10;
	      System.out.println(amount + " American Dollar Converter in to Europe Currency $ " + f.format(Euro) + " Euro");

	      JPY = amount *0.0082;
	      System.out.println(amount + " American Dollar Converter in to Japan Currency $ " + f.format(JPY) + "JPY");
				 
	      MYR = amount *0.24;
	      System.out.println(amount + " American Dollar Converter in to Malaysia Currency $ " + f.format(MYR) + "MYP");
 break;
				 
 case 3: 
		 INR = amount *0.0099;
		 System.out.println(amount + " Londan Pounds Converter in to Indian Rupees $ " + f.format(INR) + "INR");
				 
		  Dollar = amount *0.76;
		 System.out.println(amount + " Londan Pounds Converter in to American Dollars $ " + f.format(Dollar) + " Dollar");
				 
		 Euro = amount *0.83;
		 System.out.println(amount + " Londan Pounds Converter in to Europe Currency $  " + f.format(Euro) + " Euro");
				 
		 JPY = amount *0.0062;
		 System.out.println(amount + " Londan Pounds Converter in to Japan Currency $  " + f.format(JPY) + " JPY");
				 
		 MYR = amount *0.81;
		  System.out.println(amount + " Londan Pounds Converter in to Malaysia Currency $" + f.format(MYR) + "MYP");
 break;
				 
 case 4: 
          INR = amount *83.82;
          System.out.println(amount + " Europe Currency Converter in to Indian Rupees $ " + f.format(INR) + "INR");
				 
           Dollar = amount *1.10;
		   System.out.println(amount + " Europe Currency Converter in to American Dollars $ " + f.format(Dollar) + " Dollar");
				 
		  pound = amount *0.83;
		  System.out.println(amount + " Europe Currency Converter in to Londan Pounds $ " + f.format(pound) + " Pound");
				 
		  JPY = amount *134.09;
		  System.out.println(amount + " Europe Currency Converter in to Japan Currency $  " + f.format(JPY) + " JPY");
				 
		  MYR = amount *4.63;
		  System.out.println(amount + " Europe Currency Converter in to Malaysia Currency $ " + f.format(MYR) + "MYR");
break;
				 
case 5: 
		 INR = amount *0.62;
		  System.out.println(amount + " Japan Currency Converter in to Indian Rupees $ " + f.format(INR) + " INR");
				 
		  Dollar = amount *0.0082;
		  System.out.println(amount + " Japan Currency Converter in to American Dollars $ " + f.format(Dollar) + " Dollar");
				 
		  pound = amount *0.0062;
		  System.out.println(amount + " Japan Currency Converter in to Londan Pounds $ " + f.format(pound) + " Pound");


		 Euro = amount *0.0075;
	     System.out.println(amount + " Japan Curency Converter in to Europe Currency $ " + f.format(Euro) + " Euro");
				 
	      MYR = amount *0.034;
		  System.out.println(amount + " Japan Currency Converter in to Malaysia Currency $ " + f.format(MYR) + "MYR");
 break;
				 
 case 6:  
		  INR = amount *18.12;
		  System.out.println(amount + " Malaysia Currency Converter in to Indian Rupees $ " + f.format(INR) + " INR");
				 
		 Dollar = amount *0.24;
		 System.out.println(amount + " Malaysia Currency Converter in to American Dollars $ " + f.format(Dollar) + " Dollar");
				 
		 pound = amount *0.18;
		 System.out.println(amount + " Malaysia Currency Converter in to Londan Pounds $ " + f.format(pound) + " pound");
				 
		 Euro = amount *0.22;
		 System.out.println(amount + " Malaysia Currency Converter in to Europe Currency $ " + f.format(Euro) + " Euro");
				 
		 JPY = amount *28.90;
		 System.out.println(amount + " Malaysia Currency Converter in to Japan Currency $ " + f.format(JPY) + " JPY");
       
		 break;
 
 default:
		 System.out.println("Invalid Input");
				      }
				   }
				
	}


