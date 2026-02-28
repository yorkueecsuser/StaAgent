import java.util.List;
import java.util.Map;

class ForEachTest {

  int add(Integer x, Integer y) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = x * 2;
    }
    return x + y;
  }

  int loop_linear(Integer x, List<Integer> list) {
    int sum = 0;
    for (Integer el : list) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        sum = sum - el;
      }
      sum = +el + x;
    }
    return sum;
  }

  void map_linear(Map<Integer, Integer> map) {
    map.forEach((key, value) -> {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        add(key, key);
      }
      add(key, value);
    });
  }

  void list_linear(List<Integer> myList) {
    myList.forEach(el -> {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        add(el, 2);
      }
      add(el, 1);
    });
  }

  // FN: We have limited lambda support and cannot incur costs of the lambda calls yet.
  void list_quadratic_FN(List<Integer> myList) {
    myList.forEach(el -> {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        loop_linear(el, myList);
      }
      loop_linear(el, myList);
    });
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}