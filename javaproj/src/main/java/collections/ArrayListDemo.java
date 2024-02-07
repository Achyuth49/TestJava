package collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> al1 = new ArrayList<>();
		al1.add("al1 first");
		al1.add("al1 second");
		List<String> al = new ArrayList<>();
		al.add("Achyuth");
		al.add("Mahesh");
		al.add("Nani");
		al.add("Same");
		al.add("Same");
		al.add(2, "Added with index val-2");
		
		System.out.println(al);
		al.addAll(al1); // added at last
		System.out.println("----"+al);
		al.addAll(3, al1);//added at index val 3
		System.out.println("--------"+al);
		boolean con = al.contains("Mahesh");
		boolean con1 = al.containsAll(al1);
		System.out.println(con);
		System.out.println(con1);
		boolean con3 = al.equals(al1);
		System.out.println(con3);
		
		
		al.remove(4);
		System.out.println("-----------"+al);
		
		
		al.removeAll(al1);
		
		System.out.println("--------------"+al);
	
		
		//System.out.println("Using for each loop");
		
		al.reversed();
		int size = al.size();
		System.out.println("size----"+size);
		
		Collections.sort(al);
		
		System.out.println("After sorting ---------------"+al);
	/*	System.out.println("Using Iterator");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}

}
