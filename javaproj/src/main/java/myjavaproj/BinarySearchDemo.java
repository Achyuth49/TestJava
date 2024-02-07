package myjavaproj;

public class BinarySearchDemo {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int start = 0;
		int end = a.length-1;
		int target = 4;
		boolean isTargetFound= false;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(a[mid]==target) {
				System.out.println("Element found at :"+mid);
				isTargetFound=true;
				break;
			}else if(a[mid]>target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		if(!isTargetFound) {
			System.out.println("Element not found");
		}
	}

}
