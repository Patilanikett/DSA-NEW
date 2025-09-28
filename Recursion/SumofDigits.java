public class SumofDigits {
  public static int getSum(int n)
  {
    if(n==0)
    {
      return 0;
    }
    return n%10 + getSum(n/10);

  }
  public static void main(String[] args) {
    int n=1234;
    System.out.println(getSum(n));
  }
  
}
