package Array_Ass;

import java.util.Scanner;

public class Majority {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // 4
		int count = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(majority(arr));
	}
	public static int majority(int[]arr) {
		int Maj=0;
		int count=0;
		for(int i = 0 ; i <arr.length ;i++) {
			if(count==0)Maj=arr[i];
			if(arr[i]==Maj)count++;
			else count--;
		}
		return Maj;
	}
}
