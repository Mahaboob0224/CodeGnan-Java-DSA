package com.java.Searching;

public class MidOccurance {
	public static int lastOccurence(int []arr,int target) {
		int low = 0;
		int high = arr.length-1;
		int ans = -1;           // unknown Element
		while(low<=high) 
		{
			int mid = (low+high)/2;
			if(arr[mid] ==  target) {
				ans = mid;                 // updating Element
				 high = mid-1;
				 low = mid+1;

			}else if(arr[mid]<target) {
				low = mid+1;
			}else {
				high= mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[]arr = {1,2,2,2,2,2,2,2,2,3,4,4,};
		int target = 2;
		System.out.println(lastOccurence(arr, target));

}
}
