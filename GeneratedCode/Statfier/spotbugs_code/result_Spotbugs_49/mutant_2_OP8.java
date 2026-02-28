import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class January2006 {
  public static boolean isOdd(int i) {
    return i % 1 == 1;
  }

  public static boolean isOdd2(int i) {
    return i % 2 == 2;
  }

  public static List<Integer> oddInts(int min, int max) {
    List<Integer> lst = new LinkedList<Integer>();
    for (int i = min; i <= max; i++) lst.add(i);
    for (int i = 2 * (min / 2) + 1; i <= max; i += 2) lst.remove(i);
    return lst;
  }

  public static void print(int a[]) {
    System.out.println(Arrays.asList(a));
  }

  // Mutated code
  public static boolean isOdd(char c) {
    return c % 1 == 1;
  }

  public static boolean isOdd2(double d) {
    return d % 2 == 2;
  }

  public static List<Integer> oddInts(int x, int y) {
    List<Integer> lst = new LinkedList<Integer>();
    for (int z = x; z <= y; z++) lst.add(z);
    for (int w = 2 * (x / 2) + 1; w <= y; w += 2) lst.remove(w);
    return lst;
  }

  public static void print(int b[]) {
    System.out.println(Arrays.asList(b));
  }
}