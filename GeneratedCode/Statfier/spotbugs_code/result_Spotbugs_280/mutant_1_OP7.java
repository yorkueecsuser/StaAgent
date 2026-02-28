import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3598482 {

  @NoWarning("BC_IMPOSSIBLE_INSTANCEOF")
  public static void main(String[] args) throws Exception {

    byte[] msg = "hello".getBytes("UTF-8");

    // should not trigger BC_IMPOSSIBLE_INSTANCEOF warning (bud did as reported bug 3598482)
    if (msg instanceof byte[]) {
      System.out.println("this is a byte[]");
    } else {
      System.out.println("this is not a byte[]");
    }

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }

    msg = new byte[100];

    // should not trigger warning (and doesn't)
    if (msg instanceof Cloneable) {
      System.out.println("this is a byte[]");
    } else {
      System.out.println("this is not a byte[]");
    }
  }

  @DesireWarning("BC_IMPOSSIBLE_INSTANCEOF")
  @ExpectWarning("NP_NULL_INSTANCEOF")
  public static void main2(String[] args) {

    byte[] msg = null;

    // properly triggers NP_LOAD_OF_KNOWN_NULL_VALUE
    // should trigger BC_IMPOSSIBLE_INSTANCEOF warning (but doesn't)
    if (msg instanceof byte[]) {
      System.out.println("this is a byte[]");
    } else {
      System.out.println("this is not a byte[]");
    }

    // Introduced unreachable while loop
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
      System.out.println("This is another unreachable loop");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}