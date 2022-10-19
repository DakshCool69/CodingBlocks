package Array_Ass;

import java.util.Scanner;
public class Ali_Finder {
	public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt(); //4  
        int count=0;
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();		
		}
		int target=scn.nextInt();
		System.out.println(findAli(arr,target));
		
	}
	public static int findAli(int[]arr,int target) {
		int count=0;
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i]==target)count++;
		}
		return count;
	}
}
