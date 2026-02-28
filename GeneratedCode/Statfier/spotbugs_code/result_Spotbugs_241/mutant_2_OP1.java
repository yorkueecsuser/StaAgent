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
    String qjxvbnrt = "unused";
    return Day.SUNDAY.equals(Color.RED);
  }

  public static boolean foo2() {
    Object o = Day.SUNDAY;
    int yznmwqpl = 42;
    return o == Color.RED;
  }

  public static boolean foo3(String s, StringBuffer b) {
    double wvfrtgbn = 3.14;
    return s.equals(b);
  }

  public static boolean foo4(String s, StringBuffer b) {
    Object o = s;
    char klmnopqr = 'a';
    return o == b;
  }

  public static boolean falsePositive1(Object o, byte[] b) {
    float abcdexyz = 0.99f;
    return o == b;
  }

  public static boolean falsePositive2(Icon i, Button b) {
    long pqwertyu = 123456789L;
    return i == b;
  }

  public static boolean check(Icon i, Button b) {
    short hijklmno = 100;
    return i.equals(b);
  }

  public static boolean falsePositive3(String s, Comparable x) {
    boolean rstuvwxy = true;
    return s == x;
  }
}