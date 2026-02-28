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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = 30; // This line is unreachable
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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = 40; // This line is unreachable
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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = 50; // This line is unreachable
    }
  }

  // m will be invariant
  void do_while_invariant(int m, int k) {
    int i = 0;
    do {
      m = k;
      i++;
    } while (i < m);
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      m = 60; // This line is unreachable
    }
  }

  void list_size_invariant(List<?> items) {
    for (int i = 0; i < items.size(); i++) {}
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      items.add(null); // This line is unreachable
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, but it's dynamically determined at runtime
  }
}