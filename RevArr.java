package Array_Ass;

import java.util.Scanner;

public class RevArr {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();//5
    int arr[]=new int[n];//5 size ka array
    for(int i = 0 ; i<n ; i++){//array mei store
        arr[i]=scn.nextInt();
    }
    rev(arr);//function call 
}
public static void rev(int[]arr) {
	for (int i = arr.length-1; i >= 0; i--) {
		System.out.println(arr[i]);
	}
	
	
	
//	return -1;
}
}
