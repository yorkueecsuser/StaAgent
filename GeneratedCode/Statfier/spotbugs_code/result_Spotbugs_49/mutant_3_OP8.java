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

  // Mutated code with renaming
  public static boolean isOdd(char x) {
    return x % 1 == 1;
  }

  public static boolean isOdd2(byte y) {
    return y % 2 == 2;
  }

  public static List<Integer> oddInts(int n, int m) {
    List<Integer> l = new LinkedList<Integer>();
    for (int j = n; j <= m; j++) l.add(j);
    for (int k = 2 * (n / 2) + 1; k <= m; k += 2) l.remove(k);
    return l;
  }

  public static void print(int b[]) {
    System.out.println(Arrays.asList(b));
  }
}