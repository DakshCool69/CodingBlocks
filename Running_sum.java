package Array_Ass;

import java.util.Scanner;

public class Running_sum {
	public static void main(String[] args) {
    	Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int []rsum=runsum(arr);
		System.out.println(rsum);
	}

	public static int[] runsum(int[] arr) {
		int[] ans = new int[arr.length];
		ans[0] = arr[0];
		for (int i = 1; i < arr.length; i++)
			ans[i] = ans[i - 1] + arr[i];
		return ans;
	}

}
