import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;

    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This is an unreachable while loop in method1");
    }

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This is an unreachable while loop in method2");
    }

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false; // This will ensure the loop is unreachable
  }
}