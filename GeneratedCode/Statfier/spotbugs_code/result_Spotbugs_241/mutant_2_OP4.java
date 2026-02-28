import java.awt.Button;
import javax.swing.Icon;

class MoreComparingUncomparableObjects {
  static enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
  };

  static enum Color {
    RED,
    GREEN,
    BLUE
  };

  public static boolean foo1() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return Day.SUNDAY.equals(Color.RED);
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return o == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return s.equals(b);
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return o == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return o == b;
  }

  public static boolean falsePositive2(Icon i, Button b) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return i == b;
  }

  public static boolean check(Icon i, Button b) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return i.equals(b);
  }

  public static boolean falsePositive3(String s, Comparable x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return true;
    } else {
      // Unreachable code
      return false;
    }
    return s == x;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}