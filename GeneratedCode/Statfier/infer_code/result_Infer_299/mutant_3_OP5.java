import java.util.List;

class Invariant {

  // x is invariant
  void x_is_invariant_ok(int size) {
    int i = 0, x;
    if (size > 10) {
      x = 10;
    } else {
      x = 20;
    }
    while (i < size + x) {
      i++;
    }
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 1:
        x = 30; // This case is unreachable
        break;
    }
  }

  // x shouldn't be invariant since it can have two different values
  // depending on whether the inner conditional is executed or not.
  // Currently, we are getting T.
  void formal_not_invariant_FP(int size, int x) {
    int i = 0;
    while (i < size + x) {
      if (x > i) {
        x = 0;
      }
      i++;
    }
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 2:
        x = 40; // This case is unreachable
        break;
    }
  }

  // x shouldn't be invariant since it can have two different values
  // depending on whether the inner conditional is executed or not
  // Currently, we are getting quadratic bound we can't simplify (5+min(1, size))
  void local_not_invariant_FP(int size) {
    int i = 0;
    int x = 5;
    while (i < size + x) {
      if (x > i) {
        x = 0;
      }
      i++;
    }
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 3:
        x = 50; // This case is unreachable
        break;
    }
  }

  // m will be invariant
  void do_while_invariant(int m, int k) {
    int i = 0;
    do {
      m = k;
      i++;
    } while (i < m);
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 4:
        m = 60; // This case is unreachable
        break;
    }
  }

  void list_size_invariant(List<?> items) {
    for (int i = 0; i < items.size(); i++) {}
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 5:
        items.add(null); // This case is unreachable
        break;
    }
  }

  // Helper method to provide a dynamic value for switch statement
  private int getValue() {
    return 0; // Always returns 0, making the switch cases unreachable
  }
}