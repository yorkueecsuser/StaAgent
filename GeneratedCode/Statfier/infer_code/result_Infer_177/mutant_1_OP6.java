import java.util.List;
import java.util.Map;

class ForEachTest {

  int add(Integer x, Integer y) {
    return x + y;
  }

  int loop_linear(Integer x, List<Integer> list) {
    int sum = 0;
    for (Integer el : list) {
      sum = +el + x;
    }
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    return sum;
  }

  void map_linear(Map<Integer, Integer> map) {
    map.forEach((key, value) -> add(key, value));
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  void list_linear(List<Integer> myList) {
    myList.forEach(el -> add(el, 1));
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  // FN: We have limited lambda support and cannot incur costs of the lambda calls yet.
  void list_quadratic_FN(List<Integer> myList) {
    myList.forEach(el -> loop_linear(el, myList));
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}