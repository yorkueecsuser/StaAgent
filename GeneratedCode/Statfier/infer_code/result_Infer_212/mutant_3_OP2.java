import java.io.IOException;
import java.io.InputStream;

class Cost_test {

  private static int foo_constant() {
    int i, j;
    i = 17; // Mutant: i = 17;
    i = 17; // Duplicate
    j = 31; // Mutant: j = 31;
    j = 31; // Duplicate

    return i + j + 3 + 7;
  }

  private static int bar_constant() {

    int j = 0; // Mutant: j = 0;
    j = 0; // Duplicate

    j++; // Mutant: j++;
    j++; // Duplicate
    j++; // Mutant: j++;
    j++; // Duplicate
    j = foo_constant();
    j++; // Mutant: j++;
    j++; // Duplicate

    return j;
  }

  private static int cond_constant(int i) {
    int x;

    if (i < 0) {
      x = bar_constant(); // Mutant: x = bar_constant();
      x = bar_constant(); // Duplicate
    } else {
      x = 1; // Mutant: x = 1;
      x = 1; // Duplicate
    }
    return x;
  }

  private static void alias_constant() {

    int i = 0, j;

    j = i; // Mutant: j = i;
    j = i; // Duplicate
    i = ++i; // Mutant: i = ++i;
    i = ++i; // Duplicate
  }

  private static void alias2_constant() {

    int i = 0, j, z;

    j = 1; // Mutant: j = 1;
    j = 1; // Duplicate
    z = 2; // Mutant: z = 2;
    z = 2; // Duplicate

    j = i; // Mutant: j = i;
    j = i; // Duplicate
    i = z; // Mutant: i = z;
    i = z; // Duplicate
  }

  private static int loop0_constant() {

    for (int i = 0; i < 100; i++) {
      alias2_constant(); // Mutant: alias2_constant();
      alias2_constant(); // Duplicate
    }
    return 0;
  }

  private static int loop1_constant() {

    int k = 100; // Mutant: k = 100;
    k = 100; // Duplicate
    for (int i = 0; i < k; i++) {
      alias2_constant(); // Mutant: alias2_constant();
      alias2_constant(); // Duplicate
    }
    return 0;
  }

  private static int loop2_linear(int k) {

    for (int i = 0; i < k; i++) {
      alias2_constant(); // Mutant: alias2_constant();
      alias2_constant(); // Duplicate
    }
    return 0;
  }

  private static int loop3_constant(int k) {

    for (int i = k; i < k + 18; i++) {
      alias2_constant(); // Mutant: alias2_constant();
      alias2_constant(); // Duplicate
    }
    return 0;
  }

  private static int main_constant() {

    int k1, k2, k3, k4;

    cond_constant(2); // Mutant: cond_constant(2);
    cond_constant(2); // Duplicate
    k1 = bar_constant() + foo_constant() + cond_constant(15) * 2; // Mutant: k1 = bar_constant() + foo_constant() + cond_constant(15) * 2;
    k1 = bar_constant() + foo_constant() + cond_constant(15) * 2; // Duplicate
    k2 = bar_constant() + foo_constant() + cond_constant(17) * 3; // Mutant: k2 = bar_constant() + foo_constant() + cond_constant(17) * 3;
    k2 = bar_constant() + foo_constant() + cond_constant(17) * 3; // Duplicate
    k3 = bar_constant() + foo_constant() + cond_constant(11) * 3; // Mutant: k3 = bar_constant() + foo_constant() + cond_constant(11) * 3;
    k3 = bar_constant() + foo_constant() + cond_constant(11) * 3; // Duplicate
    k4 = bar_constant() + foo_constant() + cond_constant(19) * 3; // Mutant: k4 = bar_constant() + foo_constant() + cond_constant(19) * 3;
    k4 = bar_constant() + foo_constant() + cond_constant(19) * 3; // Duplicate
    return 0;
  }

  private static void unitCostFunction_constant() {}

  boolean rand() {
    if (Math.random() > 0.5) {
      return true;
    } else {
      return false;
    }
  }

