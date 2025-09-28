public class FactRecursion {
  public int fact(int n)
  {
    if(n==0 || n==1)
    {
      return 1;
    }
    return n*fact(n-1);
  }
  public static void main(String[] args) {
    FactRecursion obj = new FactRecursion();
    
    System.out.println(obj.fact(5));
  }
}
