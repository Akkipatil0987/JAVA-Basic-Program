package com.timepass;
import java.util.Scanner;
public class perfect {
	int sum=0;

	public perfect(int a) {
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
				sum=sum+i;
		}
		if(sum==a)
			System.out.println(a+" no is perfect...");
		else
			System.out.println(a+" no is not1 perfect...");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		perfect p=new perfect(a);
		

	}

}
