package com.hackerrank.coding.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.SocketHandler;
import java.util.stream.Collectors;

/**
 * Created by lynnchin on 18/10/2018.
 */
public class SocksMerchant {

	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> countSocksMap = new HashMap<>();

		for(int i = 0; i < ar.length; i++) {
			if(!countSocksMap.containsKey(ar[i])){
				countSocksMap.put(ar[i], 1);
			}else {
				Integer value = countSocksMap.get(ar[i]);
				countSocksMap.put(ar[i], ++value);
			}
		}

		System.out.println(countSocksMap);

		int countSocks = 0;
		for (Object key : countSocksMap.keySet()) {
			 if(countSocksMap.get(key) / 2 >  0) {
				   Integer value = countSocksMap.get(key) / 2;
				 	 countSocks += value;
			 }
		}
		return countSocks;
	}
	
	public static void main(String[] args) {
		System.out.println(SocksMerchant.sockMerchant(9, new int[]{10,20,20,10,10,30,50,10,20}));
	}
	
	
}
