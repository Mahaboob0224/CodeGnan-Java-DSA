package com.java.Searching;
import java.util.List;
import java.util.Arrays;

public class Name_arrayList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("pen","paper","pencil","book");
		String target = "book";
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).equals(target)) {
				System.out.println("found index : "+i);
		
			}
			
		}

	}

}
