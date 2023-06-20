package com.timepass;
import java.util.Scanner;
public class Armstrong {
	int rem,sum=0,count=0,temp=1,b;
     public Armstrong(int a)
     {
    	 b=a;
    	while(a!=0)
    	{
    		a=a/10;
    		count++;
    	}
    	a=b;
    	while(b!=0)
    	{
    		rem=b%10;
    		for(int i=1;i<=count;i++)
    			temp=temp*rem;
    		sum=sum+temp;
    		temp=1;
    		b=b/10;
    	}

    	System.out.println(sum);
    	if(sum==a)
    		System.out.println(a+" is Armstrong...");
    	else
    		System.out.println(a+" is not Armstrong....");
     }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		Armstrong a=new Armstrong(no);
	}

}
