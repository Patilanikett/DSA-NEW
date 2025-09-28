public class sumofDigit {
  public static int getSum(int n)
  { int res=0;
    while(n>0)
    {
      res=res+n%10;
      n=n/10;
    }
    return res;

  }
  public static void main(String[] args) {
    int n=1234;
    System.out.println(getSum(n));
  }
  
}
