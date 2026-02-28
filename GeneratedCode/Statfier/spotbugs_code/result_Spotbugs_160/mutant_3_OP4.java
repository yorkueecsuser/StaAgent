import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block in method1");
    } else {
      // This block should also never execute due to the nature of the condition
      System.out.println("This is another unreachable block in method1");
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block in method2");
    } else {
      // This block should also never execute due to the nature of the condition
      System.out.println("This is another unreachable block in method2");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the if-else blocks unreachable
  }
}