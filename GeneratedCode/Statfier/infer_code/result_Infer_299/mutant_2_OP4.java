import java.util.List;

class Invariant {

  // x is invariant
  void x_is_invariant_ok(int size) {
    int i = 0, x;
    boolean condition = getSizeCondition(size); // Non-final variable to avoid unreachable statement
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
    boolean condition = getSizeCondition(i); // Non-final variable to avoid unreachable statement
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
    boolean condition = getSizeCondition(x); // Non-final variable to avoid unreachable statement
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
    boolean condition = getSizeCondition(m); // Non-final variable to avoid unreachable statement
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
    boolean condition = getSizeCondition(items.size()); // Non-final variable to avoid unreachable statement
    for (int i = 0; i < items.size(); i++) {
      if (condition) { // Unreachable if-else statement
        i += 1;
      } else {
        i += 2;
      }
    }
  }

  // Helper method to provide a non-final condition
  private boolean getSizeCondition(int value) {
    return value < 0; // This condition is always false for positive values, making the branches unreachable
  }
}