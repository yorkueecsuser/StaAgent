import java.util.Comparator;
import java.util.Map;

class Ideas_2011_03_07 {

  static <T extends Comparable<T>> void check(T x, T y) {
    if (x.compareTo(y) == 1) System.out.println("x > y");
    else if (x.compareTo(y) == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T extends Comparable<T>> void check2(T x, T y) {
    int compareTo = x.compareTo(y);
    boolean b = compareTo == 1;
    if (b) System.out.println("x > y");
    else if (compareTo == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T> void check(T x, T y, Comparator<T> c) {
    int comparison = c.compare(x, y);
    if (comparison == 1) System.out.println("x > y");
    else if (comparison == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  boolean oops(Map<String, Integer> m, StringBuffer sb) {
    return m.containsKey(sb);
  }

  boolean oops0(Map<String, Integer> m, StringBuffer sb) {
    return m.get(sb)!= null;
  }

  // Mutated code
  static <T extends Comparable<T>> void check(T a, T y) {
    if (a.compareTo(y) == 1) System.out.println("a > y");
    else if (a.compareTo(y) == -1) System.out.println("a < y");
    else System.out.println("a == y");
  }

  static <T extends Comparable<T>> void check2(T x, T z) {
    int compareTo = x.compareTo(z);
    boolean b = compareTo == 1;
    if (b) System.out.println("x > z");
    else if (compareTo == -1) System.out.println("x < z");
    else System.out.println("x == z");
  }

  static <T> void check(T x, T q, Comparator<T> c) {
    int comparison = c.compare(x, q);
    if (comparison == 1) System.out.println("x > q");
    else if (comparison == -1) System.out.println("x < q");
    else System.out.println("x == q");
  }

  boolean oops(Map<String, Integer> n, StringBuffer sb) {
    return n.containsKey(sb);
  }

  boolean oops0(Map<String, Integer> m, StringBuffer t) {
    return m.get(t)!= null;
  }
}