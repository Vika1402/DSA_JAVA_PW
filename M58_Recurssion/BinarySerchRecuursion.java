
public class BinarySerchRecuursion {
  public static int binarySerch(int arr[], int low, int high, int target) {
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (arr[mid] < target) {
        return binarySerch(arr, mid + 1, high, target);
      } else {
        return binarySerch(arr, low, mid - 1, target);
      }

    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int ans = binarySerch(arr, 0, arr.length - 1, 5);
    System.out.println(ans);
  }
}
