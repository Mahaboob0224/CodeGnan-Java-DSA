package com.java.Searching;

public class SearchInsertPosition {
	public static int searchInsert(int arr[],int target) {
		int left = 0;
		int right = arr.length-1;
		int ans = -1;
		
		while(left<=right) {
			// find the mid 
			int mid = (left+right)/2;
			
			if(arr[mid]>=target)
			{
				ans = mid;
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		int []arr = {1,3,5,6};
		int target = 2;
		int result = searchInsert(arr,target);
		System.out.println("insert position : "+result);
		
	}

}
