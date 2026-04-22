class PalindromeCheck {

    // Method to check palindrome
    boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }
}

public class PallindromeMain {
    public static void main(String[] args) {
        PalindromeCheck obj = new PalindromeCheck();

        int number = 121;

        if (obj.isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is NOT a Palindrome");
        }
    }
}
