package com.timepass;
import java.util.Scanner;
public class Array_ForEach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		for(int temp:a)
		sum=sum+temp;
		System.out.println(sum);


	}

}
