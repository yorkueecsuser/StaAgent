import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  void set_impure(int x, int y) {
    a = x + y;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FP() {
    return new ArrayList<Integer>();
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  // All unmodeled calls will be marked as modifying global state
  static long systemNanoTime_impure() {
    return System.nanoTime();
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the loops unreachable
  }
}