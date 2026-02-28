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
    switch(getValue()) {
      case 1:
        x = 30;
        break;
      default:
        x = 40;
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
    switch(getValue()) {
      case 1:
        x = 50;
        break;
      default:
        x = 60;
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
    switch(getValue()) {
      case 1:
        x = 70;
        break;
      default:
        x = 80;
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
    switch(getValue()) {
      case 1:
        m = 90;
        break;
      default:
        m = 100;
        break;
    }
  }

  void list_size_invariant(List<?> items) {
    for (int i = 0; i < items.size(); i++) {}
    // Introduced unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 1:
        items.add(null);
        break;
      default:
        items.clear();
        break;
    }
  }

  // Helper method to provide a dynamic value for switch statements
  private int getValue() {
    return 0;
  }
}