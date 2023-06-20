package com.timepass;

import java.util.Scanner;

public class Occurance {
	public Occurance(int a[], int b)
	{
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b) {
				flag=1;
				System.out.println("present variable in array..");
				break;
			}
		}
		if(flag==0)
			System.out.println("variable is not present in array..");
	}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i = 0;i<a.length;i++)
			a[i]=sc.nextInt();
		Occurance o=new Occurance(a,6);

	}

}
