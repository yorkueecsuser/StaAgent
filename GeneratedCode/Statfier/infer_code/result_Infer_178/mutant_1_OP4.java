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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in cheap_dont_hoist");
    }
  }

  // call to cheap_dont_hoist will be hoisted since it is expensive.
  void symbolic_expensive_hoist(int size) {
    for (int i = 0; i < size; i++) {
      cheap_dont_hoist(size);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in symbolic_expensive_hoist");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in symbolic_expensive_hoist");
    }
  }

  // call to cheap_dont_hoist will NOT be hoisted since it is cheap.
  void instantiated_cheap_dont_hoist(int size) {
    for (int i = 0; i < size; i++) {
      cheap_dont_hoist(1);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in instantiated_cheap_dont_hoist");
    }
  }

  // incr will not be hoisted since it is cheap
  void cheap_iterator_dont_hoist(ArrayList<Integer> list) {
    int x = 0;
    for (Integer elem : list) {
      incr(x);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in cheap_iterator_dont_hoist");
    }
  }

  // call to cheap_iterator_dont_hoist will be hoisted since it is expensive.
  void symbolic_expensive_iterator_hoist(int size, ArrayList<Integer> list) {
    for (int i = 0; i < size; i++) {
      cheap_iterator_dont_hoist(list);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in symbolic_expensive_iterator_hoist");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in symbolic_expensive_iterator_hoist");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getLeakSummary");
    }
    return leakedObjectSB.toString();
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}