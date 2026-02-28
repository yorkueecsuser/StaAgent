import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures that the condition is false at runtime
  }
}