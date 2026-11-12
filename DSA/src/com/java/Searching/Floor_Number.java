package com.java.Searching;

public class Floor_Number {
	public static int floorNumber(int []arr,int target) {
		int left = 0;
		int right = arr.length-1;
		int ans =-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]<=target) {
				ans=arr[mid];
				left=mid+1;
			}else {
				right = mid-1;
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,6,8};
		int target = 7;
		int result = floorNumber(arr, target);
		
		System.out.println("Floor Number :" +result);
	}

}
