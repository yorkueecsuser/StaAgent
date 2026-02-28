import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      a = -1; // This line is unreachable
    }
  }

  void set_impure(int x, int y) {
    a = x + y;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      a = -1; // This line is unreachable
    }
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      global_arr[0] = -1; // This line is unreachable
    }
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      k = -1; // This line is unreachable
    }
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      size = -1; // This line is unreachable
    }
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      d = -1; // This line is unreachable
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
    if (condition) { // Unreachable if statement
      list.add(-1); // This line is unreachable
    }
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      test.a = -1; // This line is unreachable
    }
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -1; // This line is unreachable
    }
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      y.a = -1; // This line is unreachable
    }
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      array[i] = -1; // This line is unreachable
    }
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      a[j] = -1; // This line is unreachable
    }
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FP() {
    return new ArrayList<Integer>();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return new ArrayList<Integer>(); // This line is unreachable
    }
  }

  // All unmodeled calls will be marked as modifying global state
  static long systemNanoTime_impure() {
    return System.nanoTime();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -1; // This line is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}