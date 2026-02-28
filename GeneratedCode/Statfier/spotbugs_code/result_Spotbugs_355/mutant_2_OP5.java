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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  private static boolean getCondition() {
    // This method returns false, making the first case of the switch unreachable
    return false;
  }
}