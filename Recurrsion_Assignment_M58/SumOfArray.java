public class SumOfArray {

  public static int sum(int arr[], int idx) {
    if (idx == 0) {
      return arr[idx];
    }

    
    int result = arr[idx] + sum(arr, idx-1);
    return result;

  }
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3,4,5 };
    int n = arr.length;
 
    System.out.println(sum(arr,n-1));
  }
}
