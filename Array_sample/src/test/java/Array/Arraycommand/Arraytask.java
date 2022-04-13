package Array.Arraycommand;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class Arraytask {

	int[] counta = { 23, 24, 33, 44, 55 };
	int[] countb = { 23, 24, 33, 44, 55 };
	
	public static void main(String[] args) {
		Arraytask task = new Arraytask();

		task.firtandlast();

		task.random();

		task.append();

		task.compare();

		task.insert();

		task.empty();

		task.shuffle();

		task.boxingandunboxing();

		task.rmduplicate();

		task.print();

		task.map();

		task.filter();

		task.remove();




	}
	int firtandlast() {
		// 1. A method to Get the First and Last Element of an Array.

		System.out.println("first element of the array:" + Array.getInt(counta, 1));
		System.out.println("last element of the array:" + Array.getInt(counta, counta.length - 1));
		
		return 0;
	}

	int random() {
		
		// 2. A method to Get a Random Value from an Array.
		int value = counta [new Random().nextInt(counta.length)];
		System.out.println("random method:" + value);
		
		return 0;
	}

	int append() {
		// 3. A method to Append a New Item to an Array
		
		counta = ArrayUtils.add(counta, 45);
		System.out.println("append of new item:" + Arrays.toString(counta));
		return 0;
	}

	int compare() {
		// 4. A method to Compare Two Arrays
		
		boolean areEqual = Arrays.equals(counta, countb);
		System.out.println("compare to arrays :" + areEqual);

		return 0;
	}

	int insert() {
		// 5. A method to Insert a Value Between Two Values
		
		int[] add = ArrayUtils.insert(3, counta, 2);
		System.out.println("add element:" + Arrays.toString(add));

		return 0;
	}

	int empty() {
		// 6. A method to Check if an Array Is Empty
		
		System.out.println("Array is empty:" + ArrayUtils.isEmpty(counta));

		return 0;
	}

	int shuffle() {
		// 7. A method to Shuffle the Elements of an Array
		
		ArrayUtils.shuffle(counta);
		System.out.println("shuffle the element:" + Arrays.toString(counta));
		return 0;
	}

	int boxingandunboxing() {
		// 8. A method to Box and Unbox Arrays

		// it is a convertion of primitive data type into wrapper class is boxing
		
		int[] num1 = {1,2,3,4};
		Integer[] list = ArrayUtils.toObject(num1);
		
		for (Integer box : list) {
			System.out.println("box:"+ box);
		}
	

		// it is a convertion of wrapper class into primitive data type is unboxing
		
		Integer[] objectArray = { 3, 5, 2, 5, 14, 4 };
		int[] array = ArrayUtils.toPrimitive(objectArray);
		System.out.println("unboxing"+Arrays.toString(array));
		
		
		return 0;
	}

	int rmduplicate() {
		// 9. A method to Remove Duplicates from an Array
		
	
		Integer[] list = {1,1,2,2,3,3,4,4,8,4};
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(list));
		set.toArray(new Integer[set.size()]);
		System.out.println("remove duplicate in:"+set);
	

		return 0;
	}

	int print() {
		// 10. A method to Print an Array
		
		for (int count = 0; count < counta.length; count++) {
		}
		System.out.println("print an array:"+Arrays.toString(counta));
		return 0;
	}
	
	
	int map() {
		// 11. A method to Map an Array to Another Type
		
		String[] map = Arrays.stream(counta).mapToObj(value -> String.format("Value: %s", value))
				  .toArray(String[]::new);
		for (String mapping : map) {
			System.out.println("map:"+ mapping);
		}
		
		return 0;
	}

	int filter() {
		// 12. A method to Filter Values in an Array
		
		int[] evenArray = Arrays.stream(counta).filter(value -> value % 2== 0) .toArray();  
				 for (int fill : evenArray) {
					System.out.println("filter of even number:"+fill);
				}
		return 0;
	}

	int remove() {
		// 13. A method to Removing the First Element of an Array
		
		int[] remove = ArrayUtils.remove(counta, 0);
		System.out.println("remove element:" + Arrays.toString(remove));

		return 0;
	}

}


