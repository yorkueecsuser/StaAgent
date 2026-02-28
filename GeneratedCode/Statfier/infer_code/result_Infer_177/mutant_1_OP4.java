import java.util.List;
import java.util.Map;

class ForEachTest {

  int add(Integer x, Integer y) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return x + y;
  }

  int loop_linear(Integer x, List<Integer> list) {
    int sum = 0;
    for (Integer el : list) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        sum = 0;
      } else {
        // Alternative unreachable code
        sum = -1;
      }
      sum = +el + x;
    }
    return sum;
  }

  void map_linear(Map<Integer, Integer> map) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      map.clear();
    } else {
      // Alternative unreachable code
      map.put(0, 0);
    }
    map.forEach((key, value) -> add(key, value));
  }

  void list_linear(List<Integer> myList) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      myList.clear();
    } else {
      // Alternative unreachable code
      myList.add(0);
    }
    myList.forEach(el -> add(el, 1));
  }

  // FN: We have limited lambda support and cannot incur costs of the lambda calls yet.
  void list_quadratic_FN(List<Integer> myList) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      myList.clear();
    } else {
      // Alternative unreachable code
      myList.add(0);
    }
    myList.forEach(el -> loop_linear(el, myList));
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}