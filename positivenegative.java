package com.timepass;
import java.util.Scanner;
public class positivenegative {
	public positivenegative(int a)
	{
		if(a>=0)
			System.out.println(a+ " no is positive..");
		else
			System.out.println(a+" no is negative..");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		positivenegative p= new positivenegative(a);
		

	}

}
