package com.akshu.javaLogical;

import java.util.Scanner;
/*WAP TO STORE AND DIAPLAY THE STRING INTO ALPHABETICAL ORDER
*/
public class String3 {

	public static void main(String[] args) {
        // Input string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
        String inputString = sc.next();

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Implement Bubble Sort algorithm
        int n = charArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (charArray[j] > charArray[j+1]) {
                    // Swap characters if they are in the wrong order
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }

        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);

        // Display the sorted string
        System.out.println("Original string: " + inputString);
        System.out.println("Sorted string:   " + sortedString);
    }
}
