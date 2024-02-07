package myjavaproj;

public class LinearSearchDemo {
	
	public static void main(String[] args) {
		int a[] = {2,7,9,10,4,8};
		int target = 22;
		boolean isTargetFound = false ;
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				System.out.println("Element found at :"+i);
				isTargetFound = true;
			}
		}
		if(!isTargetFound) {
			System.out.println("Element not found");
		}
	}

}
