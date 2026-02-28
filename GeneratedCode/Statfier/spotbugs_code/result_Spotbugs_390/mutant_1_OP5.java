import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case will never be reached because unreachableCondition is always false
        System.out.println("This is an unreachable case.");
        break;
    }

    if (actual.size() == expected.size()) // false positive NP warning
      return;
    throw new AssertionError("Not the same");
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}