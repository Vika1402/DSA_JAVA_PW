import java.util.Scanner;
/**
 * SumDigit
 */
public class SumDigit {
  public static int sumDigit(int n) {
    if (n == 1) {
      return n;
    }
    int result = n + sumDigit(n - 1);
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("plese enter the number : ");
    int n = sc.nextInt();
    System.out.println(sumDigit(n));

  }
}