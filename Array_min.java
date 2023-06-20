package com.timepass;

import java.util.Scanner;

public class Array_min {
	int b;
	public Array_min(int a[])
	{
		b=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<b)
			b=a[i];
		}
	}
	public String toString() {
		return "min no is "+b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		Array_min m= new Array_min(a);
		System.out.println(m);
	}

}
