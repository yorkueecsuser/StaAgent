import com.google.common.base.Preconditions;

class UnreachableAtExitTest {

  // cost: 1
  void unit_cost() {}
  ;

  public void infeasible_path_unreachable() {
    Preconditions.checkState(false); // pruned to bottom

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is unreachable");
        break;
    }
  }

  // we can't handle doubles properly in Inferbo
  public void double_prune_unreachable_FN(double fpp) {
    Preconditions.checkArgument(fpp > 0.0 && fpp < 0.0);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}