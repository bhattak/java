package hello;

public class SelectionSort {
	private void sort(int []arr,int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) 
					min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
	public static void main(String[] args) {
		SelectionSort s=new SelectionSort();
		int [] arr= {3,2,6,4,8,0,6};
		int n=arr.length;
		s.sort(arr, n);
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}
	
}
