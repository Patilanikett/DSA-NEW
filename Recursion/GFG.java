public class GFG {
  static void fun1() {
    System.out.println("fun1");
    fun1();
  }
  public static void main(String[] args) {
    fun1();                 
      System.out.println("Back to main");
  }
  
}
