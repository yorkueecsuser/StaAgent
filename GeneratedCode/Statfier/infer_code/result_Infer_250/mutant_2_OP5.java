import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void set_impure(int x, int y) {
    a = x + y;
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
    return k;
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
    return list.size();
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // unreachable code
        break;
    }
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FP() {
    return new ArrayList<Integer>();
  }

  // All unmodeled calls will be marked as modifying global state
  static long systemNanoTime_impure() {
    return System.nanoTime();
  }

  private boolean getCondition() {
    return false; // This method ensures the switch is unreachable but avoids compile-time constant issues
  }
}