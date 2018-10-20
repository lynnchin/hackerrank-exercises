package com.hackerrank.coding.exercises;

import java.util.Collections;

/**
 * Created by lynnchin on 19/10/2018.
 */
public class RepeatedStrings {

	static long repeatedString(String s, long n) {

		if(s.length() == 1 && s.equals("a")) {
			return n;
		}
		
		StringBuilder builder = new StringBuilder((int)n);
		while (builder.length() < n) {
			builder.append(s);
		}
		String result = builder.toString().substring(0, (int)n);
		System.out.println(result);
		
		
		return (int) result.chars().filter(c -> c == 'a').count();
	}
	
	public static void main(String[] args) {
		System.out.println(RepeatedStrings.repeatedString("aba", 10));
	}
}
