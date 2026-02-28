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
    return Day.SUNDAY.equals(Color.RED);
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    return o == Color.RED;
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  public static boolean foo3(String s, StringBuffer b) {
    return s.equals(b);
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    return o == b;
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    return o == b;
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  public static boolean falsePositive2(Icon i, Button b) {
    return i == b;
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  public static boolean check(Icon i, Button b) {
    return i.equals(b);
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  public static boolean falsePositive3(String s, Comparable x) {
    return s == x;
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
    }
  }

  private static boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}