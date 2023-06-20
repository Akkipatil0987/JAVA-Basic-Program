package com.timepass;

import java.util.Scanner;

public class Array_Positionsum2 {
    int sum=0;
	public Array_Positionsum2(int a[]) {
	for(int i=0;i<a.length;i++)
		if(i%2!=0)
			sum+=a[i];
	}
	@Override
	public String toString() {
		return "sum of odd position is "+sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		Array_Positionsum2 m= new Array_Positionsum2(a);
		System.out.println(m);

	}

}
