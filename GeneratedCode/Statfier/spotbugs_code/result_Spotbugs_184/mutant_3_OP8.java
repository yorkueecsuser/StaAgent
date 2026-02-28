import java.util.Comparator;
import java.util.Map;

class Ideas_2011_03_07 {

  static <T extends Comparable<T>> void check(T x, T y) {
    if (x.compareTo(y) == 1) System.out.println("x > y");
    else if (x.compareTo(y) == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T extends Comparable<T>> void check2(T a, T y) { // Renamed 'x' to 'a'
    int compareTo = a.compareTo(y);
    boolean b = compareTo == 1;
    if (b) System.out.println("x > y");
    else if (compareTo == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T> void check(T x, T b, Comparator<T> c) { // Renamed 'y' to 'b'
    int comparison = c.compare(x, b);
    if (comparison == 1) System.out.println("x > y");
    else if (comparison == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  boolean oops(Map<String, Integer> m, StringBuffer s) { // Renamed'sb' to's'
    return m.containsKey(s);
  }

  boolean oops0(Map<String, Integer> n, StringBuffer sb) { // Renamed'm' to 'n'
    return n.get(sb)!= null;
  }
}