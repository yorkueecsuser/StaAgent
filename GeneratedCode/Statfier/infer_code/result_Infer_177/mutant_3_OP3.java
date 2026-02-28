import java.util.List;
import java.util.Map;

class ForEachTest {

  int add(Integer x, Integer y) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return x + y;
  }

  int loop_linear(Integer x, List<Integer> list) {
    int sum = 0;
    for (Integer el : list) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        sum = 9999; // This line is unreachable due to the condition
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
        System.out.println("Unreachable in map_linear");
      }
      add(key, value);
    });
  }

  void list_linear(List<Integer> myList) {
    myList.forEach(el -> {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("Unreachable in list_linear");
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
        System.out.println("Unreachable in list_quadratic_FN");
      }
      loop_linear(el, myList);
    });
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}