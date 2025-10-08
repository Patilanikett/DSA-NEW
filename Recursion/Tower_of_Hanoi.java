public class Tower_of_Hanoi {
  public static void TOH(int n, String src , String dest ,  String helper)
  {
    if(n==1)
    {
      System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
      return;
    }
    TOH(n-1 , src, helper, dest);
    System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
    TOH(n-1 , helper, dest, src);
  }
  public static void main(String[] args) {
    int n=3;
    TOH(n, "S", "D", "H");
    
    
  }
  
}
