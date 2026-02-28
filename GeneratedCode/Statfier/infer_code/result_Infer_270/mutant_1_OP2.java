import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {
    int x = 5; // Introduced for demonstration of duplication mutation
    int x = 5; // Duplicate of the above assignment
  }

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);
  }
}