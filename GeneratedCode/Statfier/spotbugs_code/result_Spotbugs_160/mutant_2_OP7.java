import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}