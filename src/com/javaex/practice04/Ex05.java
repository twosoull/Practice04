package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int total = 0;
		float avg;
		for(int i = 0; i<num.length; i++) {
			int scan = sc.nextInt();
			num[i] = scan;
			total = total + num[i];
		}
		avg = (float)(total/5.0);
		System.out.printf("평균은 %4.1f 입니다.",avg);
	}
}

