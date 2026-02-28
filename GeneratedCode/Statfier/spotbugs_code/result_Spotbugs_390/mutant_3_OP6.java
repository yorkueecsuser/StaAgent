import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }

    if (actual.size() == expected.size()) // false positive NP warning
      return;
    throw new AssertionError("Not the same");
  }

  private boolean getCondition() {
    // This method always returns false, making the for loop unreachable
    return false;
  }
}