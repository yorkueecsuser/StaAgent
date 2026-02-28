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

    // Mutant
    int a = 0, b;
    if (size > 10) {
      b = 10;
    } else {
      b = 20;
    }
    while (a < size + b) {
      a++;
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

    // Mutant
    int c = 0;
    while (c < size + x) {
      if (x > c) {
        x = 0;
      }
      c++;
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

    // Mutant
    int d = 0;
    int y = 5;
    while (d < size + y) {
      if (y > d) {
        y = 0;
      }
      d++;
    }
  }

  // m will be invariant
  void do_while_invariant(int m, int k) {
    int i = 0;
    do {
      m = k;
      i++;
    } while (i < m);

    // Mutant
    int e = 0;
    do {
      m = k;
      e++;
    } while (e < m);
  }

  void list_size_invariant(List<?> items) {
    for (int i = 0; i < items.size(); i++) {}

    // Mutant
    for (int f = 0; f < items.size(); f++) {}
  }
}