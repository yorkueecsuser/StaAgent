import java.util.ArrayList;

class Hoist {

  int foo(int x, int y) {
    return x + y;
  }

  int bar(int x) {
    return 3 * x;
  }

  // will only report one even though both calls are invariant, due to
  // location clashing (no column information)
  void clash_function_calls_hoist(int size) {
    int x = 10;
    int y = 5;
    int i = 0;
    do {
      foo(x, foo(y, x + y));
      i++;
    } while (i < size);
  }

  // will report both
  void two_function_call_hoist(int size) {
    int x = 10;
    int y = 5;
    int i = 0;
    do {
      foo(x, bar(y));
      i++;
    } while (i < size);
  }

  // it is ok to move fun call to a temp. var
  void reassigned_temp_hoist(int size) {
    int x = 10;
    int y = 5;
    int d = 0;
    int i = 0;
    do {
      d = foo(x, y);
      d = 30;
      i++;
    } while (i < size);
  }

  // it is ok to just hoist function call into a temp var.
  void used_in_loop_body_before_def_temp_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 20;
    int i = 0;
    do {
      M[i] = d;
      d = foo(x, y);
      i++;
    } while (i < size);
  }

  void loop_guard_hoist(int size, int[] M) {
    int x = 10;
    int d = 0;
    int y = 5;
    int i = 0;
    do {
    } while (i < foo(d, size));
  }

  void legit_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 0;
    int i = 0;
    do {
      d = foo(x, x + y);
      M[i] = d;
      i++;
    } while (i < size);
  }

  // x is not invariant, hence d won't be invariant as well
  void dep_not_invariant_dont_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 20;
    int i = 0;
    do {
      if (i > 3) {
        x = 3;
      }
      d = foo(x, y); // shouldn't be hoisted
      i++;
    } while (i < size);
  }

  // foo(x) is not guaranteed to execute
  void not_guaranteed_to_execute_dont_hoist(int size, int x, int y) {
    int i = 0;

    do {
      if (i > 3) {
        foo(x, y);
      }
      i++;
    } while (i < size);
  }

  void x_not_invariant_dont_hoist(int size, int x, int y) {
    int i = 0;

    do {
      x = foo(x, y) + y;
      i++;
    } while (i < size);
  }

  void array_store_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 0;
    int i = 0;
    do {
      M[i] = foo(x, x + y);
      i++;
    } while (i < size);
  }

  // y =... can be taken out of the inner loop
  void nested_loop_hoist(int size, int x, int y) {
    int i = 0;

    do {
      int j = 0;
      do {
        y = foo(i, x);
        j++;
      } while (i < j);
      i++;
    } while (i < size);
  }

  // j is not invariant, y can't be taken out
  void nested_loop_dont_hoist(int size, int x, int y) {
    int i = 0;

    do {
      int j = 0;
      do {
        y = foo(j, x);
        j++;
      } while (j < i);
      i++;
    } while (i < size);
  }

  void new_dont_hoist(ArrayList list) {
    int i = 0;
    do {
      list = new ArrayList();
      i++;
    } while (i < 10);
  }

  // Tests for built-in declarations

  void get_array_length_dont_hoist(int[] array) {
    int k = 0;
    int i = 0;
    do {
      k = k + array.length;
      i++;
    } while (i < 10);
  }

  interface Nothing {}

  class Foo {}

  class EmptyFoo extends Foo implements Nothing {}

  boolean instanceof_dont_hoist(EmptyFoo empty) {
    boolean k = false;
    int i = 0;
    do {
      k = empty instanceof Nothing;
      i++;
    } while (i < 10);
    return k;
  }

  void dumb_foo() {
    int k = 0;
    k++;
  }

  void void_hoist(int size) {
    int i = 0;
    do {
      dumb_foo();
      i++;
    } while (i < size);
  }
}