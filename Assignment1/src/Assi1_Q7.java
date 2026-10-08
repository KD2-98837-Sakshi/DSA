import java.util.Scanner;

public class Assi1_Q7 {
	 public static int searchInsert(int[] nums, int target) {
	        int left=0;
	        int right=nums.length-1;
	        while(left<=right){
	            int mid=left+(right-left)/2;
	            if(nums[mid]==target)
	                return mid;
	            else if(target>nums[mid]){
	                left=mid+1;
	            }
	            else
	                right=mid-1;
	    }
	    return left;
	 }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("enter number of elements:");
		n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elment");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the key to be add: ");
		int key = scanner.nextInt();
		
		int idx=searchInsert(arr, key);
		System.out.println("Key will be added at index: "+idx);
	}

}
