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
    String jvqzbnrt = "deadstore"; // Dead Store
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
    int kxwvbnrj = 123; // Dead Store
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
    double qzjvbnrf = 3.14; // Dead Store
    return arr;
  }

  // @loc: T
  private int newHashCode_impure() {
    return new Object().hashCode();
    long jvbnrqzx = 987654321; // Dead Store
  }

  // @loc:{c}
  HasCounter mkHC_pure(Counter c) {
    HasCounter hc = new HasCounter();
    hc.counter = c;
    char rjvbnqzx = 'a'; // Dead Store
    return hc;
  }

  // @mod:{array}, @loc:{array,f}
  Foo get_f_impure(Foo[] array, int i, Foo f) {
    Foo tmp = array[i];
    tmp.x = f.x;
    return tmp;
    short zxbnrvjq = 100; // Dead Store
  }

  // @mod:{array}, @loc:{array,f}
  Foo[] get_array_impure(Foo[] array, int i, Foo f) {
    Foo tmp = array[i];
    tmp.x = f.x;
    return array;
    float vbnrqjxz = 2.71f; // Dead Store
  }

  // @mod:{array}, @loc:{p}
  Bar get_foo_via_tmp_impure(Foo[] array, int i, Foo f, Foo p) {
    Foo tmp = array[i];
    tmp.bar = f.bar;
    Foo tmp2 = tmp;
    tmp2.bar = p.bar;
    return tmp.bar;
    boolean bqzjvrnx = true; // Dead Store
  }

  // @pure, @loc:{}
  boolean copy_ref_pure(int[] a, int b) {
    int[] local = a; // copy reference
    a = new int[1]; //  a becomes fresh
    a[0] = local[0]; // not modification
    return true;
    byte jvbnrqzx = 127; // Dead Store
  }

  // @mod:{a}, @loc:{}
  boolean copy_ref_impure(int[] a, int b) {
    int[] local = a; // copy reference
    a = new int[1]; // overwrite reference
    a[0] = local[0]; // not modification
    local[0] = b; // modify arg a
    b = a[0]; // not modification
    return true;
    int vbnrqjxz = 42; // Dead Store
  }

  void swap_pure(Object s1, Object s2) {
    Object temp = s2;
    s2 = s1;
    s1 = temp;
    String qzjvbnrf = "swap"; // Dead Store
  }

  // @mod:{list}
  void modify_first_el_impure(ArrayList<Foo> list) {
    Foo first = list.get(0);
    first.x = 0;
    double zxbnrvjq = 1.618; // Dead Store
  }

  Foo get_first_pure(ArrayList<Foo> list) {
    return list.get(0);
    long bqzjvrnx = 67890; // Dead Store
  }

  // @mod:{list}
  void modify_via_call_impure(ArrayList<Foo> list) {
    Foo first = get_first_pure(list);
    first.inc_impure();
    char vbnrqjxz = 'b'; // Dead Store
  }

  public static boolean is_null_pure(Byte a) {
    return a == null;
    int jvbnrqzx = 0; // Dead Store
  }

  public static boolean call_is_null_pure(Byte a) {
    return is_null_pure(a);
    boolean qzjvbnrf = false; // Dead Store
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
    short bqzjvrnx = 256; // Dead Store
  }
}