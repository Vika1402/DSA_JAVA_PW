public class PrintMax {
  public static int max(int arr[], int n, int idx) {
    if (idx == n - 1) {
      return n - 1;
    }
    int maxNum = max(arr, n, idx + 1);
    int MaxValue = Math.max(maxNum, arr[idx]);
    return MaxValue;

  }

  public static void main(String[] args) {
    int arr[] = { 133, 1, -3, 22, 5 };
    int n = arr.length;
    int idx = 0;
    System.out.println(max(arr, n, 0));

  }
}
