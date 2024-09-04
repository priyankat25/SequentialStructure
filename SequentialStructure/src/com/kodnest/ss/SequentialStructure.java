package com.kodnest.ss;

import java.util.Scanner;

public class SequentialStructure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		int[] res = SequentialStructures(a, k);
		
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}

	private static int[] SequentialStructures(int[] a, int k) {
		int[] res = new int[a.length];
		for (int i=0; i<a.length; i++) {
			res[i] = a[a.length-1-i] - (k+i-1);
        }
		return res;		
	}
}