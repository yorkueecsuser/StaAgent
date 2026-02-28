import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST {

  /**
   * @param args
   */
  @ExpectWarning("BSHIFT,ICAST")
  public static void main(String[] args) {
    int x = 20;
    byte q = 10;
    short s = 5;
    s = (short) (q >>> 16);
    q = (byte) (q >>> 16);
    x = x >>> 37;
    x = x << 36;
    x = q + s + x;
    x = x >> 38;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      x = x + 1;
    }

    double y = x;
    y = Math.ceil(y);
    double z = Math.ceil(x);
    System.out.println(x + q + s + x + y + z);
  }

  @ExpectWarning("ICAST")
  public int roundUp(int a, int b) {
    return (int) Math.ceil(a / b);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      a = a + 1;
    }
  }

  @ExpectWarning("ICAST")
  public double doubleDivision(int a, int b) {
    return (a / b);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      b = b + 1;
    }
  }

  @ExpectWarning("ICAST")
  public int round(int a, int b) {
    return Math.round(a / b);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      a = a + 1;
    }
  }

  @ExpectWarning("ICAST")
  public long convertDaysToMilliseconds(int days) {
    return days * 24 * 60 * 60 * 1000;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      days = days + 1;
    }
  }

  @ExpectWarning("ICAST")
  public long convertDaysToMilliseconds2(int days) {
    return 24 * 60 * 60 * 1000 * days;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      days = days + 1;
    }
  }

  @NoWarning("BSHIFT")
  public long falsePositive(byte[] value, int offset, long c) {
    c += ((long) value[offset + 22]) << 56;
    return c;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      c = c + 1;
    }
  }

  @ExpectWarning("BSHIFT")
  public long bug(byte[] value, int offset, long c) {
    c += (value[offset + 22] & 0xff) << 48;
    return c;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      c = c + 1;
    }
  }

  // Method to provide a dynamic condition for the while loops
  private static boolean getCondition() {
    return false;
  }
}