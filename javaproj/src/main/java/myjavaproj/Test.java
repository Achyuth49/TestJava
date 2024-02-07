package myjavaproj;

public class Test {
		public static void main(String[] args) {
			
			Student[] arr = new Student[5];
			arr[0] = new Student("Achyuth",449,75);
			arr[1] = new Student("Nani",221,56);
			arr[2] = new Student("Ram",324,89);
			arr[3] = new Student("Raju",332,88);
			arr[4] = new Student("Rajesh",429,86);
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("Element at "+i+" is :"+arr[i].name+" "+arr[i].roll_no+" "
			+arr[i].marks);
			}
		}
	}

