public class Asymptotic
 {
  public  int getSum(int arr[], int x , int n) {
   
     if (n > arr.length) {
      n = arr.length;
    }
  for(int i=0;i<n;i++)
   if(arr[i]==x)
   {
   return i;

  }  
  return -1;
  }
  public static void main(String[] args) {
    Asymptotic obj=new Asymptotic();
    int arr[]={1,2,3,4,5};
    int n=4;
    int x=3;
    System.out.println(obj.getSum(arr,x , n));
  }
}
