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
    String abcdefgh = "unusedVariable";
    return Day.SUNDAY.equals(Color.RED);
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    int hijklmno = 42;
    return o == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    double pqrstuvw = 3.14;
    return s.equals(b);
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    char xyzabcde = 'x';
    return o == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    boolean fghijklm = true;
    return o == b;
  }

  public static boolean falsePositive2(Icon i, Button b) {
    long nopqrstu = 987654321L;
    return i == b;
  }

  public static boolean check(Icon i, Button b) {
    float vwxyzabc = 2.718f;
    return i.equals(b);
  }

  public static boolean falsePositive3(String s, Comparable x) {
    short defghijk = 1234;
    return s == x;
  }
}