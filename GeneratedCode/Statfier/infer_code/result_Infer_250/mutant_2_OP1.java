import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    String abcdefgh = "abcdefgh"; // Dead store
  }

  void set_impure(int x, int y) {
    a = x + y;
    int hijklmno = 12345678; // Dead store
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    double pqrsutvw = 3.14159265; // Dead store
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
    char xyzabcde = 'a'; // Dead store
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    boolean fghijklm = true; // Dead store
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    float nopqrstu = 0.0f; // Dead store
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
    long vwxyzabc = 987654321L; // Dead store
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    short defghijk = 100; // Dead store
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    int lmnopqrs = 42; // Dead store
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    byte tuvwxyza = 1; // Dead store
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    int bcdefghi = 255; // Dead store
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    int jklmnopq = 67890; // Dead store
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FP() {
    return new ArrayList<Integer>();
    int rstuvxyz = 87654321; // Dead store
  }

  // All unmodeled calls will be marked as modifying global state
  static long systemNanoTime_impure() {
    return System.nanoTime();
    int abcdexyz = 11223344; // Dead store
  }
}