package com.timepass;

import java.util.Scanner;

public class Array_Descending {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
		sc.close();

	}


}
