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

  int local_write_pure_mutant(int z, w) { // Mutant: renamed x to z, y to w
    int m = z + w;
    m++;
    return m;
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

  int local_alloc_pure_mutant(int v, int u) { // Mutant: renamed x to v, y to u
    ArrayList<Integer> lst = new ArrayList<Integer>(v + u);
    for (Integer elem : lst) {
      call_pure_pure(elem);
    }
    return lst.size();
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
  }

  void parameter_field_write_impure_mutant(Test tst, boolean f) { // Mutant: renamed test to tst, b to f
    int g = f? 0 : 1;
    tst.a = g;
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
  }

  int parameter_field_access_pure_mutant(Test tst) { // Mutant: renamed test to tst
    return tst.a;
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
  }

  void local_field_write_impure_mutant(Test p) { // Mutant: renamed x to p
    Test q = p;
    q.a = 0;
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  void swap_impure_mutant(int[] arr, int n, int m) { // Mutant: renamed array to arr, i to n, j to m
    int tm = arr[n];
    arr[n] = arr[m];
    arr[m] = tm;
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
  }

  void alias_impure_mutant(int[] arr, int n, int m) { // Mutant: renamed array to arr, i to n, j to m
    int[] b = arr;
    b[m] = n;
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