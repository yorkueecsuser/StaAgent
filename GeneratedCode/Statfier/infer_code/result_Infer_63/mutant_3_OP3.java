import java.util.ArrayList;

class HoistNoIndirectMod {

  int id = 0;

  public int increment() {
    id = calcNext();
    return id;
  }

  public int calcNext() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      id = -1; // This will never be executed
    }
    return (id + 1);
  }

  public int calcSame() {
    return id;
  }

  public int increment_dont_hoist_FP(int n) {
    for (int i = 0; i < n; i++) {
      id = calcNext(); // shouldn't be hoisted
    }
    return id;
  }

  public int modify_and_increment_dont_hoist_FP(int n) {
    int p = 0;
    for (int i = 0; i < n; i++) {
      p += calcNext();
      id = i;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      p = 0; // This will never be executed
    }
    return p;
  }

  // modifies list indirectly via aliasing
  public void set_first_to_zero(ArrayList<Integer> list) {
    ArrayList<Integer> l = list;
    if (l!= null) {
      l.set(0, 0);
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      l.add(1); // This will never be executed
    }
  }

  public void call_set_first_to_zero(ArrayList<Integer> list) {
    set_first_to_zero(list);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      list.clear(); // This will never be executed
    }
  }

  public void alias_call_set_first_to_zero(ArrayList<Integer> list) {
    ArrayList<Integer> l = list;
    set_first_to_zero(l);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      l.add(2); // This will never be executed
    }
  }

  public void indirect_mod_dont_hoist(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      set_first_to_zero(list);
      call_set_first_to_zero(list);
      alias_call_set_first_to_zero(list);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        element = 0; // This will never be executed
      }
    }
  }

  int avg(ArrayList<Integer> list) {
    int sum = 0;
    for (Integer element : list) {
      sum += element;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      sum = 0; // This will never be executed
    }
    return sum;
  }

  public void no_mod_hoist(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      avg(list);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        element = 1; // This will never be executed
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}