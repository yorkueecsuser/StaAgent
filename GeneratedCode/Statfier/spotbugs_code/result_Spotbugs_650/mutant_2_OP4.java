import edu.umd.cs.findbugs.annotations.ExpectWarning;

@FieldsNonNullByDefault
class TestFieldsNonNullByDefault {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
  public String s = null;

  public static void main(String[] args) {
    new TestFieldsNonNullByDefault().s = null;
    new TestFieldsNonNullByDefault2().s = null;

    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
    // Mutant code end
  }

  static class TestFieldsNonNullByDefault2 {

    @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
    public String s = null;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}