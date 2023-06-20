package com.timepass;
import java.util.Scanner;
public class Array_Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			System.out.print(a[i]+" ");
		}  
	}

}
