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
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    Object x = o; // Mutant: Renamed 'o' to 'x'
    return x == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    String t = s; // Mutant: Renamed's' to 't'
    return t.equals(b);
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    Object y = o; // Mutant: Renamed 'o' to 'y'
    return y == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    Object p = o; // Mutant: Renamed 'o' to 'p'
    return p == b;
  }

  public static boolean falsePositive2(Icon i, Button b) {
    Icon j = i; // Mutant: Renamed 'i' to 'j'
    return j == b;
  }

  public static boolean check(Icon i, Button b) {
    Icon k = i; // Mutant: Renamed 'i' to 'k'
    return k.equals(b);
  }

  public static boolean falsePositive3(String s, Comparable x) {
    String q = s; // Mutant: Renamed's' to 'q'
    return q == x;
  }
}