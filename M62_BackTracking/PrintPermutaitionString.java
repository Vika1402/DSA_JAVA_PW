public class PrintPermutaitionString {

  public static String swap(String str, int i, int j) {
    char[] arr = str.toCharArray();
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return String.valueOf(arr);
  }

  public static void permute(String str, int l, int r) {
    if (l == r) {
      System.out.println(str);
    } else {
      for (int i = l; i <= r; i++) {
        str = swap(str, l, i);
        permute(str, l + 1, r);
        str = swap(str, l, i);
      }
    }

  }

  public static void main(String[] args) {
    String str = "xy";
    permute(str, 0, str.length() - 1);

  }
}
