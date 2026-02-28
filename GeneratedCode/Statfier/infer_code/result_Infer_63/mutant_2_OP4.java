import java.util.ArrayList;

class HoistNoIndirectMod {

  int id = 0;

  public int increment() {
    id = calcNext();
    return id;
  }

  public int calcNext() {
    return (id + 1);
  }

  public int calcSame() {
    return id;
  }

  public int increment_dont_hoist_FP(int n) {
    for (int i = 0; i < n; i++) {
      id = calcNext(); // shouldn't be hoisted
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      id = -1;
    } else {
      // Another unreachable code
      id = -2;
    }
    return id;
  }

  public int modify_and_increment_dont_hoist_FP(int n) {
    int p = 0;
    for (int i = 0; i < n; i++) {
      p += calcNext();
      id = i;
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      p = -1;
    } else {
      // Another unreachable code
      p = -2;
    }
    return p;
  }

  // modifies list indirectly via aliasing
  public void set_first_to_zero(ArrayList<Integer> list) {
    ArrayList<Integer> l = list;
    if (l!= null) {
      l.set(0, 0);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      l.add(-1);
    } else {
      // Another unreachable code
      l.add(-2);
    }
  }

  public void call_set_first_to_zero(ArrayList<Integer> list) {
    set_first_to_zero(list);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      list.clear();
    } else {
      // Another unreachable code
      list.add(-3);
    }
  }

  public void alias_call_set_first_to_zero(ArrayList<Integer> list) {
    ArrayList<Integer> l = list;
    set_first_to_zero(l);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      l.remove(0);
    } else {
      // Another unreachable code
      l.add(-4);
    }
  }

  public void indirect_mod_dont_hoist(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      set_first_to_zero(list);
      call_set_first_to_zero(list);
      alias_call_set_first_to_zero(list);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      array[0] = -1;
    } else {
      // Another unreachable code
      array[0] = -2;
    }
  }

  int avg(ArrayList<Integer> list) {
    int sum = 0;
    for (Integer element : list) {
      sum += element;
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      sum = -1;
    } else {
      // Another unreachable code
      sum = -2;
    }
    return sum;
  }

  public void no_mod_hoist(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      avg(list);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      array[0] = -3;
    } else {
      // Another unreachable code
      array[0] = -4;
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the branches are unreachable
  }
}