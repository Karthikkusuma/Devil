package com.Collection;

public class ifElse2 
{
	
	public static void main(String[] args) { 
	System.out.println("Total inhand...!!  100 Rs.");
    //   System.out.print("Enter the price of 1 dozen bananas: ");
       int priceOfDBananas = 40;
       int priceOfApple = 20;
       
       if (priceOfDBananas <= 40) {
           // Karthik can buy 1 dozen bananas and then purchase apples with the remaining money
           int numBananas = 12;
           int numApples = (100 - priceOfDBananas) / priceOfApple;
           int remainingMoney = 100 - (priceOfDBananas + (numApples * priceOfApple));
           
           System.out.println("price of 1 dozen bananas: " +priceOfDBananas+ "  and the price of each apple: " +priceOfApple+ ".");
           System.out.println("Karthik bought " + numBananas + " bananas and " + numApples + " apples.");
           System.out.println("Karthik have " + remainingMoney + " Rs left.");
       } else {
           // Kid can only buy apples with the entire amount
           int numApples = 100 / priceOfApple;
           int remainingMoney = 100 - (numApples * priceOfApple);
           
           System.out.println("Karthik can only buy " + numApples + " apples.");
           System.out.println("Karthik have " + remainingMoney + " Rs left. :( ");
       }
   }
}



