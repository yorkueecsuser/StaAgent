import java.math.BigDecimal;

class Ideas_2009_05_26 {

  private Ideas_2009_05_26() {
    throw new UnsupportedOperationException();
  }

  public void Ideas_2009_05_26() {
    System.out.println("Hello");
  }

  public static void main(String args[]) {
    new BigDecimal("1.0");
    BigDecimal b = new BigDecimal("2.0");
    b.intValue();
    "".matches("a");

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}