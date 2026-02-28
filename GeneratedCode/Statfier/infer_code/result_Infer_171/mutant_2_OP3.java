import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return immutableList;
  }

  List<String> badCast(ImmutableList<String> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is another unreachable statement");
    }
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("Yet another unreachable statement");
    }
    return new ArrayList<String>(list);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}