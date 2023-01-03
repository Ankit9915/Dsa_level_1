package com.basic;

import java.util.Scanner;


// First count the repeated digit

public class FunctionAndArray  {
	public static void main(String[] args) {
/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int f = getDigitFrequency(n, d);
		System.out.println(f);
	}
		
		public static int getDigitFrequency(int n,int d) {
			int count=0;
			while(n>0) {
				int temp=n % 10;
				n=n/10;
				if(temp==d) {
					count++;
				}
			}
			
			
			return count;
			}*/
		// second 2 decimal to any base
		/*Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
	      int b = sc.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	}
	  public static int getValueInBase(int n, int b){
	       // write code here
		  int rv=0;
		  int p=1;
		  while(n>0) {
			  int dig=n %b;
			  n=n/b;
			  
			  rv+= dig * p;
			  p=p*10;
			  
		  }
		  
		  
		  return rv;*/
		
		//third Any base to decimal
		/*Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int b=sc.nextInt();
		int d=getValueIndecimal(n,b);
		System.out.print(d);
		
		
	
	       
	       }
	public static int getValueIndecimal(int n,int b) {
		int rv=0;
		int p=1;
		while(n>0) {
			int digit=n%10;
			n =n /10;
			
			rv+=digit * p;
			p=p*b;
		}
		
		return rv;
		*/
		//Fourth Any base to any base
		/*Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int d =getValue(n,b1,b2);
		System.out.println(d);
	}
	public static int getValue(int n,int b1,int b2) {
		int desc=AnybasetoDecimal(n, b1);
		int dn=DecimaltoAnyBase(desc,b2);
		return dn;
	

		
	}
	  public static int DecimaltoAnyBase(int n, int b){
	       // write code here
		  int rv=0;
		  int p=1;
		  while(n>0) {
			  int dig=n %b;
			  n=n/b;
			  
			  rv+= dig * p;
			  p=p*10;
			  
		  }
		  
		  
		  return rv;
	  }
	public static int AnybasetoDecimal(int n,int b) {
		int rv=0;
		int p=1;
		while(n>0) {
			int digit=n%10;
			n =n /10;
			
			rv+=digit * p;
			p=p*b;
		}
		
		return rv;*/
		
		// Fifth Any base Addition
		
	/*	Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getSum(b, n1, n2);
	      System.out.println(d);
	   }
	  
	   public static int getSum(int b, int n1, int n2){
	      
	       int rv=0;
	       int c=0;
	       int p=1;
	       while(n1>0||n2>0||c>0) {
	    	   int d1=n1 % 10;
	    	   int d2= n2 % 10;
	    	   n1=n1/10;
	    	   n2=n2/10;
	    	   int d= d1 + d2 + c;
	    	   c = d / b;
	    	   d= d % b;
	    	   
	    	   rv+= d * p;
	    	   p= p * 10;
	    	   
	       }
	       
	       
	       
	       
	       return rv;*/
		//sixth any base substraction 
	/*	Scanner sc= new Scanner(System.in);
		
		int b = sc.nextInt();
	      int n1 = sc.nextInt();
	      int n2 = sc.nextInt();
	  
	      int d = getDifference(b, n1, n2);
	      System.out.println(d);
	   }
	  
	   public static int getDifference(int b, int n1, int n2){
		   int rv=0;
		   int c= 0;
		   int p =1;
		   while(n2>0) {
			   int d1=n1 % 10;
			   n1=n1/10;
			   int d2= n2 % 10;
			   n2=n2/10;
			   int d=0;
			   
			   d2=d2+c;
			   if(d2>=d1) {
				   d=d2-d1;
			   }else {
				   c=-1;
				   d=d2 + b -d1;
			   }
			   rv+=d *p;
			   p=p*10;
		   }
		   
		   
		   
		   
		   return rv;
		   */
		
		
		
	
	
			
	}
}
		

	


