import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {}

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is reachable");
    } else {
      // This block is unreachable
      System.out.println("This is unreachable");
    }
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is reachable");
    } else {
      // This block is unreachable
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}