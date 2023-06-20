package com.timepass;

import java.util.Scanner;

public class Array_sum2 {

	public Array_sum2(int[] a, int[] b, int[] c) {
		for(int i=0;i<a.length;i++)
			c[i]=a[i]+b[i];
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []c=new int[size];
		int []a=new int[size];
		System.out.println("Enter first array:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		int []b=new int[size];
		System.out.println("Enter Second array:");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		Array_sum2 m=new Array_sum2(a,b,c);
		System.out.println("third array is:");
		for(int i=0;i<c.length;i++)
		System.out.print(" "+c[i]);

	}

}
