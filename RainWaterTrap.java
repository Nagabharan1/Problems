import java.util.*;
import java.util.Scanner;


public class RainWaterTrap {
	public static int water(int arr[],int n) {
		int total = 0;
		for(int i = 1 ;i < n-1;i++) {
			int l = arr[i];
			for(int j = 0;j < i;j++) 
				l = Math.max(l, arr[j]);
			int r = arr[i];
			for(int j = i+1;j < n;j++) 
				r = Math.max(r	, arr[j]);
			total += Math.min(l, r) - arr[i];
			
		}
		return total;
	}

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int n = arr.length;
		System.out.println(water(arr,n));
		// TODO Auto-generated method stub

	}

}
