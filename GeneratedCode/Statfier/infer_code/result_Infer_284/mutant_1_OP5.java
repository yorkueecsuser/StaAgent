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
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  // will report both
  void two_function_call_hoist(int size) {
    int x = 10;
    int y = 5;
    for (int i = 0; i < size; i++) {
      foo(x, bar(y));
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
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
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
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
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  void loop_guard_hoist(int size, int[] M) {
    int x = 10;
    int d = 0;
    int y = 5;
    for (int i = 0; i < foo(d, size); i++) {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  void legit_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 0;
    for (int i = 0; i < size; i++) {
      d = foo(x, x + y);
      M[i] = d;
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
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
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
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
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  void x_not_invariant_dont_hoist(int size, int x, int y) {
    int i = 0;

    while (i < size) {
      x = foo(x, y) + y;
      i++;
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  void array_store_hoist(int size, int[] M) {
    int x = 10;
    int y = 5;
    int d = 0;
    for (int i = 0; i < size; i++) {
      M[i] = foo(x, x + y);
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  // y =... can be taken out of the inner loop
  void nested_loop_hoist(int size, int x, int y) {
    int i = 0;

    while (i < size) {
      for (int j = 0; i < j; j++) {
        y = foo(i, x);
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // unreachable code
            System.out.println("This is unreachable");
            break;
        }
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
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // unreachable code
            System.out.println("This is unreachable");
            break;
        }
      }
      i++;
    }
  }

  void new_dont_hoist(ArrayList list) {

    for (int i = 0; i < 10; i++) {
      list = new ArrayList();
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  // Tests for built-in declarations

  void get_array_length_dont_hoist(int[] array) {
    int k = 0;
    for (int i = 0; i < 10; i++) {
      k = k + array.length;
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  interface Nothing {}

  class Foo {}

  class EmptyFoo extends Foo implements Nothing {}

  boolean instanceof_dont_hoist(EmptyFoo empty) {
    boolean k = false;
    for (int i = 0; i < 10; i++) {
      k = empty instanceof Nothing;
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
    return k;
  }

  void dumb_foo() {
    int k = 0;
    k++;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  void void_hoist(int size) {
    for (int i = 0; i < size; i++) {
      dumb_foo();
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // unreachable code
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}