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

  // Mutated Code
  // @pure
  boolean contains_pure_mutated(Integer z, ArrayList<Integer> lst) {
    Iterator<Integer> lstIterator = lst.iterator();
    while (lstIterator.hasNext()) {
      Integer elm = lstIterator.next();
      if (z.equals(elm)) {
        return true;
      }
    }
    return false;
  }

  // @mod:{list}
  void makeAllZero_impure_mutated(ArrayList<Foo> lst) {
    Iterator<Foo> lstIterator = lst.iterator();
    while (lstIterator.hasNext()) {
      Foo foo = lstIterator.next();
      foo.x = 0;
    }
  }

  // @mod:{list}
  void incrementAll_impure_mutated(ArrayList<Foo> lst) {
    Iterator<Foo> lstIterator = lst.iterator();
    while (lstIterator.hasNext()) {
      Foo foo = lstIterator.next();
      foo.inc_impure();
    }
  }

  // @pure
  void call_impure_with_fresh_args_pure_mutated() {
    ArrayList<Foo> lst = new ArrayList<Foo>();
    makeAllZero_impure(lst);
  }

  class Bar_mutated {
    int q;
  }

  class Foo_mutated {
    int y;
    Bar_mutated bar_mutated;

    // @mod:{this}
    void inc_impure_mutated() {
      y++;
    }
  }

  class Counter_mutated {

    int j = 0;
    // @mod:{this}
    // only modifies fields of its receiver object
    void inc_impure_mutated() {
      j++;
    }

    // @pure, @loc:{}
    int get_i_pure_mutated() {
      return j;
    }
  }

  // @pure, @loc:{}
  int length_pure_mutated(ArrayList<Integer> lst) {
    Counter_mutated c_mutated = new Counter_mutated();
    for (Integer z : lst) {
      c_mutated.inc_impure();
    }
    return c_mutated.j;
  }

  class HasCounter_mutated {
    Counter_mutated counter_mutated = new Counter_mutated();

    // @loc:{this}
    Counter_mutated getCounter_pure_mutated() {
      return counter_mutated;
    }
  }

  // @loc:{}
  public static int[] setFreshArrayEntry_pure_mutated(int idx, int val) {
    int[] arr_mutated = new int[] {1, 2, 3};
    if (idx > 0) {
      arr_mutated[idx % 3] = val;
    }
    return arr_mutated;
  }

  // @loc: T
  private int newHashCode_impure_mutated() {
    return new Object().hashCode();
  }

  // @loc:{c}
  HasCounter_mutated mkHC_pure_mutated(Counter_mutated c_mutated) {
    HasCounter_mutated hc_mutated = new HasCounter_mutated();
    hc_mutated.counter_mutated = c_mutated;
    return hc_mutated;
  }

  // @mod:{array}, @loc:{array,f}
  Foo_mutated get_f_impure_mutated(Foo_mutated[] array_mutated, int i_mutated, Foo_mutated f_mutated) {
    Foo_mutated tmp_mutated = array_mutated[i_mutated];
    tmp_mutated.y = f_mutated.y;
    return tmp_mutated;
  }

  // @mod:{array}, @loc:{array,f}
  Foo_mutated[] get_array_impure_mutated(Foo_mutated[] array_mutated, int i_mutated, Foo_mutated f_mutated) {
    Foo_mutated tmp_mutated = array_mutated[i_mutated];
    tmp_mutated.y = f_mutated.y;
    return array_mutated;
  }

  // @mod:{array}, @loc:{p}
  Bar_mutated get_foo_via_tmp_impure_mutated(Foo_mutated[] array_mutated, int i_mutated, Foo_mutated f_mutated, Foo_mutated p_mutated) {
    Foo_mutated tmp_mutated = array_mutated[i_mutated];
    tmp_mutated.bar_mutated = f_mutated.bar_mutated;
    Foo_mutated tmp2_mutated = tmp_mutated;
    tmp2_mutated.bar_mutated = p_mutated.bar_mutated;
    return tmp_mutated.bar_mutated;
  }

  // @pure, @loc:{}
  boolean copy_ref_pure_mutated(int[] a_mutated, int b_mutated) {
    int[] local_mutated = a_mutated; // copy reference
    a_mutated = new int[1]; //  a becomes fresh
    a_mutated[0] = local_mutated[0]; // not modification
    return true;
  }

  // @mod:{a}, @loc:{}
  boolean copy_ref_impure_mutated(int[] a_mutated, int b_mutated) {
    int[] local_mutated = a_mutated; // copy reference
    a_mutated = new int[1]; // overwrite reference
    a_mutated[0] = local_mutated[0]; // not modification
    local_mutated[0] = b_mutated; // modify arg a
    b_mutated = a_mutated[0]; // not modification
    return true;
  }

  void swap_pure_mutated(Object s1_mutated, Object s2_mutated) {
    Object temp_mutated = s2_mutated;
    s2_mutated = s1_mutated;
    s1_mutated = temp_mutated;
  }

  // @mod:{list}
  void modify_first_el_impure_mutated(ArrayList<Foo> lst) {
    Foo first_mutated = lst.get(0);
    first_mutated.x = 0;
  }

  Foo_mutated get_first_pure_mutated(ArrayList<Foo> lst) {
    return lst.get(0);
  }

  // @mod:{list}
  void modify_via_call_impure_mutated(ArrayList<Foo> lst) {
    Foo first_mutated = get_first_pure(lst);
    first_mutated.inc_impure();
  }

  public static boolean is_null_pure_mutated(Byte a_mutated) {
    return a_mutated == null;
  }

  public static boolean call_is_null_pure_mutated(Byte a_mutated) {
    return is_null_pure(a_mutated);
  }

  private static final int MAX_SIZE_MUTATED = 2;

  private static final int[][][] pool_mutated = new int[3][2][];

  static int[] get_impure_mutated(int size_mutated) {
    if (size_mutated > MAX_SIZE_MUTATED) {
      return new int[size_mutated];
    }
    int[][] arrays_mutated = pool_mutated[size_mutated];
    if (arrays_mutated[1]!= null) {
      int[] a_mutated = arrays_mutated[1];
      arrays_mutated[1] = null;
      return a_mutated;
    } else {
      return new int[size_mutated];
    }
  }
}