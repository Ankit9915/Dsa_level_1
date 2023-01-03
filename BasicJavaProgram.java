package com.basic;

import java.util.Scanner;
import java.lang.Math;

public class BasicJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//given number is prime or not
		
		/*	int n=89;
			
			int flag=0;
			int m=n/2;
			
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					
					flag=1;
					break;
				}
			}
				if(flag==0) {
					System.out.println("number is prime");
				}
				else {
					System.out.println("number is not prime");
				}*/
		
		//range of prime numbers
	/*	int min=1;
		int max=100;
		int count =0;
		for(int i=min;i<=max;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count=0;
					break;
					
				}else {
					count=1;
				}
			}if(count==1) {
				System.out.println(i);
			}
			
			
		}*/
				
				// Another way of doing range prime numbers
			/*	 Scanner sc=new Scanner(System.in);
			        int low=sc.nextInt();
			        int high=sc.nextInt();
			        
			        for(int i=low;i<=high;i++){
			            int count=0;
			            for(int div=2;div * div<=i;div++){
			                if(i%div==0){
			                    count++;
			                    break;
			                }
			            }if(count==0){
			                System.out.println(i);
			            }
			        }*/
		
		
		//multiple input to check prime number
		
	/*	Scanner scn =new Scanner (System.in);
		System.out.println("Enter the numbers");
		int t=scn.nextInt();
		for(int i=0;i<t;i++) {
			int n=scn.nextInt();
			
			int div=2;
			while(div * div <=n) {
				if(n%div==0) {
					break;
					
				}
				
			}if(div * div >n) {
				System.out.println("prime number");
			}else {
				System.out.println("not prime");
			}
		}*/
		
		//Fibnocci series
		/*int a=0;
		int b=1;
		int n=5;
		for(int i=0;i<=5;i++) {
			int temp;
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
			
		}
		
		
			}*/
		
		//Count digits in number
		/*int n=987654321;
		int count =0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		
		System.out.println(count);*/
		
		
		//print the digit of number by using toString method
		
		/*int a=123456789;
		String s=Integer.toString(a);
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}*/
		
		// Without using toString method
		
		
		
		
		//Without using toString method in reverse order
		/*int b=98765;
		while(b>0) {
			int digit=b%10;
			
			System.out.println(digit);
			b=b/10;
		}*/
		
		//Reverse of number
		
	/*	int n=123456789;
		while(n!=0) {
			 int rev=n%10;
			 System.out.print(rev);
			 n=n/10;
			
		}*/
		//inverse of number from their position
		
		/*int n=2134;
		int inv=0;
		int pow=1;
		while(n>0) {
			int temp=n%10;
			n=n/10;
			inv+= pow *Math.pow(10, temp-1);
			pow++;
			
		}
		System.out.println(inv);*/
		
		//rotate a number
		
	/*	int n=51234;
		int temp=n;
		int k=-2;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count++;
			
			
			
		}
		
		k=k % count;
		if(k<0) {
			k=k+count;
		}
		int div=1;
		int multi=1;
		
		
		for(int i=1;i<=count;i++) {
			if(i<=k) {
				div=div * 10;
				
			}else {
				multi=multi * 10;
			}
			
			
		}
		int q=n /div;
		int r=n % div;
		
		int a= r * multi + q;
		System.out.println(a);*/
		
		//gcd and lcm of two numbers
		
		/*int n1=36;
		int n2=24;
		int temp1=n1;
		int temp2=n2;
		
		
		while(n1 % n2!=0) {
			int remain= n1 % n2;
			n1=n2;
			n2 =remain;
			
		}
		int gcd=n2;
		int lcm=(temp1*temp2)/gcd;
		
		
		System.out.println(gcd);
		System.out.println(lcm);*/
		
		
		//Prime factorisation
		
	/*	int n=1440;
		for(int div=2;div * div<n;div++) {
			while(n % div==0) {
				n=n/div;
				System.out.println(div);
				
			}
		}
		if(n!=1) {
			System.out.println(n);
		}*/
		
		
		//Pythogores triplet
		
		/*Scanner sc= new Scanner(System.in);
		
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	int max=a;
	if(b>=max) {
		max=b;
	}if(c>=max) {
		max=c;
	}if(max==a) {
		System.out.println((b * b + c * c)==(a * a));
	}else if(max==b) {
		System.out.println((a * a + c * c)==(b * b) );
	}else{
		System.out.println((a * a + b * b)==(c * c));
		
	}*/
	
	//Curious Case Of Benjamin Bulbs.
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i * i <=n;i++) {
			System.out.println( i * i);
		}
	
		
		
		
		
		
		
		
		}
		
		
	}
	


