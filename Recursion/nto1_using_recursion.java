public class nto1_using_recursion {
  static void fun(int n){
    if(n==0)
  {
    return;

  } 
  System.out.println(n + " ");
  fun(n-1);
  }
public static void main(String[] args) {
  int n=12;
  fun(n);

  
}}