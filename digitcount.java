package com.timepass;
import java.util.Scanner;
public class digitcount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		System.out.println("Enter no: ");
		int a=sc.nextInt();
		while(a!=0) {
			a=a/10;
			count++;
		}
		System.out.println("count of digit no is : "+count);
	}

}
