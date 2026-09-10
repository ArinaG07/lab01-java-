package edu.course.lab01;

public class TextTasks {

    public static void reverse(String input) {
        if (input == null) {
            System.out.println(" ");
            return;
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }

    public static void palindrome(String input) {
        if (input == null) {
            System.out.println("false");
            return;
        }

        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
        }

        System.out.println(isPalindrome);
    }
}


