package com.amc.day01;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=18;
		if((a=3)==b)
		{
			System.out.println(++a);
		}
		else
		{
			//System.out.println(b--);
			//System.out.println(--b);
			System.out.println(b-- + --b);
		}
        System.out.println(b);
	}

}
