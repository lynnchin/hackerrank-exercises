package com.hackerrank.coding.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lynnchin on 19/10/2018.
 */
public class CountDuplicate {

	public static int countDuplicates(List<Integer> numbers) {
		// Write your code here
		Map<Integer, Integer> countDuplicateMap = new HashMap<>();

		for(int i = 0; i < numbers.size(); i++) {
			if(countDuplicateMap.containsKey(numbers.get(i))) {
				Integer foundResult = countDuplicateMap.get(numbers.get(i));
				foundResult += 1;
				countDuplicateMap.put(numbers.get(i), foundResult);
			}else{
				countDuplicateMap.put(numbers.get(i), 1);
			}
		}
		
		return (int) countDuplicateMap.entrySet().stream().filter(x -> x.getValue() > 1).count();
	}
	
	public static void main(String[] args) {
		//System.out.println(CountDuplicate.countDuplicates(Arrays.asList(1,1,4,5,4,6)));
		System.out.println(Math.floor((5+2-1)/2));
	}
}
