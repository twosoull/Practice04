package com.javaex.practice04;

public class Ex01 {
	
	 public static void main(String[] args) {
		int[] intArray= new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		//i <= intArray.length 배열갯수와 i의 수가 같으면 배열인덱스가 6까지 나오는데 
		//우리가 만든 배열은 5개 까지이다 그래서 i < intArray.length; 고쳐야한다
		for(int i =0; i < intArray.length; i++) { 
			result = result+ intArray[i];
		}
		System.out.println(result);
	}
}
