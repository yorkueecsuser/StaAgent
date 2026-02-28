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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // call to cheap_dont_hoist will be hoisted since it is expensive.
  void symbolic_expensive_hoist(int size) {
    for (int i = 0; i < size; i++) {
      cheap_dont_hoist(size);
    }
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // call to cheap_dont_hoist will NOT be hoisted since it is cheap.
  void instantiated_cheap_dont_hoist(int size) {
    for (int i = 0; i < size; i++) {
      cheap_dont_hoist(1);
    }
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // incr will not be hoisted since it is cheap
  void cheap_iterator_dont_hoist(ArrayList<Integer> list) {
    int x = 0;
    for (Integer elem : list) {
      incr(x);
    }
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // call to cheap_iterator_dont_hoist will be hoisted since it is expensive.
  void symbolic_expensive_iterator_hoist(int size, ArrayList<Integer> list) {
    for (int i = 0; i < size; i++) {
      cheap_iterator_dont_hoist(list);
    }
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // Method to provide dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is theoretically unreachable
  }
}