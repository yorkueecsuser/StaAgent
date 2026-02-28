import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {}
  ;

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom

    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // Alternative block
      System.out.println("This will be printed if shouldRun is false");
    }
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);

    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // Alternative block
      System.out.println("This will be printed if shouldRun is false");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the if-block is unreachable
  }
}