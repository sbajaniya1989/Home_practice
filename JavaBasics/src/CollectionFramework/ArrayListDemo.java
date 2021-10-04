package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Rajkot");
		cities.add("Baroda");
		cities.add("Ahmedabad");
		cities.add("Surat");
		cities.add("Gandhinagar");
		cities.add("surendranagar");
		cities.add("jamnagar");
		
		for(String t : cities) {
			System.out.println(t);
		}
		System.out.println();
		System.out.println("total number of elements = " + cities.size());
		System.out.println("Item stored at index 1 = " + cities.get(1));
		System.out.println("Index of surat = " + cities.indexOf("Surat"));
		System.out.println("Is vadnagar present in list? = " + cities.contains("vadnagar"));
	}

}
