package com.timepass;
import java.util.Scanner;
public class Evenodd {
   public Evenodd(int a)
   {
	   if(a%2==0)
		   System.out.println(a+" no is even.");
	   else
		   System.out.println(a+" no is odd.");
   }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		Evenodd e= new Evenodd(a);

	}

}
