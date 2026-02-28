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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }
}