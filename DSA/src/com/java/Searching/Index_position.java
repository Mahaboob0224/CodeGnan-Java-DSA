package com.java.Searching;

public class Index_position {

	public static void main(String[] args) {
		int []arr = {1,7,9,8,5,4};
		// var index = -1;
	
		/*for(int i = 0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				index = arr[i];
			}
		}*/
		
		for(int num :arr) {
			if(num%2 == 0) {
				System.out.println("First Even : "+num);
				break;
			}
		}
		
		// System.out.println(index);

	}

}
