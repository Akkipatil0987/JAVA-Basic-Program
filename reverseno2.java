package com.timepass;
import java.util.Scanner;
public class reverseno2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,rem;
		System.out.println("Enter your no: ");
		int a=sc.nextInt();
		for(;a!=0;)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("reverse no is: \n"+rev);
	}

}
