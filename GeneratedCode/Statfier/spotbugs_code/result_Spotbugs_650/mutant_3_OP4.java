import edu.umd.cs.findbugs.annotations.ExpectWarning;

@FieldsNonNullByDefault
class TestFieldsNonNullByDefault {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
  public String s = null;

  public static void main(String[] args) {
    new TestFieldsNonNullByDefault().s = null;
    new TestFieldsNonNullByDefault2().s = null;

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will run if condition is true");
    } else {
      System.out.println("This is unreachable");
    }
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