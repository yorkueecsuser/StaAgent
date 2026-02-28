import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void set_impure(int x, int y) {
    a = x + y;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
    return k;
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
    return list.size();
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FN() {
    return new ArrayList<Integer>();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  // All unmodeled calls should be considered impure
  static long systemNanoTime_impure() {
    return System.nanoTime();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void exit_impure() {
    System.exit(1);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void modify_exit_impure(int[] a) {
    a[0] = 0;
    System.exit(1);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  // We get no pulse summary, hence consider this as impure
  void while_true_impure() {
    while (true) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  void modify_both_impure() {
    set_impure(0, 1);
    global_array_set_impure(3, 1);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}