  // Cost: Linear in n
  void ignore_boolean_symbols_linear(boolean b, int n) {
    for (int i = 0; b && i < n; i++) {
      b = true; // Mutant: b = true;
      b = true; // Duplicate
    }
  }

  void ignore_boolean_symbols1_constant(boolean b) {
    for (; b; ) {
      if (rand()) {
        b = true; // Mutant: b = true;
        b = true; // Duplicate
      }
    }
  }

  void ignore_boolean_symbols2_constant(boolean b) {
    for (; b; ) {
      if (rand()) {
        b = false; // Mutant: b = false;
        b = false; // Duplicate
      }
    }
  }

  void ignore_float_symbols_constant(float f) {
    for (; f < (float) 1.0; ) {
      if (rand()) {
        f = (float) 1.0; // Mutant: f = (float) 1.0;
        f = (float) 1.0; // Duplicate
      }
    }
  }

  void ignore_double_symbols_constant(double d) {
    for (; d < (double) 1.0; ) {
      if (rand()) {
        d = 1.0; // Mutant: d = 1.0;
        d = 1.0; // Duplicate
      }
    }
  }

  void ignore_character_symbols_constant(char c) {
    for (; c < 'z'; ) {
      if (rand()) {
        c = 'a'; // Mutant: c = 'a';
        c = 'a'; // Duplicate
      }
    }
  }

  void call_inputstream_read_constant(InputStream is) throws IOException {
    int total = 0; // Mutant: total = 0;
    total = 0; // Duplicate
    int r;
    byte[] buf = new byte[20]; // Mutant: byte[] buf = new byte[20];
    byte[] buf2 = new byte[20]; // Duplicate
    while (total < 100 && (r = is.read(buf, 0, 20))!= -1) {
      total += r; // Mutant: total += r;
      total += r; // Duplicate
    }
  }

  static int global;

  int get_global() {
    return global;
  }

  /* It instantiates the return value of `get_global` (= `global`, the value of which is unknown) to
  the `global` symbol, instead of top, in order to avoid useless top-cost results.  */
  void loop_on_unknown_global_linear() {
    for (int i = 0; i < get_global(); i++) {} // Mutant: for (int i = 0; i < get_global(); i++) {}
    // Duplicate: for (int i = 0; i < get_global(); i++) {}
  }

  void band_constant(int x) {
    for (int i = 0; i < (int) (x & 0xff); i++) {} // Mutant: for (int i = 0; i < (int) (x & 0xff); i++) {}
    // Duplicate: for (int i = 0; i < (int) (x & 0xff); i++) {}
  }

  void mult_symbols_quadratic(int x, int y) {
    for (int i = 0; i < x * y; i++) {} // Mutant: for (int i = 0; i < x * y; i++) {}
    // Duplicate: for (int i = 0; i < x * y; i++) {}
  }

  void call_mult_symbols_quadratic(int n) {
    for (int i = 0; i < n; i++) {} // Mutant: for (int i = 0; i < n; i++) {}
    // Duplicate: for (int i = 0; i < n; i++) {}
    mult_symbols_quadratic(n, n); // Mutant: mult_symbols_quadratic(n, n);
    // Duplicate: mult_symbols_quadratic(n, n);
  }

  void quadratic(int x) {
    for (int i = 0; i < x * x; i++) {} // Mutant: for (int i = 0; i < x * x; i++) {}
    // Duplicate: for (int i = 0; i < x * x; i++) {}
  }
}

class CloneTest {
  int i;

  void clone_test_constant() throws CloneNotSupportedException {
    this.i = 10; // Mutant: this.i = 10;
    this.i = 10; // Duplicate
    CloneTest o = (CloneTest) this.clone(); // Mutant: CloneTest o = (CloneTest) this.clone();
    // Duplicate: CloneTest o = (CloneTest) this.clone();
    for (int i = 0; i < o.i; i++) {} // Mutant: for (int i = 0; i < o.i; i++) {}
    // Duplicate: for (int i = 0; i < o.i; i++) {}
  }
}