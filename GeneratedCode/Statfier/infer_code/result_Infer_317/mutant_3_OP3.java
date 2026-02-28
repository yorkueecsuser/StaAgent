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
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
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
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // @mod:{list}
  void incrementAll_impure(ArrayList<Foo> list) {
    Iterator<Foo> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      Foo foo = listIterator.next();
      foo.inc_impure();
    }
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // @pure
  void call_impure_with_fresh_args_pure() {
    ArrayList<Foo> list = new ArrayList<Foo>();
    makeAllZero_impure(list);
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
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
      // Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
    }
  }

  class Counter {

    int i = 0;
    // @mod:{this}
    // only modifies fields of its receiver object
    void inc_impure() {
      i++;
      // Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
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
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
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
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return arr;
  }

  // @loc: T
  private int newHashCode_impure() {
    return new Object().hashCode();
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // @loc:{c}
  HasCounter mkHC_pure(Counter c) {
    HasCounter hc = new HasCounter();
    hc.counter = c;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return hc;
  }

  // @mod:{array}, @loc:{array,f}
  Foo get_f_impure(Foo[] array, int i, Foo f) {
    Foo tmp = array[i];
    tmp.x = f.x;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return tmp;
  }

  // @mod:{array}, @loc:{array,f}
  Foo[] get_array_impure(Foo[] array, int i, Foo f) {
    Foo tmp = array[i];
    tmp.x = f.x;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return array;
  }

  // @mod:{array}, @loc:{p}
  Bar get_foo_via_tmp_impure(Foo[] array, int i, Foo f, Foo p) {
    Foo tmp = array[i];
    tmp.bar = f.bar;
    Foo tmp2 = tmp;
    tmp2.bar = p.bar;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return tmp.bar;
  }

  // @pure, @loc:{}
  boolean copy_ref_pure(int[] a, int b) {
    int[] local = a; // copy reference
    a = new int[1]; //  a becomes fresh
    a[0] = local[0]; // not modification
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return true;
  }

  // @mod:{a}, @loc:{}
  boolean copy_ref_impure(int[] a, int b) {
    int[] local = a; // copy reference
    a = new int[1]; // overwrite reference
    a[0] = local[0]; // not modification
    local[0] = b; // modify arg a
    b = a[0]; // not modification
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return true;
  }

  void swap_pure(Object s1, Object s2) {
    Object temp = s2;
    s2 = s1;
    s1 = temp;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // @mod:{list}
  void modify_first_el_impure(ArrayList<Foo> list) {
    Foo first = list.get(0);
    first.x = 0;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  Foo get_first_pure(ArrayList<Foo> list) {
    return list.get(0);
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // @mod:{list}
  void modify_via_call_impure(ArrayList<Foo> list) {
    Foo first = get_first_pure(list);
    first.inc_impure();
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  public static boolean is_null_pure(Byte a) {
    return a == null;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  public static boolean call_is_null_pure(Byte a) {
    return is_null_pure(a);
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
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
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamic condition for unreachable if statements
  private boolean getCondition() {
    return false;
  }
}