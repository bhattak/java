package hello;

import java.util.Scanner;

public class BinarySearch {
	public static int bSearch(int []arr,int low,int high,int num) {
		if(low<=high) {
			int mid=low+high/2;
			if(arr[mid]==num) 
				return mid;
			if(num<arr[mid])
				 return bSearch(arr, low, mid-1, num);
			else
				return bSearch(arr, mid+1, high, num);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] arr= {2,4,6,8,9};
		int l=arr.length;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element you want to search " );
		int num=sc.nextInt();
		int position=bSearch(arr, 0, l-1, num);
		if(position==-1)
			System.out.println("Element is NOT present in the array");
		else
			System.out.println("Element is presnt at "+(position+1) +" position");
		sc.close();
	}
}
