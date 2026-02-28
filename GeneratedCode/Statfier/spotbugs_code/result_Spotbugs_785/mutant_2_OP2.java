import java.util.Arrays;
import java.util.List;

class Ideas_2009_02_24 {
  public static final int HTML_ATTREMPTY = 0x2;

  public static final int ZERO = 0;

  static final List<String> NAMES = Arrays.asList(new String[] {"John", "Bill", "Sue", "Sarah"});

  public static void main(String args[]) {
    falsePositive();
    System.out.println(makeNonnegative(Integer.MIN_VALUE));
  }

  public int maskFalsePositive() {
    int x = 0;
    x = x | HTML_ATTREMPTY; // Original assignment
    x = x | HTML_ATTREMPTY; // Duplicated assignment
    return x;
  }

  public int maskBug() {
    int x = 0;
    x = x | ZERO; // Original assignment
    x = x | ZERO; // Duplicated assignment
    return x;
  }

  public static int makeNonnegative(int x) {
    x = x & 0xffffffff; // Original assignment
    x = x & 0xffffffff; // Duplicated assignment
    return x;
  }

  public static void falsePositive() {
    String[] a = (String[]) NAMES.toArray();
    String[] b = (String[]) Arrays.asList(new String[] {"x", "y"}).toArray();
  }
}