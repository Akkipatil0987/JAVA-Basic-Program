package com.timepass;
import java.util.Scanner;
public class AreaOfTringle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base: ");
		int b=sc.nextInt();
		System.out.println("Enter height: ");
		int h=sc.nextInt();
		float a;
		a=((float)b*h)/2;
		System.out.println("area of tringle is "+a+" Square units");

	}

}
