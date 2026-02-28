import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    if (actual.size() == expected.size()) // false positive NP warning
      return;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative block that also should never execute due to the nature of shouldRun
      System.out.println("This is another unreachable block");
    }

    throw new AssertionError("Not the same");
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if-else block is unreachable
    return false;
  }
}