package com.timepass;

import java.util.Scanner;

public class Array_Multiple {

	public Array_Multiple(int[] a) {
		for(int i=0;i<a.length;i++)
			a[i]=a[i]*3;
		for(int i=0;i<a.length;i++)
		System.out.print(" "+a[i]);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		Array_Multiple m=new Array_Multiple(a);
		//System.out.println(m);

	}

}
