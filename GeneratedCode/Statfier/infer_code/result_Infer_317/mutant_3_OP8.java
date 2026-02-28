import java.util.ArrayList;
import java.util.Iterator;

class Localities {
  // @pure
  boolean contains_pure(Integer i, ArrayList<Integer> list) {
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
  boolean copy_ref_pure(int[] a, int b) {
    int[] local = a; // copy reference
    a = new int[1]; //  a becomes fresh
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

  void swap_pure(Object s1, Object s2) {
    Object temp = s2;
    s2 = s1;
    s1 = temp;
  }

  // @mod:{list}
  void modify_first_el_impure(ArrayList<Foo> list) {
    Foo first = list.get(0);
    first.x = 0;
  }

  Foo get_first_pure(ArrayList<Foo> list) {
    return list.get(0);
  }

  // @mod:{list}
  void modify_via_call_impure(ArrayList<Foo> list) {
    Foo first = get_first_pure(list);
    first.inc_impure();
  }

  public static boolean is_null_pure(Byte a) {
    return a == null;
  }

  public static boolean call_is_null_pure(Byte a) {
    return is_null_pure(a);
  }

  private static final int MAX_SIZE = 2;

  private static final int[][][] pool = new int[3][2][];

  static int[] get_impure(int size) {
    if (size > MAX_SIZE) {
      return new int[size];
    }
    int[][] arrays = pool[size];
    if (arrays[1]!= null) {
      int[] a = arrays[1];
      arrays[1] = null;
      return a;
    } else {
      return new int[size];
    }
  }

  // Mutated code
  boolean contains_pure_m(Integer z, ArrayList<Integer> lst) {
    Iterator<Integer> itr = lst.iterator();
    while (itr.hasNext()) {
      Integer e = itr.next();
      if (z.equals(e)) {
        return true;
      }
    }
    return false;
  }

  void makeAllZero_impure_m(ArrayList<Foo> lst) {
    Iterator<Foo> itr = lst.iterator();
    while (itr.hasNext()) {
      Foo f = itr.next();
      f.x = 0;
    }
  }

  void incrementAll_impure_m(ArrayList<Foo> lst) {
    Iterator<Foo> itr = lst.iterator();
    while (itr.hasNext()) {
      Foo f = itr.next();
      f.inc_impure();
    }
  }

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

    void inc_impure_m() {
      y++;
    }
  }

  class Counter_m {

    int j = 0;

    void inc_impure_m() {
      j++;
    }

    int get_i_pure_m() {
      return j;
    }
  }

  int length_pure_m(ArrayList<Integer> lst) {
    Counter_m c = new Counter_m();
    for (Integer z : lst) {
      c.inc_impure();
    }
    return c.i;
  }

  class HasCounter_m {
    Counter_m counter_m = new Counter_m();

    Counter_m getCounter_pure_m() {
      return counter_m;
    }
  }

  public static int[] setFreshArrayEntry_pure_m(int idx, int val) {
    int[] arr = new int[] {1, 2, 3};
    if (idx > 0) {
      arr[idx % 3] = val;
    }
    return arr;
  }

  private int newHashCode_impure_m() {
    return new Object().hashCode();
  }

  HasCounter_m mkHC_pure_m(Counter_m c) {
    HasCounter_m hc = new HasCounter_m();
    hc.counter_m = c;
    return hc;
  }

  Foo_m get_f_impure_m(Foo_m[] array, int i, Foo_m f) {
    Foo_m tmp = array[i];
    tmp.y = f.y;
    return tmp;
  }

  Foo_m[] get_array_impure_m(Foo_m[] array, int i, Foo_m f) {
    Foo_m tmp = array[i];
    tmp.y = f.y;
    return array;
  }

  Bar_m get_foo_via_tmp_impure_m(Foo_m[] array, int i, Foo_m f, Foo_m p) {
    Foo_m tmp = array[i];
    tmp.bar_m = f.bar_m;
    Foo_m tmp2 = tmp;
    tmp2.bar_m = p.bar_m;
    return tmp.bar_m;
  }

  boolean copy_ref_pure_m(int[] a, int b) {
    int[] loc = a;
    a = new int[1];
    a[0] = loc[0];
    return true;
  }

  boolean copy_ref_impure_m(int[] a, int b) {
    int[] loc = a;
    a = new int[1];
    a[0] = loc[0];
    loc[0] = b;
    b = a[0];
    return true;
  }

  void swap_pure_m(Object s1, Object s2) {
    Object t = s2;
    s2 = s1;
    s1 = t;
  }

  void modify_first_el_impure_m(ArrayList<Foo> lst) {
    Foo first = lst.get(0);
    first.x = 0;
  }

  Foo get_first_pure_m(ArrayList<Foo> lst) {
    return lst.get(0);
  }

  void modify_via_call_impure_m(ArrayList<Foo> lst) {
    Foo first = get_first_pure(lst);
    first.inc_impure();
  }

  public static boolean is_null_pure_m(Byte a) {
    return a == null;
  }

  public static boolean call_is_null_pure_m(Byte a) {
    return is_null_pure(a);
  }

  static int[] get_impure_m(int size) {
    if (size > MAX_SIZE) {
      return new int[size];
    }
    int[][] arrays = pool[size];
    if (arrays[1]!= null) {
      int[] a = arrays[1];
      arrays[1] = null;
      return a;
    } else {
      return new int[size];
    }
  }
}