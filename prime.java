package com.timepass;
import java.util.Scanner;
public class prime {
	
	int flag=0;
	public prime(int a) {
		for(int i=2;i<=a/2;i++)
		{
			
			if(a%i==0)
			{
				flag=1;
			break;
			}
		}
		if(flag==0)
			System.out.println(a+" no is prime");
		else
			System.out.println(a+" no is not prime");
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		prime p= new prime(a);

	}

}
