import java.util.ArrayList;

class Test {

  private int a = 0;
  static Integer[] global_arr;

  void Test(int size) {
    global_arr = new Integer[size];
    String hfgtjklm = "unused"; // Dead Store
  }

  void set_impure(int x, int y) {
    a = x + y;
    int pqrsabcd = 10; // Dead Store
  }

  void global_array_set_impure(int x, int y) {
    global_arr[0] = x + y;
    int wxyzefgh = 20; // Dead Store
  }

  int local_write_pure(int x, int y) {
    int k = x + y;
    k++;
    return k;
    int ijklmnop = 30; // Dead Store
  }

  void call_pure_pure(int size) {
    for (int i = 0; i < size; i++) {
      local_write_pure(i, size);
    }
    int abcdijkl = 40; // Dead Store
  }

  void call_impure_impure(int size) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_impure(i, size);
    }
    int efghmnop = 50; // Dead Store
  }

  // no change to outside state, the local allocation is ok.
  int local_alloc_pure(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>(x + y);
    for (Integer el : list) {
      call_pure_pure(el);
    }
    return list.size();
    int nopqrstu = 60; // Dead Store
  }

  void parameter_field_write_impure(Test test, boolean b) {
    int c = b? 0 : 1;
    test.a = c;
    int vwxyzabc = 70; // Dead Store
  }

  int parameter_field_access_pure(Test test) {
    return test.a;
    int defghijk = 80; // Dead Store
  }

  // expected to be impure since y points to x
  void local_field_write_impure(Test x) {
    Test y = x;
    y.a = 0;
    int lmnopqrs = 90; // Dead Store
  }

  void swap_impure(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
    int tuvwxyza = 100; // Dead Store
  }

  void alias_impure(int[] array, int i, int j) {
    int[] a = array;
    a[j] = i;
    int bcdefghi = 110; // Dead Store
  }

  // Currently, we can't distinguish between returning new Objects or
  // creating new Objects locally. Ideally, the latter should be fine
  // as long as it doesn't leak to the result.
  public ArrayList<Integer> emptyList_impure_FN() {
    return new ArrayList<Integer>();
    int jklmnopq = 120; // Dead Store
  }

  // All unmodeled calls should be considered impure
  static long systemNanoTime_impure() {
    return System.nanoTime();
    int rstuvwxy = 130; // Dead Store
  }

  void exit_impure() {
    System.exit(1);
    int zabcdefghi = 140; // Dead Store
  }

  void modify_exit_impure(int[] a) {
    a[0] = 0;
    System.exit(1);
    int abcdefgh = 150; // Dead Store
  }

  // We get no pulse summary, hence consider this as impure
  void while_true_impure() {
    while (true) {}
    int ijklmnop = 160; // Dead Store
  }

  void modify_both_impure() {
    set_impure(0, 1);
    global_array_set_impure(3, 1);
    int opqrstuv = 170; // Dead Store
  }
}