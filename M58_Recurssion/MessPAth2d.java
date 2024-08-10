public class MessPAth2d {
  public static void mazePath(int cr, int cc, int dr, int dc, String str) {
    if (cr > dr || cc > dc) {
      return;
    }
    if (cr == dr && cc == dc) {
      System.out.println(str);
      return;
    }

    mazePath(cr + 1, cc, dr, dc, str + 'h');
    mazePath(cr, cc + 1, dr, dc, str + 'v');

  }

  public static void main(String[] args) {
    mazePath(0, 0, 2, 2, "");
  }
}
