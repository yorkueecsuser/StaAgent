import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {}
  ;

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will always be false
      System.out.println("This is an unreachable block.");
    }
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will always be false
      System.out.println("This is another unreachable block.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}