import java.util.List;

class Invariant {

  // x is invariant
  void x_is_invariant_ok(int size) {
    int i = 0, x;
    if (size > 10) {
      x = 10;
      x = 10; // Mutant: duplicated assignment
    } else {
      x = 20;
      x = 20; // Mutant: duplicated assignment
    }
    while (i < size + x) {
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
        x = 0; // Mutant: duplicated assignment
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
    x = 5; // Mutant: duplicated assignment
    while (i < size + x) {
      if (x > i) {
        x = 0;
        x = 0; // Mutant: duplicated assignment
      }
      i++;
    }
  }

  // m will be invariant
  void do_while_invariant(int m, int k) {
    int i = 0;
    do {
      m = k;
      m = k; // Mutant: duplicated assignment
      i++;
    } while (i < m);
  }

  void list_size_invariant(List<?> items) {
    for (int i = 0; i < items.size(); i++) {}
  }
}