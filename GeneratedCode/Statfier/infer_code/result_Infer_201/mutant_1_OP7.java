import com.google.common.base.Preconditions;
import java.util.ArrayList;

class PreconditionTest {
  // should be constant
  public void checkArgument_constant(ArrayList<Integer> list) {
    Preconditions.checkArgument(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // should be constant
  public void checkState_constant(ArrayList<Integer> list) {
    Preconditions.checkState(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  class Constant {
    public static final int FIVE = 5;
  }

  // should be constant
  static void constant_array(int[] a) {
    Preconditions.checkArgument(a.length == Constant.FIVE);
    for (int i : a) {
      Preconditions.checkArgument(i >= 0);
    }

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void checkNotNull_linear(ArrayList<Integer> list, Object o) {
    ArrayList<Integer> mediaList = Preconditions.checkNotNull(list, o);
    for (Integer el : mediaList) {}

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will always return false, making the loop condition effectively false
  }
}