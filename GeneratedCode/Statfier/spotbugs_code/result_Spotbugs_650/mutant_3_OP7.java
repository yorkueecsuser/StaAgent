import edu.umd.cs.findbugs.annotations.ExpectWarning;

@FieldsNonNullByDefault
class TestFieldsNonNullByDefault {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
  public String s = null;

  public static void main(String[] args) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }

    new TestFieldsNonNullByDefault().s = null;
    new TestFieldsNonNullByDefault2().s = null;
  }

  static class TestFieldsNonNullByDefault2 {

    @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
    public String s = null;

    public static void someMethod() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Another unreachable while loop
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}