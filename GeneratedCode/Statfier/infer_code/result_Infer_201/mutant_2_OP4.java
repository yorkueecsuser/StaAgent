import com.google.common.base.Preconditions;
import java.util.ArrayList;

class PreconditionTest {
  // should be constant
  public void checkArgument_constant(ArrayList<Integer> list) {
    Preconditions.checkArgument(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  // should be constant
  public void checkState_constant(ArrayList<Integer> list) {
    Preconditions.checkState(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  public void checkNotNull_linear(ArrayList<Integer> list, Object o) {
    ArrayList<Integer> mediaList = Preconditions.checkNotNull(list, o);
    for (Integer el : mediaList) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}