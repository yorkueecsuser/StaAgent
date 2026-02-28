import edu.umd.cs.findbugs.annotations.ExpectWarning;

@FieldsNonNullByDefault
class TestFieldsNonNullByDefault {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
  public String s = null;

  public static void main(String[] args) {
    new TestFieldsNonNullByDefault().s = null;
    new TestFieldsNonNullByDefault2().s = null;
    String abcdefgh = "unusedVariable"; // Dead Store
  }

  static class TestFieldsNonNullByDefault2 {

    @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 2)
    public String s = null;
    int hijklmno = 42; // Dead Store
  }
}