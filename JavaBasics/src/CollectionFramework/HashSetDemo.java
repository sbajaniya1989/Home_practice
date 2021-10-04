package CollectionFramework;

import java.util.HashSet;


public class HashSetDemo {

	public static void main(String[] args) {
		
		 HashSet<String> cities = new HashSet<String>();
			
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
			//System.out.println("Index of surat = " + cities.indexOf("Surat"));
			System.out.println("Is vadnagar present in list? = " + cities.contains("vadnagar"));
			cities.remove(2);
			//System.out.println("Item stored at index 3 after removing Surat = " + cities.get(3));
		}



		
	}

