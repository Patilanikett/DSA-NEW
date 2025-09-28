public class PalindromeRecursion {
  public static boolean isPalindrome(String str,int start , int end)
  {
    if(start>=end)
  {
    return true;
  }
  return (str.charAt(start)==str.charAt(end)) && isPalindrome(str, start+1, end-1);
  }
  public static void main(String[] args) {
    String str="madam";
    int n=str.length();
    if(isPalindrome(str,0,n-1))
    {
      System.out.println(" yes it is Palindrome");
    }
    else
    {
      System.out.println("Not a Palindrome");
    }
  }
}
