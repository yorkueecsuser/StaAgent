import java.util.Arrays;
import java.util.List;

class Ideas_2009_02_24 {
  public static final int HTML_ATTREMPTY = 0x2;

  public static final int ZERO = 0;

  static final List<String> NAMES = Arrays.asList(new String[] {"John", "Bill", "Sue", "Sarah"});

  public static void main(String args[]) {
    falsePositive();
    System.out.println(makeNonnegative(Integer.MIN_VALUE));
    // Added mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  public int maskFalsePositive() {
    int x = 0;
    return x | HTML_ATTREMPTY;
    // Added mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x += 10;
    } else {
      x -= 10;
    }
  }

  public int maskBug() {
    int x = 0;
    return x | ZERO;
    // Added mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x *= 2;
    } else {
      x /= 2;
    }
  }

  public static int makeNonnegative(int x) {
    return x & 0xffffffff;
    // Added mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x++;
    } else {
      x--;
    }
  }

  public static void falsePositive() {
    String[] a = (String[]) NAMES.toArray();
    String[] b = (String[]) Arrays.asList(new String[] {"x", "y"}).toArray();
    // Added mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable if");
    } else {
      System.out.println("Unreachable else");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, but it's not a compile-time constant
  }
}