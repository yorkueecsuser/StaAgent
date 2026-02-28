import java.util.ArrayList;
import java.util.Iterator;

class Localities {
  // @pure
  boolean contains_pure_FN(Integer i, ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    do {
      if (!listIterator.hasNext()) {
        break;
      }
      Integer el = listIterator.next();
      if (i.equals(el)) {
        return true;
      }
    } while (true);
    return false;
  }

  // @mod:{list}
  void makeAllZero_impure(ArrayList<Foo> list) {
    Iterator<Foo> listIterator = list.iterator();
    do {
      if (!listIterator.hasNext()) {
        break;
      }
      Foo foo = listIterator.next();
      foo.x = 0;
    } while (true);
  }

  // @mod:{list}
  void incrementAll_impure(ArrayList<Foo> list) {
    Iterator<Foo> listIterator = list.iterator();
    do {
      if (!listIterator.hasNext()) {
        break;
      }
      Foo foo = listIterator.next();
      foo.inc_impure();
    } while (true);
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
    Iterator<Integer> iterator = list.iterator();
    do {
      if (!iterator.hasNext()) {
        break;
      }
      Integer i = iterator.next();
      c.inc_impure();
    } while (true);
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
}