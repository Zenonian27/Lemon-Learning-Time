/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Thexe
 */
public class TokenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Paste or type your text below. Press Enter then CTRL+D (Linux/Mac) or CTRL+Z (Windows) to finish:");

        StringBuilder textBuilder = new StringBuilder();
        //makes it easier to paste huge texts 
        while (scanner.hasNextLine()) {
            textBuilder.append(scanner.nextLine()).append("\n");//ty gpt
        }
        scanner.close();

        String text = textBuilder.toString().trim();
        int charCount = text.length();
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;//ty gpt

        // Token guesstimates, where i'd get the numbers? my ass 
        double tokensByChar = charCount / 4.0;   //ty google
        double tokensByWord = wordCount * 1.33;     //ty google

        System.out.println("\n=== Token Estimation Report ===");
        System.out.println("Character Count: " + charCount);
        System.out.println("Word Count: " + wordCount);
        System.out.printf("Estimated Tokens (by characters): %.0f%n", tokensByChar);
        System.out.printf("Estimated Tokens (by words): %.0f%n", tokensByWord);

        double averageTokens = (tokensByChar + tokensByWord) / 2.0; //screw math we love google
        System.out.printf("Average Estimated Tokens: %.0f%n", averageTokens);
    }
}