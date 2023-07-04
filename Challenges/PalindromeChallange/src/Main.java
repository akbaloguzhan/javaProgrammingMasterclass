public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(223));
        System.out.println(isPalindrome(47674));
        System.out.println(isPalindrome(292));
        System.out.println(isPalindrome(-101));
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome = palindrome / 10;
        }

        return (reverse == number);
    }
}