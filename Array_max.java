package com.timepass;

import java.util.Scanner;

public class Array_max {
	int b=0;
	public Array_max(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b)
			b=a[i];
		}
	}
	public String toString() {
		return "max no is "+b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max;
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		Array_max m= new Array_max(a);
		System.out.println(m);
	}

}
