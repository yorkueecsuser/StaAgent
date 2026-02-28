import java.util.Comparator;
import java.util.Map;

class Ideas_2011_03_07 {

  static <T extends Comparable<T>> void check(T x, T y) {
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }

    if (x.compareTo(y) == 1) System.out.println("x > y");
    else if (x.compareTo(y) == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T extends Comparable<T>> void check2(T x, T y) {
    int compareTo = x.compareTo(y);
    boolean b = compareTo == 1;

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }

    if (b) System.out.println("x > y");
    else if (compareTo == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  static <T> void check(T x, T y, Comparator<T> c) {
    int comparison = c.compare(x, y);

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }

    if (comparison == 1) System.out.println("x > y");
    else if (comparison == -1) System.out.println("x < y");
    else System.out.println("x == y");
  }

  boolean oops(Map<String, Integer> m, StringBuffer sb) {
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }

    return m.containsKey(sb);
  }

  boolean oops0(Map<String, Integer> m, StringBuffer sb) {
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }

    return m.get(sb)!= null;
  }

  // Method to provide a dynamic condition that will never be true
  private static boolean getCondition() {
    return false;
  }
}