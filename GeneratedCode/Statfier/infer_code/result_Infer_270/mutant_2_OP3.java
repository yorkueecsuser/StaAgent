import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {}
  ;

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom

    // Inserted unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);

    // Inserted unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is another unreachable block.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}