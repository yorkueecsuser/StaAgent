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
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        x = 30; // This line is unreachable
      }
      i++;
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
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        x = 40; // This line is unreachable
      }
      i++;
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
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        x = 50; // This line is unreachable
      }
      i++;
    }
  }

  // m will be invariant
  void do_while_invariant(int m, int k) {
    int i = 0;
    do {
      m = k;
      i++;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        m = 60; // This line is unreachable
      }
    } while (i < m);
  }

  void list_size_invariant(List<?> items) {
    for (int i = 0; i < items.size(); i++) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        i = 70; // This line is unreachable
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}