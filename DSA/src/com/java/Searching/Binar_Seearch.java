	package com.java.Searching;

public class Binar_Seearch {

	public static void main(String[] args) {
		int [] arr = {10,20,30,50,60,70};
		int target = 70;
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			// find the mid
           int mid = (low+high)/2;
           
           if(arr[mid] == target) {
        	   System.out.println("found target : "+arr[mid]+" at index "+mid);
        	   return;
           }
           else if(target<arr[mid]) {
        	   high = mid-1;
           }
           else {
        	   low = mid+1;
           }
			
		}

		}

	}

