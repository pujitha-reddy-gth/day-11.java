package com.blc.elc;

public class Amstrong {
	public static void main(String[] args) { 
	int num=153;
	int temp=num;
	int sum=0;
	while(num > 0) {
		int res=num%10;
				sum+=(res*res*res);
		 num=num/10;
	}
		if(temp == sum) {
	
	System.out.println("it is a Amstrong number:");
} else
{
	System.out.println(" it is a not amstrong number:");
     }
   }
}
 
   
	
	
	

	

	


