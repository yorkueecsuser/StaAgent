import java.math.BigDecimal;

class Ideas_2009_05_26 {

  private Ideas_2009_05_26() {
    throw new UnsupportedOperationException();
  }

  public void Ideas_2009_05_26() {
    System.out.println("Hello");
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
  }

  public static void main(String args[]) {
    new BigDecimal("1.0");
    BigDecimal b = new BigDecimal("2.0");
    b.intValue();
    "".matches("a");
    // Inserting unreachable while loop
    boolean conditionWhileMain = getCondition();
    while (conditionWhileMain) {
      // This loop is unreachable because conditionWhileMain is never set to true
    }
  }

  private static boolean getCondition() {
    return false;
  }
}