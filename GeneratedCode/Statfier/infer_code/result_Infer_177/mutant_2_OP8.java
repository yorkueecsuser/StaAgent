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

  // Mutant 1: Renaming'sum' to 'a'
  int loop_linear_mutant1(Integer x, List<Integer> list) {
    int a = 0;
    for (Integer el : list) {
      a = +el + x;
    }
    return a;
  }

  void map_linear(Map<Integer, Integer> map) {
    map.forEach((key, value) -> add(key, value));
  }

  // Mutant 2: Renaming 'key' to 'b'
  void map_linear_mutant2(Map<Integer, Integer> map) {
    map.forEach((b, value) -> add(b, value));
  }

  void list_linear(List<Integer> myList) {
    myList.forEach(el -> add(el, 1));
  }

  // Mutant 3: Renaming'myList' to 'c'
  void list_linear_mutant3(List<Integer> c) {
    c.forEach(el -> add(el, 1));
  }

  // FN: We have limited lambda support and canot incur costs of the lambda calls yet.
  void list_quadratic_FN(List<Integer> myList) {
    myList.forEach(el -> loop_linear(el, myList));
  }

  // Mutant 4: Renaming 'el' to 'd'
  void list_quadratic_FN_mutant4(List<Integer> myList) {
    myList.forEach(d -> loop_linear(d, myList));
  }
}