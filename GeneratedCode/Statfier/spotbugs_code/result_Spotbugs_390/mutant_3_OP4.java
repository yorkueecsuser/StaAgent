import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    if (actual.size() == expected.size()) // false positive NP warning
    return;

    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always be executed
      System.out.println("This is the reachable block");
    }

    throw new AssertionError("Not the same");
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}