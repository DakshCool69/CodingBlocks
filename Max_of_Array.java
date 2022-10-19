package Array_Ass;

import java.util.Scanner;

public class Max_of_Array {
	public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();   
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
		}
		System.out.println(max(arr));
	}
public static int max(int[]arr) {
//	Scanner scn =new Scanner(System.in);
	int max=0;
	int idx=0;
	for(idx = 0 ; idx<arr.length; idx++){
		if(arr[idx]>max) {
			max=arr[idx];
		}
	}
	return idx-1;
}
}
