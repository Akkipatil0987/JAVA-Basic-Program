package com.timepass;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final float pi=3.14f;
		System.out.println("Enter radius: ");
		float b=sc.nextFloat();
		float a=pi*b*b;
		
		System.out.println("area of tringle is "+a+"");

	}

}
