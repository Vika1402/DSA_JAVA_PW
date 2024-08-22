
/**
 * code
 */
import java.util.*;

public class code {

  public static void main(String[] args) {
    HashMap<Integer, String> hm = new HashMap<>();
    hm.put(1, "one");
    hm.put(2, "two");
    hm.put(3, "three");
    System.out.println(hm); // {1=one, 2=two, 3=three}
    System.out.println(hm.get(3));
    System.out.println(hm.containsKey(3));// true

    for (Map.Entry<Integer, String> e : hm.entrySet()) {
      System.out.println(e.getKey() + " " + e.getValue());
    }

  }
}