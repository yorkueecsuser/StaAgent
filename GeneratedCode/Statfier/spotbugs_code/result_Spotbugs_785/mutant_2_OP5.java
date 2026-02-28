import java.util.Arrays;
import java.util.List;

class Ideas_2009_02_24 {
  public static final int HTML_ATTREMPTY = 0x2;

  public static final int ZERO = 0;

  static final List<String> NAMES = Arrays.asList(new String[] {"John", "Bill", "Sue", "Sarah"});

  public static void main(String args[]) {
    falsePositive();
    System.out.println(makeNonnegative(Integer.MIN_VALUE));
    
    // Added unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
      case 1:
        // This is the only reachable case
        break;
    }
  }

  public int maskFalsePositive() {
    int x = 0;
    return x | HTML_ATTREMPTY;
  }

  public int maskBug() {
    int x = 0;
    return x | ZERO;
  }

  public static int makeNonnegative(int x) {
    return x & 0xffffffff;
  }

  public static void falsePositive() {
    String[] a = (String[]) NAMES.toArray();
    String[] b = (String[]) Arrays.asList(new String[] {"x", "y"}).toArray();
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}