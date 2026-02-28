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
    return id;
  }

  public int modify_and_increment_dont_hoist_FP(int n) {
    int p = 0;
    for (int i = 0; i < n; i++) {
      p += calcNext();
      id = i;
    }
    return p;
  }

  // modifies list indirectly via aliasing
  public void set_first_to_zero(ArrayList<Integer> list) {
    ArrayList<Integer> l = list;
    if (l!= null) {
      l.set(0, 0);
    }
  }

  public void call_set_first_to_zero(ArrayList<Integer> list) {
    set_first_to_zero(list);
  }

  public void alias_call_set_first_to_zero(ArrayList<Integer> list) {
    ArrayList<Integer> l = list;
    set_first_to_zero(l);
  }

  public void indirect_mod_dont_hoist(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      set_first_to_zero(list);
      call_set_first_to_zero(list);
      alias_call_set_first_to_zero(list);
    }
  }

  int avg(ArrayList<Integer> list) {
    int sum = 0;
    for (Integer element : list) {
      sum += element;
    }
    return sum;
  }

  public void no_mod_hoist(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      avg(list);
    }
  }

  // Mutated code starts here

  int q = 0;

  public int increment_mutated() {
    q = calcNext();
    return q;
  }

  public int calcNext_mutated() {
    return (q + 1);
  }

  public int calcSame_mutated() {
    return q;
  }

  public int increment_dont_hoist_FP_mutated(int m) {
    for (int j = 0; j < m; j++) {
      q = calcNext(); // shouldn't be hoisted
    }
    return q;
  }

  public int modify_and_increment_dont_hoist_FP_mutated(int m) {
    int r = 0;
    for (int j = 0; j < m; j++) {
      r += calcNext();
      q = j;
    }
    return r;
  }

  // modifies list indirectly via aliasing
  public void set_first_to_zero_mutated(ArrayList<Integer> list) {
    ArrayList<Integer> k = list;
    if (k!= null) {
      k.set(0, 0);
    }
  }

  public void call_set_first_to_zero_mutated(ArrayList<Integer> list) {
    set_first_to_zero_mutated(list);
  }

  public void alias_call_set_first_to_zero_mutated(ArrayList<Integer> list) {
    ArrayList<Integer> k = list;
    set_first_to_zero_mutated(k);
  }

  public void indirect_mod_dont_hoist_mutated(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      set_first_to_zero_mutated(list);
      call_set_first_to_zero_mutated(list);
      alias_call_set_first_to_zero_mutated(list);
    }
  }

  int avg_mutated(ArrayList<Integer> list) {
    int t = 0;
    for (Integer element : list) {
      t += element;
    }
    return t;
  }

  public void no_mod_hoist_mutated(Integer[] array, ArrayList<Integer> list) {
    for (Integer element : array) {
      avg_mutated(list);
    }
  }
}