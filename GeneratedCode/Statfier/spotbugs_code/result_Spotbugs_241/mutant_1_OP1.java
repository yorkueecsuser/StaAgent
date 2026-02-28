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
    String qjvhtyza = "unused";
    return Day.SUNDAY.equals(Color.RED);
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    int mfnxwvpo = 42;
    return o == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    double vbnrhtyu = 3.14;
    return s.equals(b);
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    char ztqjvhty = 'a';
    return o == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    boolean klmnopqr = true;
    return o == b;
  }

  public static boolean falsePositive2(Icon i, Button b) {
    float wxyzabcd = 0.99f;
    return i == b;
  }

  public static boolean check(Icon i, Button b) {
    long pqrsabcd = 123456789L;
    return i.equals(b);
  }

  public static boolean falsePositive3(String s, Comparable x) {
    short efghijkl = 10;
    return s == x;
  }
}