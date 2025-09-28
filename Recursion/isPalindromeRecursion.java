import java.util.Scanner;
public class isPalindromeRecursion {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();   // reads whole line
        int n = str.length();

        if (isPalindrome(str, 0, n - 1)) {
            System.out.println("Yes, it is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
