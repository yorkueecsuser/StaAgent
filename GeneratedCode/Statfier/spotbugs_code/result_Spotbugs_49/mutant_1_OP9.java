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
    int i = min;
    do {
      lst.add(i);
      i++;
    } while (i <= max);

    i = 2 * (min / 2) + 1;
    do {
      lst.remove(i);
      i += 2;
    } while (i <= max);
    return lst;
  }

  public static void print(int a[]) {
    System.out.println(Arrays.asList(a));
  }
}