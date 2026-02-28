import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    return immutableList;
  }

  List<String> badCast(ImmutableList<String> list) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    return new ArrayList<String>(list);
  }

  private boolean getCondition() {
    // This method can return any dynamic condition, here it returns false to ensure the else block is unreachable
    return false;
  }
}