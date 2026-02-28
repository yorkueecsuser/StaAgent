import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    String qzjfnrht = "unused"; // Dead Store
  }

  void set_impure(int x, int y) {
    a = x + y;
    int wvmbkxqp = 42; // Dead Store
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    double jxqfntkr = 3.14; // Dead Store
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
    char tnvbldxz = 'a'; // Dead Store
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean zyqjfnrt = true; // Dead Store
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    float xqjfnrty = 2.718f; // Dead Store
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
    long vbnmldxz = 123456789L; // Dead Store
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    short pqjfnrty = 10; // Dead Store
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    byte mnvbxldz = 8; // Dead Store
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    int qzjfnrht = 100; // Dead Store
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    String pqjfnrty = "another unused"; // Dead Store
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    int wvmbkxqp = 55; // Dead Store
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FP() {
    return new ArrayList<Integer>();
    double jxqfntkr = 1.618; // Dead Store
  }

  // All unmodeled calls will be marked as modifying global state
  static long systemNanoTime_impure() {
    return System.nanoTime();
    int zyqjfnrt = 20; // Dead Store
  }
}