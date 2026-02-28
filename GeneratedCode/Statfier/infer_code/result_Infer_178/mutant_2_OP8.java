import java.util.ArrayList;
import java.util.Map;

class HoistExpensive {

  int incr(int x) {
    return x + 1;
  }

  // incr will not be hoisted since it is cheap
  void cheap_dont_hoist(int size) {
    int x = 10;
    for (int i = 0; i < size; i++) {
      incr(x);
    }
  }

  // call to cheap_dont_hoist will be hoisted since it is expensive.
  void symbolic_expensive_hoist(int size) {
    for (int i = 0; i < size; i++) {
      cheap_dont_hoist(size);
    }
  }

  // call to cheap_dont_hoist will NOT be hoisted since it is cheap.
  void instantiated_cheap_dont_hoist(int size) {
    for (int j = 0; j < size; j++) { // Renamed 'i' to 'j'
      cheap_dont_hoist(1);
    }
  }

  // incr will not be hoisted since it is cheap
  void cheap_iterator_dont_hoist(ArrayList<Integer> list) {
    int x = 0;
    for (Integer elem : list) {
      incr(x);
    }
  }

  // call to cheap_iterator_dont_hoist will be hoisted since it is expensive.
  void symbolic_expensive_iterator_hoist(int size, ArrayList<Integer> list) {
    for (int k = 0; k < size; k++) { // Renamed 'i' to 'k'
      cheap_iterator_dont_hoist(list);
    }
  }

  private Map<String, Foo> mLeakObjectResults;

  class Foo {

    String className;
  }

  public String getLeakSummary() {

    StringBuilder leakedObjectSB = new StringBuilder();
    for (String l : mLeakObjectResults.keySet()) { // Renamed 'key' to 'l'
      leakedObjectSB
         .append(l)
         .append(",")
         .append(mLeakObjectResults.get(l).className)
         .append("\n");
    }
    return leakedObjectSB.toString();
  }
}