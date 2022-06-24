package stringreverse;

import java.util.Scanner;

public class StringReverse {
    private static int count=0;
    public static void stringReverse(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            count++;
            System.out.print(word.charAt(i));
        }
        System.out.println(" girilen kelime "+count+ " harflidir");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.nextLine();
        stringReverse(word);
    }
}
