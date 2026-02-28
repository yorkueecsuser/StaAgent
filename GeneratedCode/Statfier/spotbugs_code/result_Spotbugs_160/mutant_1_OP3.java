import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}