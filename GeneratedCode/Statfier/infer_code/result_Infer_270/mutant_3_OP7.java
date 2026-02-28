import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
  }
  ;

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}