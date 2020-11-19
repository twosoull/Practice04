package com.javaex.practice04;

public class Ex06 {
	public static void main(String[] args) {
		
	char d = ' ';
	char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
	System.out.println(c);
		for(int i = 0; i<c.length; i++) {
			if (c[i] == d) {
				c[i] = ',';
			}
		}
		System.out.println(c);
	}
}