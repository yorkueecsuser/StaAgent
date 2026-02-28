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

  // Mutant code starts here

  // @pure
  boolean contains_pure_FN_mutated(Integer z, ArrayList<Integer> lst) {
    Iterator<Integer> iterator = lst.iterator();
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      if (z.equals(element)) {
        return true;
      }
    }
    return false;
  }

  // @mod:{lst}
  void makeAllZero_impure_mutated(ArrayList<Foo> lst) {
    Iterator<Foo> iterator = lst.iterator();
    while (iterator.hasNext()) {
      Foo foo = iterator.next();
      foo.x = 0;
    }
  }

  // @mod:{lst}
  void incrementAll_impure_mutated(ArrayList<Foo> lst) {
    Iterator<Foo> iterator = lst.iterator();
    while (iterator.hasNext()) {
      Foo foo = iterator.next();
      foo.inc_impure();
    }
  }

  // @pure
  void call_impure_with_fresh_args_pure_mutated() {
    ArrayList<Foo> lst = new ArrayList<Foo>();
    makeAllZero_impure(lst);
  }

  class BarMutated {
    int q;
  }

  class FooMutated {
    int y;
    BarMutated barMutated;

    // @mod:{this}
    void inc_impure_mutated() {
      y++;
    }
  }

  class CounterMutated {

    int j = 0;
    // @mod:{this}
    // only modifies fields of its receiver object
    void inc_impure_mutated() {
      j++;
    }

    // @pure, @loc:{}
    int get_j_pure() {
      return j;
    }
  }

  // @pure, @loc:{}
  int length_pure_mutated(ArrayList<Integer> lst) {
    CounterMutated cmt = new CounterMutated();
    for (Integer z : lst) {
      cmt.inc_impure_mutated();
    }
    return cmt.j;
  }

  class HasCounterMutated {
    CounterMutated counterMutated = new CounterMutated();

    // @loc:{this}
    CounterMutated getCounter_pure_mutated() {
      return counterMutated;
    }
  }

  // @loc:{}
  public static int[] setFreshArrayEntry_pure_mutated(int idx, int val) {
    int[] arrMutated = new int[] {1, 2, 3};
    if (idx > 0) {
      arrMutated[idx % 3] = val;
    }
    return arrMutated;
  }

  // @loc: T
  private int newHashCode_impure_mutated() {
    return new Object().hashCode();
  }

  // @loc:{cmt}
  HasCounterMutated mkHC_pure_mutated(CounterMutated cmt) {
    HasCounterMutated hcm = new HasCounterMutated();
    hcm.counterMutated = cmt;
    return hcm;
  }

  // @mod:{arrMutated}, @loc:{arrMutated,fm}
  FooMutated get_f_impure_mutated(FooMutated[] arrMutated, int i, FooMutated fm) {
    FooMutated tmpMutated = arrMutated[i];
    tmpMutated.y = fm.y;
    return tmpMutated;
  }

  // @mod:{arrMutated}, @loc:{arrMutated,fm}
  FooMutated[] get_array_impure_mutated(FooMutated[] arrMutated, int i, FooMutated fm) {
    FooMutated tmpMutated = arrMutated[i];
    tmpMutated.y = fm.y;
    return arrMutated;
  }

  // @mod:{arrMutated}, @loc:{pm}
  BarMutated get_foo_via_tmp_impure_mutated(FooMutated[] arrMutated, int i, FooMutated fm, FooMutated pm) {
    FooMutated tmpMutated = arrMutated[i];
    tmpMutated.barMutated = fm.barMutated;
    FooMutated tmp2Mutated = tmpMutated;
    tmp2Mutated.barMutated = pm.barMutated;
    return tmpMutated.barMutated;
  }

  // @pure, @loc:{}
  boolean copy_ref_pure_FN_mutated(int[] aMutated, int bMutated) {
    int[] localMutated = aMutated; // copy reference
    aMutated = new int[1]; //  can't detect that a becomes fresh
    aMutated[0] = localMutated[0]; // not modification
    return true;
  }

  // @mod:{aMutated}, @loc:{}
  boolean copy_ref_impure_mutated(int[] aMutated, int bMutated) {
    int[] localMutated = aMutated; // copy reference
    aMutated = new int[1]; // overwrite reference
    aMutated[0] = localMutated[0]; // not modification
    localMutated[0] = bMutated; // modify arg a
    bMutated = aMutated[0]; // not modification
    return true;
  }
}