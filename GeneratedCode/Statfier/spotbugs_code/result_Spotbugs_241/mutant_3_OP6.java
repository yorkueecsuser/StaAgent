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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return Day.SUNDAY.equals(Color.RED);
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return o == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return s.equals(b);
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return o == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return o == b;
  }

  public static boolean falsePositive2(Icon i, Button b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return i == b;
  }

  public static boolean check(Icon i, Button b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return i.equals(b);
  }

  public static boolean falsePositive3(String s, Comparable x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return s == x;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}