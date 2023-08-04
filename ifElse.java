package com.Collection;

public class ifElse 
{
	
	public static void main(String[] args) 
	{
		ifElse dd= new ifElse();
		dd.Demo1(100,40);
	
	}
	
	public void Demo1(int budget, int bananaPrice ) 
	{
		
        if (budget <= bananaPrice) 
        {
            System.out.println("Kid buys banana for Rs " + bananaPrice);
        } 
        else 
        {
            System.out.println("Kid buys apple for Rs " + budget);
        }
    }
}



