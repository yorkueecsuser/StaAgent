import java.io.IOException;

class Bug1964520 extends Exception {
  private static final long serialVersionUID = 1L;

  public void test(Exception e) {
    // should trigger warning (and does)
    if (((Bug1964520) e).toString().equals("")) {
      System.out.println("toString is blank");
    }
    // should trigger warning (and does)
    if (e instanceof IOException && ((Bug1964520) e).toString().equals("")) {
      System.out.println("toString is blank");
    }
    // should not trigger warning (and doesn't)
    if (e instanceof Bug1964520 && ((Bug1964520) e).toString().equals("")) {
      System.out.println("toString is blank");
    }
    // should not trigger warning (and doesn't)
    if (e instanceof Bug1964520) {
      if (((Bug1964520) e).toString().equals("")) {
        System.out.println("toString is blank");
      }
    }

    // Unreachable switch statement mutant
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This will never be printed");
        break;
      case 1:
        // This is the only reachable case
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making the first case unreachable
  }
}