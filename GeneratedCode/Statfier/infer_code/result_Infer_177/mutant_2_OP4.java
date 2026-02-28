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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        sum += 100;
      } else {
        // Another unreachable code
        sum -= 100;
      }
    }
    return sum;
  }

  void map_linear(Map<Integer, Integer> map) {
    map.forEach((key, value) -> add(key, value));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      map.put(0, 0);
    } else {
      // Another unreachable code
      map.remove(0);
    }
  }

  void list_linear(List<Integer> myList) {
    myList.forEach(el -> add(el, 1));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      myList.add(0);
    } else {
      // Another unreachable code
      myList.remove(0);
    }
  }

  // FN: We have limited lambda support and cannot incur costs of the lambda calls yet.
  void list_quadratic_FN(List<Integer> myList) {
    myList.forEach(el -> loop_linear(el, myList));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      myList.clear();
    } else {
      // Another unreachable code
      myList.addAll(myList);
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}