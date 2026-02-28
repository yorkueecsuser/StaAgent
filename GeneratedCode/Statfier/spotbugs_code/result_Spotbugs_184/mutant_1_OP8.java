import java.util.Comparator;
import java.util.Map;

class Ideas_2011_03_07 {

  static <T extends Comparable<T>> void check(T x, T y) {
    if (x.compareTo(y) == 1) System.out.println("x > y");
    else if (x.compareTo(y) == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T extends Comparable<T>> void check2(T a, T y) {
    int compareTo = a.compareTo(y);
    boolean b = compareTo == 1;
    if (b) System.out.println("x > y");
    else if (compareTo == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T> void check(T x, T z, Comparator<T> c) {
    int comparison = c.compare(x, z);
    if (comparison == 1) System.out.println("x > y");
    else if (comparison == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  boolean oops(Map<String, Integer> n, StringBuffer sb) {
    return n.containsKey(sb);
  }

  boolean oops0(Map<String, Integer> m, StringBuffer q) {
    return m.get(q)!= null;
  }
}