/**
 * Submitted By: Heiko W.Rupp - pilhuhn Summary: (?) NPE and NFE concerning types like Integer not
 * found
 *
 * <p>The attache file contains three Exception throwing locations that all are not detected.
 *
 * <p>The first one is from autounboxing NULL as Integer into an int. The second one is the explicit
 * version of the previous one. The third is not a NPE, but a guaranteed NumberFormatException.
 */
class Bug1795838 {
  public static void main(String arg[]) {
    Bug1795838 fb = new Bug1795838();
    fb.foo();
  }

  public void foo() {
    int x;
    // Guaranteed NullPointerException
    x = bar(); // NPE due to implicit Integer.intValue()
    System.out.println("X is " + x);

    Integer tmp;
    tmp = bar();
    // Guaranteed NullPointerException
    int i = tmp.intValue(); // NPE
    System.out.println("I is " + i);

    // Guaranteed NumberFormatException
    i = Integer.parseInt(null); // NFE : null
    System.out.println("I is now" + i);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("Also unreachable");
        break;
    }
  }

  public Integer bar() {
    return null;
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0;
    }
  }
}