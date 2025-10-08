public class Iosephus {
   public static int Iosephus(int n , int k)
   {
    if(n==1)
    {
      return 0;
    }
    else{
      return (Iosephus(n-1 , k)+k)%n;
    }
   }
    public static void main(String[] args) {
      int n=7;
      int k=3;
      System.out.println(Iosephus(n, k)+1);
    }
  
}
