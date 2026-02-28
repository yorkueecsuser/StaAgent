import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    return immutableList;
  }

  List<String> badCast(ImmutableList<String> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement.");
    }
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable if statement.");
    }
    return new ArrayList<String>(list);
  }

  private boolean getCondition() {
    // This method returns a condition that is always false at runtime
    return false;
  }
}