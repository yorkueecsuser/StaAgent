import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    if (actual.size() == expected.size()) // false positive NP warning
      return;
    
    // Inserting an unreachable if branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable statement");
    }

    throw new AssertionError("Not the same");
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}