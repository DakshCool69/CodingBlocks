 package Array_Ass;

import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();   
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
		}
		System.out.println(min(arr));
	}
public static int min(int[]arr) {
    if(arr.length == 0) {
        return -1;
    }
    int min = arr[0];
    for(int i = 1; i < arr.length; i++) {
        if(arr[i] < min) {
            min = i;
        }
    }
    return min;
}
}
