package com.hackerrank.coding.exercises;

/**
 * Created by lynnchin on 19/10/2018.
 */
public class JumpingClouds {
	static int jumpingOnClouds(int[] c) {
		int count = 0;
		int i = 0;
		int n = c.length;
		while(i<n-1) {
			if (i<n-2 && c[i+2]==0) {
				i++;
			}
			if(i != n - 1) {
				count++;
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(JumpingClouds.jumpingOnClouds(new int[]{0,0,1,0,0,1,0}));
	}
}
