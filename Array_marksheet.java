package com.timepass;

import java.util.Scanner;

public class Array_marksheet {
	int total=0;double avg;
	public Array_marksheet(int a[])
	{
		for(int temp:a)
		{
			total+=temp;	
		}
		avg=(double)total/500*100;
	}
	@Override
	public String toString() {
		return "total is "+total+"\npercantage is "+avg;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		Array_marksheet m=new Array_marksheet(a);
		System.out.println(m);
	}

}
