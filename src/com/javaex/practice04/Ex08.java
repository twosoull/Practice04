package com.javaex.practice04;

public class Ex08 {
	public static void main(String[] args) {
		
	
	int[] nums = new int[6];
	
	for(int i=0; i<nums.length; i++) {
		nums[i] = (int)(Math.random()*15)+1;
		for(int j=0; j<i; j++) {
			if(nums[i] == nums[j]) {
				i--;		
				break;
			}
		}
	}
	for(int i =0; i<nums.length; i++) {
		System.out.print(nums[i]+"  ");
	}
	}
}
