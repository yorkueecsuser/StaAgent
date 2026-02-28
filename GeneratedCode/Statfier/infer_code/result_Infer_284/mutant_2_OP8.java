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
    for (int i = 0; i < size; i++) {
      foo(x, foo(y, x + y));
    }
  }

  // will report both
  void two_function_call_hoist(int size) {
    int x = 10;
    int y = 5;
    for (int i = 0; i < size; i++) {
      foo(x, bar(y));
    }
  }

  // it is ok to move fun call to a temp. var
  void reassigned_temp_hoist(int size) {
    int x = 10;
    int y = 5;
    int d = 0;
    for (int i = 0; i < size; i++) {
      d = foo(x, y);
      d = 30;
    }
  }

  // it is ok to just hoist function call into a temp var.
  void used_in_loop_body_before_def_temp_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 20;
    for (int i = 0; i < size; i++) {
      M[i] = d;
      d = foo(x, y);
    }
  }

  void loop_guard_hoist(int size, int[] M) {
    int x = 10;
    int d = 0;
    int y = 5;
    for (int i = 0; i < foo(d, size); i++) {}
  }

  void legit_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 0;
    for (int i = 0; i < size; i++) {
      d = foo(x, x + y);
      M[i] = d;
    }
  }

  // x is not invariant, hence d won't be invariant as well
  void dep_not_invariant_dont_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 20;
    for (int i = 0; i < size; i++) {
      if (i > 3) {
        x = 3;
      }
      d = foo(x, y); // shouldn't be hoisted
    }
  }

  // foo(x) is not guaranteed to execute
  void not_guaranteed_to_execute_dont_hoist(int size, int x, int y) {
    int i = 0;

    while (i < size) {
      if (i > 3) {
        foo(x, y);
      }
      i++;
    }
  }

  void x_not_invariant_dont_hoist(int size, int x, int y) {
    int i = 0;

    while (i < size) {
      x = foo(x, y) + y;
      i++;
    }
  }

  void array_store_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 0;
    for (int i = 0; i < size; i++) {
      M[i] = foo(x, x + y);
    }
  }

  // y =... can be taken out of the inner loop
  void nested_loop_hoist(int size, int x, int y) {
    int i = 0;

    while (i < size) {
      for (int j = 0; i < j; j++) {
        y = foo(i, x);
      }
      i++;
    }
  }

  // j is not invariant, y can't be taken out
  void nested_loop_dont_hoist(int size, int x, int y) {
    int i = 0;

    while (i < size) {
      for (int j = 0; j < i; j++) {
        y = foo(j, x);
      }
      i++;
    }
  }

  void new_dont_hoist(ArrayList list) {

    for (int i = 0; i < 10; i++) {
      list = new ArrayList();
    }
  }

  // Tests for built-in declarations

  void get_array_length_dont_hoist(int[] array) {
    int k = 0;
    for (int i = 0; i < 10; i++) {
      k = k + array.length;
    }
  }

  interface Nothing {}

  class Foo {}

  class EmptyFoo extends Foo implements Nothing {}

  boolean instanceof_dont_hoist(EmptyFoo empty) {
    boolean k = false;
    ;
    for (int i = 0; i < 10; i++) {
      k = empty instanceof Nothing;
    }
    return k;
  }

  void dumb_foo() {
    int k = 0;
    k++;
  }

  void void_hoist(int size) {
    for (int i = 0; i < size; i++) {
      dumb_foo();
    }
  }

  // Mutated code with renaming
  void clash_function_calls_hoist_m(int a) {
    int b = 10;
    int c = 5;
    for (int i = 0; i < a; i++) {
      foo(b, foo(c, b + c));
    }
  }

  void two_function_call_hoist_m(int a) {
    int b = 10;
    int c = 5;
    for (int i = 0; i < a; i++) {
      foo(b, bar(c));
    }
  }

  void reassigned_temp_hoist_m(int a) {
    int b = 10;
    int c = 5;
    int e = 0;
    for (int i = 0; i < a; i++) {
      e = foo(b, c);
      e = 30;
    }
  }

  void used_in_loop_body_before_def_temp_hoist_m(int a, int[] N) {
    int b = 10;
    int c = 5;
    int e = 20;
    for (int i = 0; i < a; i++) {
      N[i] = e;
      e = foo(b, c);
    }
  }

  void loop_guard_hoist_m(int a, int[] N) {
    int b = 10;
    int e = 0;
    int c = 5;
    for (int i = 0; i < foo(e, a); i++) {}
  }

  void legit_hoist_m(int a, int[] N) {
    int b = 10;
    int c = 5;
    int e = 0;
    for (int i = 0; i < a; i++) {
      e = foo(b, b + c);
      N[i] = e;
    }
  }

  void dep_not_invariant_dont_hoist_m(int a, int[] N) {
    int b = 10;
    int c = 5;
    int e = 20;
    for (int i = 0; i < a; i++) {
      if (i > 3) {
        b = 3;
      }
      e = foo(b, c); // shouldn't be hoisted
    }
  }

  void not_guaranteed_to_execute_dont_hoist_m(int a, int b, int c) {
    int i = 0;

    while (i < a) {
      if (i > 3) {
        foo(b, c);
      }
      i++;
    }
  }

  void x_not_invariant_dont_hoist_m(int a, int b, int c) {
    int i = 0;

    while (i < a) {
      b = foo(b, c) + c;
      i++;
    }
  }

  void array_store_hoist_m(int a, int[] N) {
    int b = 10;
    int c = 5;
    int e = 0;
    for (int i = 0; i < a; i++) {
      N[i] = foo(b, b + c);
    }
  }

  void nested_loop_hoist_m(int a, int b, int c) {
    int i = 0;

    while (i < a) {
      for (int j = 0; i < j; j++) {
        c = foo(i, b);
      }
      i++;
    }
  }

  void nested_loop_dont_hoist_m(int a, int b, int c) {
    int i = 0;

    while (i < a) {
      for (int j = 0; j < i; j++) {
        c = foo(j, b);
      }
      i++;
    }
  }

  void new_dont_hoist_m(ArrayList l) {

    for (int i = 0; i < 10; i++) {
      l = new ArrayList();
    }
  }

  void get_array_length_dont_hoist_m(int[] array) {
    int k = 0;
    for (int i = 0; i < 10; i++) {
      k = k + array.length;
    }
  }

  boolean instanceof_dont_hoist_m(EmptyFoo e) {
    boolean k = false;
    for (int i = 0; i < 10; i++) {
      k = e instanceof Nothing;
    }
    return k;
  }

  void dumb_foo_m() {
    int k = 0;
    k++;
  }

  void void_hoist_m(int a) {
    for (int i = 0; i < a; i++) {
      dumb_foo_m();
    }
  }
}