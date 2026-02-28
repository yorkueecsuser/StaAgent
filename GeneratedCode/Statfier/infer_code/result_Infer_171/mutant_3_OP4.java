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
      System.out.println("This is another unreachable else block.");
    }
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("Yet another unreachable else block.");
    }
    return new ArrayList<String>(list);
  }

  private boolean getCondition() {
    // This method returns a condition that is dynamically determined at runtime
    return false; // This is safe as per the guidelines because the method can be changed to return true at runtime
  }
}