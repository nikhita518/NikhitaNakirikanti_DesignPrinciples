package com.mycompany.calculator;

public class Operations 
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static float div(int a,int b)
	{
		if(b == 0)
		{
			return -1;
		}
		return (float)a/b;
	}
	
}
