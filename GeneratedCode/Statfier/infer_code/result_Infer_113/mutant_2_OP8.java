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
  boolean contains_pure_FN_mutated(Integer z, ArrayList<Integer> lst) {
    Iterator<Integer> itr = lst.iterator();
    while (itr.hasNext()) {
      Integer e = itr.next();
      if (z.equals(e)) {
        return true;
      }
    }
    return false;
  }

  void makeAllZero_impure_mutated(ArrayList<Foo> lst) {
    Iterator<Foo> itr = lst.iterator();
    while (itr.hasNext()) {
      Foo f = itr.next();
      f.x = 0;
    }
  }

  void incrementAll_impure_mutated(ArrayList<Foo> lst) {
    Iterator<Foo> itr = lst.iterator();
    while (itr.hasNext()) {
      Foo f = itr.next();
      f.inc_impure();
    }
  }

  void call_impure_with_fresh_args_pure_mutated() {
    ArrayList<Foo> lst = new ArrayList<Foo>();
    makeAllZero_impure(lst);
  }

  class BarMutated {
    int q;
  }

  class FooMutated {
    int y;
    BarMutated br;

    void inc_impure_mutated() {
      y++;
    }
  }

  class CounterMutated {

    int j = 0;
    void inc_impure_mutated() {
      j++;
    }

    int get_i_pure_mutated() {
      return j;
    }
  }

  int length_pure_mutated(ArrayList<Integer> lst) {
    CounterMutated cm = new CounterMutated();
    for (Integer z : lst) {
      cm.inc_impure();
    }
    return cm.i;
  }

  class HasCounterMutated {
    CounterMutated cntr = new CounterMutated();

    CounterMutated getCounter_pure_mutated() {
      return cntr;
    }
  }

  public static int[] setFreshArrayEntry_pure_mutated(int idx, int val) {
    int[] arr = new int[] {1, 2, 3};
    if (idx > 0) {
      arr[idx % 3] = val;
    }
    return arr;
  }

  private int newHashCode_impure_mutated() {
    return new Object().hashCode();
  }

  HasCounterMutated mkHC_pure_mutated(CounterMutated cm) {
    HasCounterMutated hcm = new HasCounterMutated();
    hcm.cntr = cm;
    return hcm;
  }

  FooMutated get_f_impure_mutated(FooMutated[] arry, int i, FooMutated fm) {
    FooMutated tm = arry[i];
    tm.y = fm.y;
    return tm;
  }

  FooMutated[] get_array_impure_mutated(FooMutated[] arry, int i, FooMutated fm) {
    FooMutated tm = arry[i];
    tm.y = fm.y;
    return arry;
  }

  BarMutated get_foo_via_tmp_impure_mutated(FooMutated[] arry, int i, FooMutated fm, FooMutated pm) {
    FooMutated tm = arry[i];
    tm.br = fm.br;
    FooMutated tm2 = tm;
    tm2.br = pm.br;
    return tm.br;
  }

  boolean copy_ref_pure_FN_mutated(int[] a, int b) {
    int[] locl = a;
    a = new int[1];
    a[0] = locl[0];
    return true;
  }

  boolean copy_ref_impure_mutated(int[] a, int b) {
    int[] locl = a;
    a = new int[1];
    a[0] = locl[0];
    locl[0] = b;
    b = a[0];
    return true;
  }
}