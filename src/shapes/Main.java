package shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Main {
	void print_array(ArrayList<Integer> array, boolean reverse) {
		if(reverse) {
		for(int i = array.size() - 1; i >= 0; i--) {
			System.out.print(array.get(i) + ", ");
			}
		}else {
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + ", ");
			}
		}
		
		System.out.print("array_size:" + array.size()  + "\n");
	}
	
	/* Combine both arrays
	 * no duplicates
	 * sorted
	 * remove middle
	 * print in reverse
	 * print size
	 */
	ArrayList<Integer> combine_two_array(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		array1.addAll(array2);
		Collections.sort(array1);
		LinkedHashSet<Integer> temp = new LinkedHashSet<Integer>();
		temp.addAll(array1);
		array1.clear();
		array1.addAll(temp);
		int middle = array1.size()/2;
		array1.remove(middle);
		return array1;
	}
	/********************************************/
	
	void print_hash(LinkedHashMap hashMap) {
		System.out.print(hashMap.entrySet() + "\n" );
		System.out.print("hashMap:" + hashMap.size()  + "\n");
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(10, 7, 5, 3, 2, 9, 8, 6, 4, 1));
		ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(15, 6, 11, 7, 8, 9, 10, 14, 13, 12));
		
		Main mainObj = new Main();
		
		mainObj.print_array(array1, false);
		mainObj.print_array(array2, false);
		
		array1 = mainObj.combine_two_array(array1, array2);
		mainObj.print_array(array1, true);
		
		/********************************************/
		/* The simple answer it's be casue a linked hashMap is perfect for hold a key and value.
		 * It aslo uses insertion-order and that is important depending on what data you want to store. 
		 */
		Main mainObj2 = new Main();
		LinkedHashMap hashMap = new LinkedHashMap();
		hashMap.put(1, " value1");
		hashMap.put(2, " value2");
		hashMap.put(3, " value3");
		hashMap.put(4, " value4");
		hashMap.put(5, " value5");
		int key = 5;
		// If key do not add
		if (hashMap.containsKey(key)){
			System.out.print("Extra Key found:" + key + hashMap.get(5) + "\n");
		}else {
			hashMap.put(key, " value6");
		}
		mainObj2.print_hash(hashMap);
	}
	
}
