package com.timepass;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter width: ");
		int w=sc.nextInt();
		System.out.println("Enter length: ");
		int l=sc.nextInt();
		double a;
		a=w*l;
		System.out.println("area of tringle is "+a+" Square units");

	}

}
