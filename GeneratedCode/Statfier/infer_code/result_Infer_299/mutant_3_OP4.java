import java.util.List;

class Invariant {

  // x is invariant
  void x_is_invariant_ok(int size) {
    int i = 0, x;
    boolean condition = getSizeCondition(size); // Non-final variable to avoid compile-time constant
    if (size > 10) {
      x = 10;
    } else {
      x = 20;
    }
    while (i < size + x) {
      i++;
      if (condition) { // Unreachable if-else statement
        x = 30;
      } else {
        x = 40;
      }
    }
  }

  // x shouldn't be invariant since it can have two different values
  // depending on whether the inner conditional is executed or not.
  // Currently, we are getting T.
  void formal_not_invariant_FP(int size, int x) {
    int i = 0;
    boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
    while (i < size + x) {
      if (x > i) {
        x = 0;
      }
      i++;
      if (condition) { // Unreachable if-else statement
        x = 50;
      } else {
        x = 60;
      }
    }
  }

  // x shouldn't be invariant since it can have two different values
  // depending on whether the inner conditional is executed or not
  // Currently, we are getting quadratic bound we can't simplify (5+min(1, size))
  void local_not_invariant_FP(int size) {
    int i = 0;
    int x = 5;
    boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
    while (i < size + x) {
      if (x > i) {
        x = 0;
      }
      i++;
      if (condition) { // Unreachable if-else statement
        x = 70;
      } else {
        x = 80;
      }
    }
  }

  // m will be invariant
  void do_while_invariant(int m, int k) {
    int i = 0;
    boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
    do {
      m = k;
      i++;
      if (condition) { // Unreachable if-else statement
        m = 90;
      } else {
        m = 100;
      }
    } while (i < m);
  }

  void list_size_invariant(List<?> items) {
    boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
    for (int i = 0; i < items.size(); i++) {
      if (condition) { // Unreachable if-else statement
        i += 10;
      } else {
        i += 20;
      }
    }
  }

  // Helper method to provide a non-final condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false based on runtime logic
  }

  // Helper method to provide a non-final condition based on size
  private boolean getSizeCondition(int size) {
    return size == 0; // This method can be modified to return true/false based on runtime logic
  }
}