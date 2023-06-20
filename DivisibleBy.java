package com.timepass;

import java.util.Scanner;

public class DivisibleBy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no: ");
		int a=sc.nextInt();
		if(a%5==0&&a%7==0)
			System.out.println(a+" is divisible by 5 and 7");
		else
			System.out.println(a+" is  not divisible by 5 and 7");

	}

}
