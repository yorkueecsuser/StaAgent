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

  public boolean getCondition() {
    return false;
  }

  public void falsePositive() {
    if (null == getNonNullValue()) { // BUG - should not generate warning
      throw new IllegalStateException();
    }
    System.out.println("bar");

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable");
    }
  }
}