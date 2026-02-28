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
    return sum;
  }

  // Mutant: Renamed'sum' to 'a'
  int loop_linear_m(Integer x, List<Integer> list) {
    int a = 0;
    for (Integer el : list) {
      a = +el + x;
    }
    return a;
  }

  void map_linear(Map<Integer, Integer> map) {
    map.forEach((key, value) -> add(key, value));
  }

  // Mutant: Renamed'map' to 'b'
  void map_linear_m(Map<Integer, Integer> b) {
    b.forEach((key, value) -> add(key, value));
  }

  void list_linear(List<Integer> myList) {
    myList.forEach(el -> add(el, 1));
  }

  // Mutant: Renamed'myList' to 'c'
  void list_linear_m(List<Integer> c) {
    c.forEach(el -> add(el, 1));
  }

  // FN: We have limited lambda support and cannot incur costs of the lambda calls yet.
  void list_quadratic_FN(List<Integer> myList) {
    myList.forEach(el -> loop_linear(el, myList));
  }

  // Mutant: Renamed'myList' to 'd'
  void list_quadratic_FN_m(List<Integer> d) {
    d.forEach(el -> loop_linear(el, d));
  }
}