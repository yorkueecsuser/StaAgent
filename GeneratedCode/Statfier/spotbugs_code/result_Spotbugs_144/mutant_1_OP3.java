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

  private boolean getCondition() {
    return false;
  }

  public void falsePositive() {
    if (null == getNonNullValue()) { // BUG - should not generate warning
      throw new IllegalStateException();
    }
    System.out.println("bar");

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement due to condition always being false.");
    }
  }
}