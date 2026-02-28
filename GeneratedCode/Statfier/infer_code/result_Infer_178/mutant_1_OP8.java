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
    for (int i = 0; i < size; i++) {
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
    for (int i = 0; i < size; i++) {
      cheap_iterator_dont_hoist(list);
    }
  }

  private Map<String, Foo> mLeakObjectResults;

  class Foo {

    String className;
  }

  public String getLeakSummary() {

    StringBuilder leakedObjectSB = new StringBuilder();
    for (String key : mLeakObjectResults.keySet()) {
      leakedObjectSB
         .append(key)
         .append(",")
         .append(mLeakObjectResults.get(key).className)
         .append("\n");
    }
    return leakedObjectSB.toString();
  }

  // Mutated code
  void cheap_dont_hoist_mutated(int a) {
    int b = 10;
    for (int c = 0; c < a; c++) {
      incr(b);
    }
  }

  void symbolic_expensive_hoist_mutated(int d) {
    for (int e = 0; e < d; e++) {
      cheap_dont_hoist_mutated(d);
    }
  }

  void instantiated_cheap_dont_hoist_mutated(int f) {
    for (int g = 0; g < f; g++) {
      cheap_dont_hoist_mutated(1);
    }
  }

  void cheap_iterator_dont_hoist_mutated(ArrayList<Integer> h) {
    int j = 0;
    for (Integer k : h) {
      incr(j);
    }
  }

  void symbolic_expensive_iterator_hoist_mutated(int l, ArrayList<Integer> m) {
    for (int n = 0; n < l; n++) {
      cheap_iterator_dont_hoist_mutated(m);
    }
  }

  public String getLeakSummaryMutated() {
    StringBuilder o = new StringBuilder();
    for (String p : mLeakObjectResults.keySet()) {
      o
         .append(p)
         .append(",")
         .append(mLeakObjectResults.get(p).className)
         .append("\n");
    }
    return o.toString();
  }
}