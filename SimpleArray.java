package com.basic;
import java.util.*;

public class SimpleArray {
	public static void funn(int[] arr) {
		arr[0]=5;
		arr[1]=10;
		arr[3]=15;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String args[]) {
		
		int[] arr=new int[5];
		arr[2]=40;
		arr[4]=30;
		funn(arr);
		
		
		
	}

}
