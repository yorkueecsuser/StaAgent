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
    return o == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    return s.equals(b);
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    return o == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    return o == b;
  }

  public static boolean falsePositive2(Icon i, Button b) {
    return i == b;
  }

  public static boolean check(Icon i, Button b) {
    return i.equals(b);
  }

  public static boolean falsePositive3(String s, Comparable x) {
    return s == x;
  }

  // Mutated code
  public static boolean foo1Mutant() {
    return Day.SUNDAY.equals(Color.RED);
  }

  public static boolean foo2Mutant() {
    Object a = Day.SUNDAY;
    return a == Color.RED;
  }

  public static boolean foo3Mutant(String t, StringBuffer c) {
    return t.equals(c);
  }

  public static boolean foo4Mutant(String r, StringBuffer d) {
    Object e = r;
    return e == d;
  }

  public static boolean falsePositive1Mutant(Object f, byte[] g) {
    return f == g;
  }

  public static boolean falsePositive2Mutant(Icon h, Button j) {
    return h == j;
  }

  public static boolean checkMutant(Icon k, Button l) {
    return k.equals(l);
  }

  public static boolean falsePositive3Mutant(String m, Comparable n) {
    return m == n;
  }
}