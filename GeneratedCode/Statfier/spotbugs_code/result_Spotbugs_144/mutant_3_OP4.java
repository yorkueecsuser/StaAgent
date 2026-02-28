import javax.annotation.Nonnull;

/**
 * Generates a false redundant null check warning.
 *
 * <p>Must set FindBugs to show low priority warnings.
 */
class Bug2800825 {

  public @Nonnull Object getNonNullValue() {
    return "dummy";
  }

  public void falsePositive() {
    if (null == getNonNullValue()) { // BUG - should not generate warning
      throw new IllegalStateException();
    }
    System.out.println("bar");

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false");
    } else {
      System.out.println("This will also never be printed because condition is always false");
    }
  }

  private boolean getCondition() {
    return false;
  }
}