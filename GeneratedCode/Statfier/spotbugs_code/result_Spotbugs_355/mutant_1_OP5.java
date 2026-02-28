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

    // Inserting an unreachable switch statement
    boolean condition = false;
    switch(getCondition()) {
      case 1:
        System.out.println("This is unreachable case 1");
        break;
      case 2:
        System.out.println("This is unreachable case 2");
        break;
      default:
        System.out.println("This is unreachable default");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}