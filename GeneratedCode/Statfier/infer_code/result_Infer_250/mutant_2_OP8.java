import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
  }

  void set_impure(int x, int y) {
    a = x + y;
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
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

  // Mutated code
  void set_impure(int z, int w) {
    a = z + w;
  }

  void global_array_set_impure(int z, int w) {
    global_arr[0] = z + w;
  }

  int local_write_pure(int z, int w) {
    int m = z + w;
    m++;
    return m;
  }

  void call_pure_pure(int t) {
    for (int n = 0; n < t; n++) {
      local_write_pure(n, t);
    }
  }

  void call_impure_impure(int t) {
    int e = 0;
    for (int n = 0; n < t; n++) {
      set_impure(n, t);
    }
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int z, int w) {
    ArrayList<Integer> list = new ArrayList<Integer>(z + w);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
  }

  void parameter_field_write_impure(Test test, boolean q) {
    int f = q? 0 : 1;
    test.a = f;
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test v) {
    Test y = v;
    y.a = 0;
  }

  void swap_impure(int[] array, int p, int r) {
    int g = array[p];
    array[p] = array[r];
    array[r] = g;
  }

  void alias_impure(int[] array, int p, r) {
    int[] h = array;
    h[r] = p;
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
}