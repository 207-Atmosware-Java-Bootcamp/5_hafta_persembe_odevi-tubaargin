package stringmask;

import java.util.Scanner;

public class StringMask {
    private static String count ="";
    public static String stringMask(String word){
        for (var i = 0; i < word.length() -2; i++) {
            count += "*";
        }
        String result = word.charAt(0) + word.replace(word, count) + word.charAt(word.length() - 1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter word");
        String word =scan.nextLine();
        String secretWord=stringMask(word);
        System.out.println(secretWord);
    }
}
