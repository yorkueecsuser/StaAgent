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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}