import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
    return immutableList;
  }

  List<String> badCast(ImmutableList<String> list) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
    return new ArrayList<String>(list);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}