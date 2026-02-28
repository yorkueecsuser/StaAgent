import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {
    String jhgfdsaq = "unused"; // Dead Store mutation
  }

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom
    int vbnrhtyu = 42; // Dead Store mutation
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);
    boolean zxcvbnml = true; // Dead Store mutation
  }
}