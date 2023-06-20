package com.timepass;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int a=sc.nextInt();
		if(a>=18)
			System.out.println("Eligible for voting...");
		else
			System.out.println("Not Eligible for voting...");

	}

}
