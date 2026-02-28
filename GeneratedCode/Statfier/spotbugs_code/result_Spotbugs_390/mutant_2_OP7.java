import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

    if (actual.size() == expected.size()) // false positive NP warning
      return;
    throw new AssertionError("Not the same");
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the while loop unreachable
  }
}