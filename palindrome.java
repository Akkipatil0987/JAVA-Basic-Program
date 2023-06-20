package com.timepass;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,rem,b;
		System.out.println("Enter your no: ");
		int a=sc.nextInt();
		b=a;
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(b==rev)
			System.out.println(b+" is palindrome..");
		else
			System.out.println(b+" is not palindrome..");

	}

}
