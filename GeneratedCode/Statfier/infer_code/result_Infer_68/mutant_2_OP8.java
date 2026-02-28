class HoistIndirect {

  public static int svar = 0;
  public int x = 0;
  int[] array;

  class Test {

    int a = 0;
    int[] test_array;

    int foo(int x) {
      return x + 10;
    }

    void set_test(Test test) {
      test.a = 5;
    }

    int get_test(Test test) {
      return test.a;
    }

    int get_sum_test(Test test, int x) {
      return test.a + x;
    }

    Test return_only(Test t) {
      return t;
    }

    int indirect_modification_dont_hoist(int size, Test t) {
      int d = 0;
      for (int i = 0; i < size; i++) {
        set_test(t);
        d = get_test(t); // don't hoist since t changes
      }
      return d;
    }

    void variant_arg_dont_hoist(int size, Test t) {
      for (int i = 0; i < size; i++) {
        set_test(t); // t is invalidated
        get_sum_test(return_only(t), size); // return_only's argument is variant, hence don't hoist
      }
    }

    // t changes deep in the call stack
    int deep_modification_dont_hoist(int size) {
      int d = 0;
      Test t = new Test();

      for (int i = 0; i < size; i++) {
        indirect_modification_dont_hoist(size, t);
      }
      return d;
    }

    // foo(3) is ok to hoist
    int indirect_modification_hoist(int size) {
      int d = 0;
      Test t = new Test();
      for (int i = 0; i < size; i++) {
        set_test(t); // t is invalidated here
        d = foo(3); // foo is still invariant so it is ok to hoist
      }
      return d;
    }

    void set_only_first_param(Test test, Test no_mod) {
      test.a = 5;
    }

    int indirect_modification_only_second_call_hoist(int size, Test t, Test no_mod_t) {
      int d = 0;
      for (int i = 0; i < size; i++) {
        set_only_first_param(t, no_mod_t);
        d = get_test(t); // don't hoist since t changes
        d = get_test(no_mod_t); // hoist since no_mod_t doesn't change
      }
      return d;
    }
  }

  void set() {
    svar = 5;
  }

  int get() {
    return svar;
  }

  //
  int indirect_this_modification_dont_hoist(int size) {
    int d = 0;

    for (int i = 0; i < size; i++) {
      d = get(); // don't hoist since HoistIndirect.svar changes in the loop
      set();
    }
    return d;
  }

  int direct_this_modification_dont_hoist_FP(int size) {
    int d = 0;

    for (int i = 0; i < size; i++) {
      d += get(); // don't hoist since this.svar changes in the loop
      svar = i;
    }
    return d;
  }

  int this_modification_outside_hoist(int size) {
    int d = 0;
    set();
    for (int i = 0; i < size; i++) {
      d += get(); // ok to hoist since set is outside
    }
    return d;
  }

  int arg_modification_hoist(int size, Test t) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      d += get(); // ok to hoist since set_test doesn't modify this
      t.set_test(t);
    }
    return d;
  }

  void set_ith(int i, int[] array) {
    array[i] = 0;
  }

  int get_ith(int i, int[] array) {
    return array[i];
  }

  int modified_array_dont_hoist(int size, Test t) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_ith(i, array);
      d += get_ith(size, array); // don't hoist since array changes
    }
    return d;
  }

  int independent_hoist(int size, Test t) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_ith(i, array);
      t.foo(size); // hoist call to foo
      d += get_ith(size, array); // don't hoist since array changes
    }
    return d;
  }

  int modified_inner_array_dont_hoist(int size, Test t) {
    int d = 0;
    for (int i = 0; i < size; i++) {
      set_ith(i, t.test_array);
      d += t.foo(t.test_array[0]); // don't hoist since t.test_array changes
    }
    return d;
  }

  static int regionFirst(int[] region) {
    return region[0];
  }

  static void incrDest(int[] source, int[] dest) {
    dest[0] = source[0] + 1;
  }

  static void sumDest(int[] source, int[] dest, int x) {
    dest[0] = source[0] + x;
  }

  void irvar_change_dont_hoist(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i < regionFirst(nextRegionM[p])) {
        incrDest(tempRegion, nextRegionM[p]); // invalidate nextRegionM
      }
    }
  }

  void tmp_irvar_change_dont_hoist(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i < regionFirst(nextRegionM[p])) {
        int[] arr = nextRegionM[p];
        incrDest(tempRegion, arr); // invalidate nextRegionM
      }
    }
  }

  int double_me(int p) {
    return 2 * p;
  }

  void irvar_independent_hoist(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i < regionFirst(nextRegionM[p]) + double_me(p)) { // double_me(p) can be hoisted
        sumDest(tempRegion, nextRegionM[p], i); // invalidate nextRegionM
      }
    }
  }

  void unmodified_arg_hoist(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i
          < regionFirst(nextRegionM[p])
              + regionFirst(tempRegion)) { // regionFirst(tempRegion) can be hoisted
        sumDest(tempRegion, nextRegionM[p], i); // invalidate nextRegionM
      }
    }
  }

  // arr is modified via aliasing
  void alias(int[] arr) {

    int[] new_arr = arr;
    new_arr[0] = 4;
  }

  void alias_dont_hoist(int[] arr) {
    for (int i = 0; i < 10; i++) {
      alias(arr); // alias modifies arr
      get_ith(0, arr); // don't hoist
    }
  }

  int return_zero() {
    return 0;
  }

  void set_x() {
    x = 0;
  }

  // Since we don't keep track of what values are read in purity
  // analysis, when we call set_x, we add implicit arg. "this" to
  // modified arguments which prevents any other call in the loop to
  // be hoisted
  int indirect_this_modification_hoist_FN(int size) {
    int d = 0;

    for (int i = 0; i < size; i++) {
      d = return_zero(); // OK to hoist
      set_x();
    }
    return d;
  }

  // Mutated code
  int b = 0;
  int y = 0;
  int[] arry;

  class Tst {

    int c = 0;
    int[] tst_array;

    int bar(int y) {
      return y + 10;
    }

    void set_tst(Tst tst) {
      tst.c = 5;
    }

    int get_tst(Tst tst) {
      return tst.c;
    }

    int get_sum_tst(Tst tst, int y) {
      return tst.c + y;
    }

    Tst return_only_tst(Tst t) {
      return t;
    }

    int indirect_modification_dont_hoist_tst(int size, Tst t) {
      int e = 0;
      for (int i = 0; i < size; i++) {
        set_tst(t);
        e = get_tst(t); // don't hoist since t changes
      }
      return e;
    }

    void variant_arg_dont_hoist_tst(int size, Tst t) {
      for (int i = 0; i < size; i++) {
        set_tst(t); // t is invalidated
        get_sum_tst(return_only_tst(t), size); // return_only's argument is variant, hence don't hoist
      }
    }

    // t changes deep in the call stack
    int deep_modification_dont_hoist_tst(int size) {
      int e = 0;
      Tst t = new Tst();

      for (int i = 0; i < size; i++) {
        indirect_modification_dont_hoist_tst(size, t);
      }
      return e;
    }

    // bar(3) is ok to hoist
    int indirect_modification_hoist_tst(int size) {
      int e = 0;
      Tst t = new Tst();
      for (int i = 0; i < size; i++) {
        set_tst(t); // t is invalidated here
        e = bar(3); // bar is still invariant so it is ok to hoist
      }
      return e;
    }

    void set_only_first_param_tst(Tst test, Tst no_mod) {
      test.c = 5;
    }

    int indirect_modification_only_second_call_hoist_tst(int size, Tst t, Tst no_mod_t) {
      int e = 0;
      for (int i = 0; i < size; i++) {
        set_only_first_param_tst(t, no_mod_t);
        e = get_tst(t); // don't hoist since t changes
        e = get_tst(no_mod_t); // hoist since no_mod_t doesn't change
      }
      return e;
    }
  }

  void stt() {
    b = 5;
  }

  int gt() {
    return b;
  }

  //
  int indirect_this_modification_dont_hoist_tst(int size) {
    int e = 0;

    for (int i = 0; i < size; i++) {
      e = gt(); // don't hoist since HoistIndirect.b changes in the loop
      stt();
    }
    return e;
  }

  int direct_this_modification_dont_hoist_FP_tst(int size) {
    int e = 0;

    for (int i = 0; i < size; i++) {
      e += gt(); // don't hoist since this.b changes in the loop
      b = i;
    }
    return e;
  }

  int this_modification_outside_hoist_tst(int size) {
    int e = 0;
    stt();
    for (int i = 0; i < size; i++) {
      e += gt(); // ok to hoist since stt is outside
    }
    return e;
  }

  int arg_modification_hoist_tst(int size, Tst t) {
    int e = 0;
    for (int i = 0; i < size; i++) {
      e += gt(); // ok to hoist since set_tst doesn't modify this
      t.set_tst(t);
    }
    return e;
  }

  void set_ith_tst(int i, int[] arry) {
    arry[i] = 0;
  }

  int get_ith_tst(int i, int[] arry) {
    return arry[i];
  }

  int modified_array_dont_hoist_tst(int size, Tst t) {
    int e = 0;
    for (int i = 0; i < size; i++) {
      set_ith_tst(i, arry);
      e += get_ith_tst(size, arry); // don't hoist since arry changes
    }
    return e;
  }

  int independent_hoist_tst(int size, Tst t) {
    int e = 0;
    for (int i = 0; i < size; i++) {
      set_ith_tst(i, arry);
      t.bar(size); // hoist call to bar
      e += get_ith_tst(size, arry); // don't hoist since arry changes
    }
    return e;
  }

  int modified_inner_array_dont_hoist_tst(int size, Tst t) {
    int e = 0;
    for (int i = 0; i < size; i++) {
      set_ith_tst(i, t.tst_array);
      e += t.bar(t.tst_array[0]); // don't hoist since t.tst_array changes
    }
    return e;
  }

  static int regionFirst_tst(int[] region) {
    return region[0];
  }

  static void incrDest_tst(int[] source, int[] dest) {
    dest[0] = source[0] + 1;
  }

  static void sumDest_tst(int[] source, int[] dest, int y) {
    dest[0] = source[0] + y;
  }

  void irvar_change_dont_hoist_tst(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i < regionFirst_tst(nextRegionM[p])) {
        incrDest_tst(tempRegion, nextRegionM[p]); // invalidate nextRegionM
      }
    }
  }

  void tmp_irvar_change_dont_hoist_tst(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i < regionFirst_tst(nextRegionM[p])) {
        int[] arr = nextRegionM[p];
        incrDest_tst(tempRegion, arr); // invalidate nextRegionM
      }
    }
  }

  int double_me_tst(int p) {
    return 2 * p;
  }

  void irvar_independent_hoist_tst(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i < regionFirst_tst(nextRegionM[p]) + double_me_tst(p)) { // double_me(p) can be hoisted
        sumDest_tst(tempRegion, nextRegionM[p], i); // invalidate nextRegionM
      }
    }
  }

  void unmodified_arg_hoist_tst(int[][] nextRegionM, int p, int[] tempRegion) {
    for (int i = 0; i < 10; i++) {
      if (i
          < regionFirst_tst(nextRegionM[p])
              + regionFirst_tst(tempRegion)) { // regionFirst(tempRegion) can be hoisted
        sumDest_tst(tempRegion, nextRegionM[p], i); // invalidate nextRegionM
      }
    }
  }

  // arry is modified via aliasing
  void alias_tst(int[] arry) {

    int[] new_arry = arry;
    new_arry[0] = 4;
  }

  void alias_dont_hoist_tst(int[] arry) {
    for (int i = 0; i < 10; i++) {
      alias_tst(arry); // alias modifies arry
      get_ith_tst(0, arry); // don't hoist
    }
  }

  int return_zero_tst() {
    return 0;
  }

  void set_y() {
    y = 0;
  }

  // Since we don't keep track of what values are read in purity
  // analysis, when we call set_y, we add implicit arg. "this" to
  // modified arguments which prevents any other call in the loop to
  // be hoisted
  int indirect_this_modification_hoist_FN_tst(int size) {
    int e = 0;

    for (int i = 0; i < size; i++) {
      e = return_zero_tst(); // OK to hoist
      set_y();
    }
    return e;
  }
}