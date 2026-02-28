import java.util.ArrayList;
import java.util.Map;

class HoistExpensive {

  int incr(int x) {
    return x + 1;
  }

  // incr will not be hoisted since it is cheap
  void cheap_dont_hoist(int size) {
    int x = 10;
    int i = 0;
    do {
      incr(x);
      i++;
    } while (i < size);
  }

  // call to cheap_dont_hoist will be hoisted since it is expensive.
  void symbolic_expensive_hoist(int size) {
    int i = 0;
    do {
      cheap_dont_hoist(size);
      i++;
    } while (i < size);
  }

  // call to cheap_dont_hoist will NOT be hoisted since it is cheap.
  void instantiated_cheap_dont_hoist(int size) {
    int i = 0;
    do {
      cheap_dont_hoist(1);
      i++;
    } while (i < size);
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
    int i = 0;
    do {
      cheap_iterator_dont_hoist(list);
      i++;
    } while (i < size);
  }

  private Map<String, Foo> mLeakObjectResults;

  class Foo {

    String className;
  }

  public String getLeakSummary() {

    StringBuilder leakedObjectSB = new StringBuilder();
    var iterator = mLeakObjectResults.keySet().iterator();
    do {
      String key = iterator.next();
      leakedObjectSB
         .append(key)
         .append(",")
         .append(mLeakObjectResults.get(key).className)
         .append("\n");
    } while (iterator.hasNext());
    return leakedObjectSB.toString();
  }
}