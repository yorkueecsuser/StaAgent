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
    return Day.SUNDAY.equals(Color.RED); // Mutant
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    o = Day.SUNDAY; // Mutant
    return o == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    return s.equals(b);
    return s.equals(b); // Mutant
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    o = s; // Mutant
    return o == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    return o == b;
    return o == b; // Mutant
  }

  public static boolean falsePositive2(Icon i, Button b) {
    return i == b;
    return i == b; // Mutant
  }

  public static boolean check(Icon i, Button b) {
    return i.equals(b);
    return i.equals(b); // Mutant
  }

  public static boolean falsePositive3(String s, Comparable x) {
    return s == x;
    return s == x; // Mutant
  }
}