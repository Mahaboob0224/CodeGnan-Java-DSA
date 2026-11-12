package com.java.Searching;

public class CountOccurance {
	public static int firstOccurence(int []arr,int target) {
		int low = 0;
		int high = arr.length-1;
		int ans = -1;           // unknown Element
		while(low<=high) 
		{
			int mid = (low+high)/2;
			if(arr[mid] ==  target) {
				ans = mid;                 // updating Element
				 high=mid-1;  // going left
				 // low = mid+1;                     // Last Occurence

			}else if(arr[mid]<target) {
				low = mid+1;
			}else {
				high= mid-1;
			}
		}
		return ans;

}
	public static int lastOccurence(int []arr,int target) {
		int low = 0;
		int high = arr.length-1;
		int ans = -1;           // unknown Element
		while(low<=high) 
		{
			int mid = (low+high)/2;
			if(arr[mid] ==  target) {
				ans = mid;                 // updating Element
				 
				 low = mid+1;

			}else if(arr[mid]<target) {
				low = mid+1;
			}else {
				high= mid-1;
			}
		}
		return ans;
	}
	public static int countOccurance(int arr[],int target) {
		int first = firstOccurence(arr, target);
		if(first == 1) {
			return 0;
		}
		int last = lastOccurence(arr, target);
		return last-first+1;  // counting Occurances
	}
	public static void main(String[] args) {
		int[]arr = {1,2,2,2,2,2,2,2,2,3,4,4,};
		int target = 2;
		System.out.println("count : "+lastOccurence(arr, target));

		
	}
}
