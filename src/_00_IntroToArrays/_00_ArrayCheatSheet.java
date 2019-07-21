package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random random = new Random();
		//1. make an array of 5 Strings
		String[] strings = {"yes", "no", "give up", "it's over", "failure is inevitable"};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[3] = "don't give up";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < strings.length; i++) {
			strings[i] = "seven";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(String s: strings) {
			System.out.println(s);
		}
		//7. make an array of 50 integers
		int[] ints = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < ints.length; i++) {
			ints[i] = random.nextInt(100);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = ints[0];
		for(int n: ints) {
			if(n < smallest) {
				smallest = n;
			}
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for(int n: ints) {
			System.out.println(n);
		}
		//11. print the largest number in the array.
		int largest = ints[0];
		for(int n: ints) {
			if(n > largest) {
				largest = n;
			}
		}
		System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(ints[ints.length-1]);
	}
}
