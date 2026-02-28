import java.util.ArrayList;
import java.util.Iterator;

class Localities {
  // @pure
  boolean contains_pure_FN(Integer i, ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      Integer el = listIterator.next();
      if (i.equals(el)) {
        return true;
      }
    }
    return false;
  }

  // @mod:{list}
  void makeAllZero_impure(ArrayList<Foo> list) {
    Iterator<Foo> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      Foo foo = listIterator.next();
      foo.x = 0;
    }
  }

  // @mod:{list}
  void incrementAll_impure(ArrayList<Foo> list) {
    Iterator<Foo> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      Foo foo = listIterator.next();
      foo.inc_impure();
    }
  }

  // @pure
  void call_impure_with_fresh_args_pure() {
    ArrayList<Foo> list = new ArrayList<Foo>();
    makeAllZero_impure(list);
  }

  class Bar {
    int p;
  }

  class Foo {
    int x;
    Bar bar;

    // @mod:{this}
    void inc_impure() {
      x++;
    }
  }

  class Counter {

    int i = 0;
    // @mod:{this}
    // only modifies fields of its receiver object
    void inc_impure() {
      i++;
    }

    // @pure, @loc:{}
    int get_i_pure() {
      return i;
    }
  }

  // @pure, @loc:{}
  int length_pure(ArrayList<Integer> list) {
    Counter c = new Counter();
    for (Integer i : list) {
      c.inc_impure();
    }
    return c.i;
  }

  class HasCounter {
    Counter counter = new Counter();

    // @loc:{this}
    Counter getCounter_pure() {
      return counter;
    }
  }

  // @loc:{}
  public static int[] setFreshArrayEntry_pure(int index, int value) {
    int[] arr = new int[] {1, 2, 3};
    if (index > 0) {
      arr[index % 3] = value;
    }
    return arr;
  }

  // @loc: T
  private int newHashCode_impure() {
    return new Object().hashCode();
  }

  // @loc:{c}
  HasCounter mkHC_pure(Counter c) {
    HasCounter hc = new HasCounter();
    hc.counter = c;
    return hc;
  }

  // @mod:{array}, @loc:{array,f}
  Foo get_f_impure(Foo[] array, int i, Foo f) {
    Foo tmp = array[i];
    tmp.x = f.x;
    return tmp;
  }

  // @mod:{array}, @loc:{array,f}
  Foo[] get_array_impure(Foo[] array, int i, Foo f) {
    Foo tmp = array[i];
    tmp.x = f.x;
    return array;
  }

  // @mod:{array}, @loc:{p}
  Bar get_foo_via_tmp_impure(Foo[] array, int i, Foo f, Foo p) {
    Foo tmp = array[i];
    tmp.bar = f.bar;
    Foo tmp2 = tmp;
    tmp2.bar = p.bar;
    return tmp.bar;
  }

  // @pure, @loc:{}
  boolean copy_ref_pure_FN(int[] a, int b) {
    int[] local = a; // copy reference
    a = new int[1]; //  can't detect that a becomes fresh
    a[0] = local[0]; // not modification
    return true;
  }

  // @mod:{a}, @loc:{}
  boolean copy_ref_impure(int[] a, int b) {
    int[] local = a; // copy reference
    a = new int[1]; // overwrite reference
    a[0] = local[0]; // not modification
    local[0] = b; // modify arg a
    b = a[0]; // not modification
    return true;
  }

  // Mutated code
  // @pure
  boolean contains_pure_FN_m(Integer j, ArrayList<Integer> lst) {
    Iterator<Integer> lstIterator = lst.iterator();
    while (lstIterator.hasNext()) {
      Integer e = lstIterator.next();
      if (j.equals(e)) {
        return true;
      }
    }
    return false;
  }

  // @mod:{lst}
  void makeAllZero_impure_m(ArrayList<Foo> lst) {
    Iterator<Foo> lstIterator = lst.iterator();
    while (lstIterator.hasNext()) {
      Foo fo = lstIterator.next();
      fo.x = 0;
    }
  }

  // @mod:{lst}
  void incrementAll_impure_m(ArrayList<Foo> lst) {
    Iterator<Foo> lstIterator = lst.iterator();
    while (lstIterator.hasNext()) {
      Foo fo = lstIterator.next();
      fo.inc_impure();
    }
  }

  // @pure
  void call_impure_with_fresh_args_pure_m() {
    ArrayList<Foo> lst = new ArrayList<Foo>();
    makeAllZero_impure(lst);
  }

  class Bar_m {
    int q;
  }

  class Foo_m {
    int y;
    Bar_m bar_m;

    // @mod:{this}
    void inc_impure_m() {
      y++;
    }
  }

  class Counter_m {

    int k = 0;
    // @mod:{this}
    // only modifies fields of its receiver object
    void inc_impure_m() {
      k++;
    }

    // @pure, @loc:{}
    int get_k_pure() {
      return k;
    }
  }

  // @pure, @loc:{}
  int length_pure_m(ArrayList<Integer> lst) {
    Counter_m cm = new Counter_m();
    for (Integer j : lst) {
      cm.inc_impure();
    }
    return cm.k;
  }

  class HasCounter_m {
    Counter_m counter_m = new Counter_m();

    // @loc:{this}
    Counter_m getCounter_pure_m() {
      return counter_m;
    }
  }

  // @loc:{}
  public static int[] setFreshArrayEntry_pure_m(int idx, int val) {
    int[] arr_m = new int[] {1, 2, 3};
    if (idx > 0) {
      arr_m[idx % 3] = val;
    }
    return arr_m;
  }

  // @loc: T
  private int newHashCode_impure_m() {
    return new Object().hashCode();
  }

  // @loc:{cm}
  HasCounter_m mkHC_pure_m(Counter_m cm) {
    HasCounter_m hcm = new HasCounter_m();
    hcm.counter_m = cm;
    return hcm;
  }

  // @mod:{array}, @loc:{array,fm}
  Foo_m get_f_impure_m(Foo_m[] array_m, int i, Foo_m fm) {
    Foo_m tmp_m = array_m[i];
    tmp_m.y = fm.y;
    return tmp_m;
  }

  // @mod:{array}, @loc:{array,fm}
  Foo_m[] get_array_impure_m(Foo_m[] array_m, int i, Foo_m fm) {
    Foo_m tmp_m = array_m[i];
    tmp_m.y = fm.y;
    return array_m;
  }

  // @mod:{array}, @loc:{pm}
  Bar_m get_foo_via_tmp_impure_m(Foo_m[] array_m, int i, Foo_m fm, Foo_m pm) {
    Foo_m tmp_m = array_m[i];
    tmp_m.bar_m = fm.bar_m;
    Foo_m tmp2_m = tmp_m;
    tmp2_m.bar_m = pm.bar_m;
    return tmp_m.bar_m;
  }

  // @pure, @loc:{}
  boolean copy_ref_pure_FN_m(int[] a_m, int b_m) {
    int[] local_m = a_m; // copy reference
    a_m = new int[1]; //  can't detect that a becomes fresh
    a_m[0] = local_m[0]; // not modification
    return true;
  }

  // @mod:{a_m}, @loc:{}
  boolean copy_ref_impure_m(int[] a_m, int b_m) {
    int[] local_m = a_m; // copy reference
    a_m = new int[1]; // overwrite reference
    a_m[0] = local_m[0]; // not modification
    local_m[0] = b_m; // modify arg a
    b_m = a_m[0]; // not modification
    return true;
  }
}