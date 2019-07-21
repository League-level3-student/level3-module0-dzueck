package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;



public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"failure", " ", "is", " ", "invevitable"};
		MoreArrayFun thing = new MoreArrayFun();
		thing.printArray(strings);
		System.out.println();
		thing.printArrayReverse(strings);
		System.out.println();
		thing.printArrayEveryOther(strings);
		System.out.println();
		thing.printArrayRandom(strings);

	}
	
	public void printArray(String[] arry) {
		for(String string: arry) {
			System.out.println(string);
		}
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void printArrayReverse(String[] arry) {
		for(int i = arry.length -1; i > -1; i--) {
			System.out.println(arry[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public void printArrayEveryOther(String[] arry) {
		for(int i = 0; i > arry.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arry[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public void printArrayRandom(String[] arry) {
		ArrayList<String> newArray = new ArrayList<>();
		for(String string: arry) {
			newArray.add(string);
		}
		Random random = new Random();
		while(newArray.size() > 0) {
			int randomNumber = random.nextInt(newArray.size());
			System.out.println(newArray.get(randomNumber));
			newArray.remove(randomNumber);
		}
	}
	
}
