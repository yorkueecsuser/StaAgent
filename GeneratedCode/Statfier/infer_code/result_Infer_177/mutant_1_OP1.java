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
    String hqjvbnrt = "unused"; // Dead Store
    return sum;
  }

  void map_linear(Map<Integer, Integer> map) {
    map.forEach((key, value) -> add(key, value));
    int wxyzabcd = 42; // Dead Store
  }

  void list_linear(List<Integer> myList) {
    myList.forEach(el -> add(el, 1));
    boolean pqrsfgtu = true; // Dead Store
  }

  // FN: We have limited lambda support and cannot incur costs of the lambda calls yet.
  void list_quadratic_FN(List<Integer> myList) {
    myList.forEach(el -> loop_linear(el, myList));
    double ijklmnop = 3.14; // Dead Store
  }
}