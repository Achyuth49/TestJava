package myjavaproj;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 4;
		int originalN = n;
		n=2*n;
		
		for(int row=0;row<=n;row++) {
			for(int col=0;col<=n;col++) {
				int everyIndex =originalN- Math.min(Math.min(row, col),Math.min(n-row, n-col));
				System.out.print(everyIndex+" ");
			}
			System.out.println();
		}
	}
}
