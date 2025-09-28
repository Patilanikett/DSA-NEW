public class TailRecursion {
  public void fun(int n , int k)
  {
    if(n==0)
    {
      return;
    }
    System.out.println(k);
    fun(n-1, k+1);
  }
  public static void main(String[] args) {
    TailRecursion obj = new TailRecursion();
    obj.fun(5,1);
  }
}
