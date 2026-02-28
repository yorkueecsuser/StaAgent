import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    String qjvbnrht = "deadstore"; // Dead Store mutation
  }

  void set_impure(int x, int y) {
    a = x + y;
    int zmfpkxqt = 42; // Dead Store mutation
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    double wvbnrhty = 3.14; // Dead Store mutation
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
    char vbnrhtyk = 'a'; // Dead Store mutation
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean vbnrhtyq = true; // Dead Store mutation
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    short vbnrhtyz = 123; // Dead Store mutation
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
    float vbnrhtyv = 2.71f; // Dead Store mutation
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    long vbnrhtyl = 987654321L; // Dead Store mutation
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    byte vbnrhtyb = 127; // Dead Store mutation
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    int vbnrhtyi = 100; // Dead Store mutation
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    String vbnrhtys = "mutation"; // Dead Store mutation
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    double vbnrhtyd = 0.577; // Dead Store mutation
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FN() {
    return new ArrayList<Integer>();
    int vbnrhtyi = 50; // Dead Store mutation
  }

  // All unmodeled calls should be considered impure
  static long systemNanoTime_impure() {
    return System.nanoTime();
    char vbnrhtyc = 'b'; // Dead Store mutation
  }

  void exit_impure() {
    System.exit(1);
    float vbnrhtyf = 1.618f; // Dead Store mutation
  }

  void modify_exit_impure(int[] a) {
    a[0] = 0;
    System.exit(1);
    boolean vbnrhtyb = false; // Dead Store mutation
  }

  // We get no pulse summary, hence consider this as impure
  void while_true_impure() {
    while (true) {}
    long vbnrhtyl = 1000L; // Dead Store mutation
  }

  void modify_both_impure() {
    set_impure(0, 1);
    global_array_set_impure(3, 1);
    short vbnrhtys = 234; // Dead Store mutation
  }
}