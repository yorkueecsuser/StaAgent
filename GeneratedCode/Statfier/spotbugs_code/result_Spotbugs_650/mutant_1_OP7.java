import edu.umd.cs.findbugs.annotations.ExpectWarning;

@FieldsNonNullByDefault
class TestFieldsNonNullByDefault {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
  public String s = null;

  public static void main(String[] args) {
    new TestFieldsNonNullByDefault().s = null;
    new TestFieldsNonNullByDefault2().s = null;

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
  }

  static class TestFieldsNonNullByDefault2 {

    @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
    public String s = null;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the condition is always false at runtime, making the loop unreachable
  }
}