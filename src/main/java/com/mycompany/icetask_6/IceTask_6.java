/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask_6;
import java.util.Scanner;

/**
 *
 * @author Dawood
 */
public class IceTask_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int vowelCount = countVowels(sentence);
        System.out.println("The number of vowels in the sentence is: " + vowelCount);
    }

    public static int countVowels(String sentence) {
        // Convert sentence to lowercase for easier comparison
        sentence = sentence.toLowerCase();
        // List of vowels to check against
        String vowels = "aeiou";
        int count = 0;

        // Iterate through the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}