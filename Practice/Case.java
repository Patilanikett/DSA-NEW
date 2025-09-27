public class Case {
  public  int getSum(int arr[], int n) {
    int sum=0;
     if (n > arr.length) {
      n = arr.length;
    }
  for(int i=0;i<n;i++)
   sum=sum+arr[i];
  return sum;
  }  
  public static void main(String[] args) {
    Case obj=new Case();
    int arr[]={1,2,3,4,5};
    int n=4;
    System.out.println(obj.getSum(arr,n));
  }
}
