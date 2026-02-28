import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      a = -1;
    } else {
      // Another unreachable code
      a = -2;
    }
  }

  void set_impure(int x, int y) {
    a = x + y;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      a = -3;
    } else {
      // Another unreachable code
      a = -4;
    }
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      global_arr[0] = -5;
    } else {
      // Another unreachable code
      global_arr[0] = -6;
    }
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      k = -7;
    } else {
      // Another unreachable code
      k = -8;
    }
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      size = -9;
    } else {
      // Another unreachable code
      size = -10;
    }
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      d = -11;
    } else {
      // Another unreachable code
      d = -12;
    }
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      list.add(-13);
    } else {
      // Another unreachable code
      list.add(-14);
    }
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      test.a = -15;
    } else {
      // Another unreachable code
      test.a = -16;
    }
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      return -17;
    } else {
      // Another unreachable code
      return -18;
    }
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      y.a = -19;
    } else {
      // Another unreachable code
      y.a = -20;
    }
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      array[i] = -21;
    } else {
      // Another unreachable code
      array[j] = -22;
    }
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      a[i] = -23;
    } else {
      // Another unreachable code
      a[j] = -24;
    }
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FP() {
    return new ArrayList<Integer>();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      return new ArrayList<Integer>(-25);
    } else {
      // Another unreachable code
      return new ArrayList<Integer>(-26);
    }
  }

  // All unmodeled calls will be marked as modifying global state
  static long systemNanoTime_impure() {
    return System.nanoTime();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      return -27L;
    } else {
      // Another unreachable code
      return -28L;
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the branches are unreachable
  }
}