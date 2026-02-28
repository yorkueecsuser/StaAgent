import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Introduced an unreachable for loop as per the mutation operator
  public static void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the loop condition always false
    return false;
  }
}