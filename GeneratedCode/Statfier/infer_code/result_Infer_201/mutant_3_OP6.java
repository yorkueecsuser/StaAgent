import com.google.common.base.Preconditions;
import java.util.ArrayList;

class PreconditionTest {
  // should be constant
  public void checkArgument_constant(ArrayList<Integer> list) {
    Preconditions.checkArgument(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  // should be constant
  public void checkState_constant(ArrayList<Integer> list) {
    Preconditions.checkState(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
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

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  public void checkNotNull_linear(ArrayList<Integer> list, Object o) {
    ArrayList<Integer> mediaList = Preconditions.checkNotNull(list, o);
    for (Integer el : mediaList) {}

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}