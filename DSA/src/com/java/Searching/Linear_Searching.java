package com.java.Searching;

public class Linear_Searching {

	public static void main(String[] args) {
	/*	int target = 25;
		var index = -1;
		int []arr = {10,20,40,90,25};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
			}
		System.out.println(index!=-1?"found at : "+index:"not found");
		}*/
		
         String [] arr = {"bahu","bali","deva","sena"};
         var target = "sena";
         var index = -1;
         
         for(int i = 0;i<arr.length;i++) {
        	 if(arr[i].equals(target)) {
        		 index = i;
        		 break;
        	 }
         }
     /*    boolean found = false;
         
         for(String ar:arr) {
        	 if(arr.equals(target)) {
        		 found =true;
        	 }
         
         }*/
         System.out.println(index!=-1?"found ar : "+index:"Not found");
         
	}

}
