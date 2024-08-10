
public class TilesProblem {

  public static long totalArrangment(long n) {
    if (n <= 3) {
      return n;
    }
    return totalArrangment(n - 1) + totalArrangment(n - 2);
  }

  public static void main(String[] args) {
    long noOfTiles = 12;
    System.out.println("for n :" + noOfTiles + " total ways:" + totalArrangment(noOfTiles));
  }
}
