package com.mycompany.calculator;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int a,b;
        boolean flag = true;
        while(flag)
        {
        	System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Exit\nEnter your operation:");
        	int ch = scan.nextInt();
        	
        	if (ch == 1)
        	{
        		System.out.println("Enter the operands for addition operation");
        		a = scan.nextInt();
        		b = scan.nextInt();
        		System.out.println("Result:"+Operations.add(a,b));
        	}
        	else if(ch ==2)
        	{
        		System.out.println("Enter the operands for subraction operation");
        		a = scan.nextInt();
        		b = scan.nextInt();
        		System.out.println("Result:"+Operations.sub(a,b));
        	}
        	else if(ch == 3) 
        	{
        		System.out.println("Enter the operands for multiplication operation");
        		a = scan.nextInt();
        		b = scan.nextInt();
        		System.out.println("Result:"+Operations.mul(a,b));
        	}
        	else if(ch == 4) 
        	{
        		System.out.println("Enter the operands for division operation");
        		a = scan.nextInt();
        		b = scan.nextInt();
        		float c = Operations.div(a,b);
        		if (c == -1)
        		{
        			System.out.println("Division by zero error");
        		}
        		else
        			System.out.println("Result:"+c);
        	}
        	else
        		break;
        }
    }
}
