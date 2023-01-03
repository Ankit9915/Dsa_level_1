package com.basic;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		String[] s=new String[10];
		
		
		for(int i=0;i<=n;i++) {
			s[i]=sc.nextLine();
		}
		System.out.println("Enter the marks ");
		int arr[]=new int[10];
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Names are:");
		for(int i=0;i<=n;i++) {
			System.out.println(s[i] +" " + arr[i]);
		}

	}

}
