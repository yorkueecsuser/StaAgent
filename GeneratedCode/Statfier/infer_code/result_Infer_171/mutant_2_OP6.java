import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    return immutableList;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  List<String> badCast(ImmutableList<String> list) {
    return list;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  List<String> goodCast(ImmutableList<String> list) {
    return new ArrayList<String>(list);
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    // This method is designed to return false, making the for loop unreachable
    return false;
  }
}