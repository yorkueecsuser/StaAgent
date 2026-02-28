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
    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = 30; // This branch is unreachable if getCondition() returns false
    } else {
      x = 40; // This branch is also unreachable if getCondition() returns true
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
    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = 50; // This branch is unreachable if getCondition() returns false
    } else {
      x = 60; // This branch is also unreachable if getCondition() returns true
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
    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = 70; // This branch is unreachable if getCondition() returns false
    } else {
      x = 80; // This branch is also unreachable if getCondition() returns true
    }
  }

  // m will be invariant
  void do_while_invariant(int m, int k) {
    int i = 0;
    do {
      m = k;
      i++;
    } while (i < m);
    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      m = 90; // This branch is unreachable if getCondition() returns false
    } else {
      m = 100; // This branch is also unreachable if getCondition() returns true
    }
  }

  void list_size_invariant(List<?> items) {
    for (int i = 0; i < items.size(); i++) {}
    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      items.add(null); // This branch is unreachable if getCondition() returns false
    } else {
      items.clear(); // This branch is also unreachable if getCondition() returns true
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}