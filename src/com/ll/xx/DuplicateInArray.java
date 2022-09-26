package com.ll.xx;

import java.util.Arrays;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		
		int[] arr = {10,20,40,20,60,20,10};
		Arrays.sort(arr);
		
		
		int j=0;
		int[] result = new int[arr.length];
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
				
				System.out.println(arr[j++]);			
			}
			
			result[j++] = arr[arr.length-1];
				
		}
		
		
		

	}

}
