import java.util.Comparator;
import java.util.Map;

class Ideas_2011_03_07 {

  static <T extends Comparable<T>> void check(T x, T y) {
    if (x.compareTo(y) == 1) System.out.println("x > y");
    else if (x.compareTo(y) == -1) System.out.println("x < y");
    else System.out.println("x == y");
    
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is an unreachable if statement");
    } else {
      System.out.println("This is an unreachable else statement");
    }
  }

  static <T extends Comparable<T>> void check2(T x, T y) {
    int compareTo = x.compareTo(y);
    boolean b = compareTo == 1;
    if (b) System.out.println("x > y");
    else if (compareTo == -1) System.out.println("x < y");
    else System.out.println("x == y");
    
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is an unreachable if statement in check2");
    } else {
      System.out.println("This is an unreachable else statement in check2");
    }
  }

  static <T> void check(T x, T y, Comparator<T> c) {
    int comparison = c.compare(x, y);
    if (comparison == 1) System.out.println("x > y");
    else if (comparison == -1) System.out.println("x < y");
    else System.out.println("x == y");
    
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is an unreachable if statement in check with comparator");
    } else {
      System.out.println("This is an unreachable else statement in check with comparator");
    }
  }

  boolean oops(Map<String, Integer> m, StringBuffer sb) {
    return m.containsKey(sb);
    
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is an unreachable if statement in oops");
    } else {
      System.out.println("This is an unreachable else statement in oops");
    }
  }

  boolean oops0(Map<String, Integer> m, StringBuffer sb) {
    return m.get(sb)!= null;
    
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is an unreachable if statement in oops0");
    } else {
      System.out.println("This is an unreachable else statement in oops0");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}