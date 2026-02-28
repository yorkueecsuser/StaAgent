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
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to satisfy switch statement requirements
        break;
    }

    if (actual.size() == expected.size()) // false positive NP warning
      return;
    throw new AssertionError("Not the same");
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}