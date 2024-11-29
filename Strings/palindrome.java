package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (checkPalindrome(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");

        }

    }

    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n - 1 / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }

}
