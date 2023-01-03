package com.basic;

import java.util.Scanner;

public class AllPattern {
	public static void main(String[] args) {

		// Patter 1 output=no of star equals to no of rows
		/*
		 * Scanner sc=new Scanner(System.in);
		 * { int n= sc.nextInt(); 
		 * for(int
		 * i=1;i<=n;i++) 
		 * { for(int j=1;j<=i;j++) 
		 * { 
		 * System.out.print("* ");
		 *  }
		 * System.out.println(); }
		 */

		// Pattern 2 reverse of pattern 1

		/*
		 * int n=4; for(int i=n;i>=1;--i) { for(int j=i;j>=1;j--) {
		 * System.out.print("* "); } System.out.println();
		 * 
		 * }
		 */

		// Pattern 3 output=no of star no of column

		/*
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int sp = n - 1; int st
		 * = 1; for(int i=1;i<=n;i++) { //System.out.println(sp+" ,"+st); for(int
		 * j=1;j<=sp;j++) { System.out.print("\t"); } for(int j=1;j<=st;j++) {
		 * System.out.print("*\t"); }
		 * 
		 * sp--; st++; System.out.println();
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		// Pattern 4 reverse of pattern 3

		/*
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int sp=0; int st=n;
		 * for(int i=1;i<=n;i++) { for(int j=1;j<=sp;j++) { System.out.print("\t"); }
		 * for(int j=1;j<=st;j++) { System.out.print("*\t"); }
		 * 
		 * sp++; st--; System.out.println();
		 */

		// Pattern 5 first star increases then decreases

		/*
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int sp=n/3; int st=1;
		 * for(int i=1;i<=n;i++) { for(int j=1;j<=sp;j++) { System.out.print("\t");
		 * }for(int j=1;j<=st;j++) { System.out.print("*\t"); } if(i<=n/3) { sp--;
		 * st+=3; }else { sp++; st-=3;
		 * 
		 * 
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */

		// Pattern 6 first space increases then decreses

		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st = n / 2 + 1;
		int sp = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");

			}
			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}
			if (i <= n / 2) {
				st--;
				sp += 2;
			} else {
				st++;
				sp -= 2;
			}

			System.out.println();
		}*/
		
		//Pattern 7  single Diagonal
		/*Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print("*\t");
					break;
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}*/
		
		//Pattern 8 reverse of pattern 8
		
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j) == n+1) {
					System.out.print("*\t");
					
				}else {
					System.out.print("\t");
				}
				
			
		}
			System.out.println();
	}*/
		
		//Pattern 9 combination pattern 8 and pattern 9
		
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==j ||i+j == n +1)) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
		System.out.println();
		}*/
		
		//Pattern 10 heptagon of star size =5
		
	/*Scanner sc=new Scanner(System.in);{
		int n=sc.nextInt();
		int os=n/2;
		int is=-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=os;j++) {
				System.out.print("\t");
				
			}
			System.out.print("*\t");
			
			for(int j=1;j<=is;j++) {
				System.out.print("\t");
			}
			if(i>1 && i<n) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				os--;
				is+=2;
			}else {
				os++;
				is-=2;
			}
			System.out.println();
			
		}
		
	}*/
		
		//Pattern 11 same as pattern 1  but to print count
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				count++;
				System.out.print(count+"\t");
				
			}
			System.out.println();
		}*/
		
		//pattern 12 print fiboncci series in row column wise
		
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+"\t");
				int tem=a+b;
				a=b;
				b=tem;
				
				
				
			}
			System.out.println();
		}*/
		
		//Pattern 13  combination icj column value is greater than row value
	/*	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		for(int i=0;i<n;i++) {
			int icj=1;
			for(int j=0;j<=i;j++) {
				System.out.print(icj+"\t");
				int icjp1= icj * (i-j)/(j+1);
				icj=icjp1;
				
			}
			System.out.println();
		}*/
		
		//Pattern 14 multiplication of x and row
	/*	Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int val= x * i;
		
			
			System.out.println(x+" "+"*"+" "+i+" "+"="+" "+val );
		}
		System.out.println();*/
		
		
		//Pattern 16 heptagon but with number first increses then decreses
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n/2;
		int st=1;
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			int cval=val;
			for(int j=1;j<=st;j++) {
				System.out.print(cval+"\t");
				if(j <= st/2) {
					cval++;
				}else {
					cval--;
				}
			
			}
			if(i<=n/2) {
				sp--;
				st+=2;
				val++;
			}else {
				sp++;
				st-=2;
				val--;
			}
			
			System.out.println();
		}*/
		
		//pattern 16 inner space of pattern 15 (tricky) important
		/*Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int sp= 2 * n -3;
		int st=1;
		
		
		for(int i=1;i<=n;i++) {
			int val=1;
			for(int j=1;j<=st;j++) {
				System.out.print(val +"\t");
				val++;
			}
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
				
			}
			if(i==n) {
				st--;
				val--;
			}
	
			for(int j=1;j<=st;j++) {
				val--;
				System.out.print(val+"\t");
				
			}
			
			st++;
			sp-=2;
			System.out.println();
		}*/
		
		//Pattern 17 special case for one specific row
		/*Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				if(i==n/2+1) {
					System.out.print("*\t");
				}else {
				System.out.print("\t");
				
			}
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*\t");
			}
			if(i<=n/2) {
				st++;
			}else {
				st--;
			}
			System.out.println();
		}*/
		
		//Pattern 18 power drum(dumroo)
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int st=n;
		int sp=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}for(int j=1;j<=st;j++) {
				if(i>1 && i<=n/2 && j> 1 && j< st) {
					System.out.print("\t");
				}else {
				System.out.print("*\t");
			}
			}
			if(i<=n/2) {
				sp++;
				st-=2;
				
				
			}else {
				sp--;
				st+=2;
				
				
			}
			System.out.println();
		}*/
		
		//Pattern 19 Swastik
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1) {
					if(j==n || j <=n/2+1) {
						System.out.print("*\t");
					}else {
						System.out.print("\t");
					}
					
				}else if(i<=n/2) {
					if(j==n || j==n/2+1) {
						System.out.print("*\t");
					}else {
						System.out.print("\t");
					}
					
				}else if(i==n/2 + 1) {
					System.out.print("*\t");
					
				}else if(i <n) {
					if(j==1 || j==n/2+1) {
						System.out.print("*\t");
					}else {
						System.out.print("\t");
					}
					
				}else {
					if(j==1 || j>=n/2 + 1) {
						System.out.print("*\t");
					}
					else {
						System.out.print("\t");
					}
				}
				
			}
			System.out.println();
		}*/
		
		 // Pattern 21 W printing
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1|| j==n) {
					System.out.print("*\t");
					
				}else if(i > n/2 && (i ==j || i+j==n+1)){
					System.out.print("*\t");
					
					
				}else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
	    
	}
	}


