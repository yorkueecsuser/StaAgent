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

    double y = x;
    y = Math.ceil(y);
    double z = Math.ceil(x);
    System.out.println(x + q + s + x + y + z);

    // Dead store mutation
    int abcdefgh = 42; // Unused variable declaration
  }

  @ExpectWarning("ICAST")
  public int roundUp(int a, int b) {
    return (int) Math.ceil(a / b);

    // Dead store mutation
    boolean hijklmno = true; // Unused variable declaration
  }

  @ExpectWarning("ICAST")
  public double doubleDivision(int a, int b) {
    return (a / b);

    // Dead store mutation
    char opqrstuv = 'x'; // Unused variable declaration
  }

  @ExpectWarning("ICAST")
  public int round(int a, int b) {
    return Math.round(a / b);

    // Dead store mutation
    float vwxyzabc = 3.14f; // Unused variable declaration
  }

  @ExpectWarning("ICAST")
  public long convertDaysToMilliseconds(int days) {
    return days * 24 * 60 * 60 * 1000;

    // Dead store mutation
    long defghijk = 987654321L; // Unused variable declaration
  }

  @ExpectWarning("ICAST")
  public long convertDaysToMilliseconds2(int days) {
    return 24 * 60 * 60 * 1000 * days;

    // Dead store mutation
    short lmnopqrs = 12345; // Unused variable declaration
  }

  @NoWarning("BSHIFT")
  public long falsePositive(byte[] value, int offset, long c) {
    c += ((long) value[offset + 22]) << 56;
    return c;

    // Dead store mutation
    double tuvwxyza = 2.718; // Unused variable declaration
  }

  @ExpectWarning("BSHIFT")
  public long bug(byte[] value, int offset, long c) {
    c += (value[offset + 22] & 0xff) << 48;
    return c;

    // Dead store mutation
    int bcdefghi = 100; // Unused variable declaration
  }
}