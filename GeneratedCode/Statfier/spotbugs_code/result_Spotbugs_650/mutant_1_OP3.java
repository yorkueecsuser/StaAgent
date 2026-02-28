import edu.umd.cs.findbugs.annotations.ExpectWarning;

@FieldsNonNullByDefault
class TestFieldsNonNullByDefault {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
  public String s = null;

  public static void main(String[] args) {
    new TestFieldsNonNullByDefault().s = null;
    new TestFieldsNonNullByDefault2().s = null;

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  static class TestFieldsNonNullByDefault2 {

    @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
    public String s = null;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}