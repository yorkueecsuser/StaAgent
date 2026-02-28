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

  public static boolean foo4Mutant(String t, StringBuffer c) {
    Object a = t;
    return a == c;
  }

  public static boolean falsePositive1Mutant(Object q, byte[] z) {
    return q == z;
  }

  public static boolean falsePositive2Mutant(Icon j, Button k) {
    return j == k;
  }

  public static boolean checkMutant(Icon j, Button k) {
    return j.equals(k);
  }

  public static boolean falsePositive3Mutant(String t, Comparable y) {
    return t == y;
  }
}