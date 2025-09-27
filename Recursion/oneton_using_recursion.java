import java.util.Scanner;

public class oneton_using_recursion {
  static void fun(int n){
    if(n==0)
  {
    return;

  } 
 fun(n-1);
  System.out.println(n + " ");
   
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
    //int n=12;
    fun(n); 
}}
