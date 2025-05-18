package com.blc.elc;

public class Factorial{
	public int sumFactorial(int num) {
		
		
		if(num==0) {
			System.out.println("is factorial ");
		}
		if(num<=0) {
			System.out.println("not a factorial");
		}
		int fact=1;
		int i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
			}
		
		return fact;
	}
public static void main(String[]args) {
	 Factorial obj=new  Factorial();
	System.out.println("Factorial of 4 is :"+obj.sumFactorial(4));
	 System.out.println("Factorial of 6 is :"+obj.sumFactorial(6));
}
}