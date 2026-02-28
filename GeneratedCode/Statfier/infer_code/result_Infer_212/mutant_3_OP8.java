import java.io.IOException;
import java.io.InputStream;

class Cost_test {

  private static int foo_constant() {
    int i, j;
    i = 17;
    j = 31;

    return i + j + 3 + 7;
  }

  private static int bar_constant() {

    int j = 0;

    j++;
    j++;
    j++;
    j = foo_constant();
    j++;

    return j;
  }

  private static int cond_constant(int i) {
    int x;

    if (i < 0) {
      x = bar_constant();
    } else {
      x = 1;
    }
    return x;
  }

  private static void alias_constant() {

    int a = 0, b;

    b = a;
    a = ++a;
  }

  private static void alias2_constant() {

    int a = 0, b, c;

    b = 1;
    c = 2;

    b = a;
    a = c;
  }

  private static int loop0_constant() {

    for (int a = 0; a < 100; a++) {
      alias2_constant();
    }
    return 0;
  }

  private static int loop1_constant() {

    int k = 100;
    for (int a = 0; a < k; a++) {
      alias2_constant();
    }
    return 0;
  }

  private static int loop2_linear(int k) {

    for (int a = 0; a < k; a++) {
      alias2_constant();
    }
    return 0;
  }

  private static int loop3_constant(int k) {

    for (int a = k; a < k + 18; a++) {
      alias2_constant();
    }
    return 0;
  }

  private static int main_constant() {

    int k1, k2, k3, k4;

    cond_constant(2);
    k1 = bar_constant() + foo_constant() + cond_constant(15) * 2;
    k2 = bar_constant() + foo_constant() + cond_constant(17) * 3;
    k3 = bar_constant() + foo_constant() + cond_constant(11) * 3;
    k4 = bar_constant() + foo_constant() + cond_constant(19) * 3;
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
    for (int a = 0; b && a < n; a++) {
      b = true;
    }
  }

  void ignore_boolean_symbols1_constant(boolean b) {
    for (; b; ) {
      if (rand()) {
        b = true;
      }
    }
  }

  void ignore_boolean_symbols2_constant(boolean b) {
    for (; b; ) {
      if (rand()) {
        b = false;
      }
    }
  }

  void ignore_float_symbols_constant(float f) {
    for (; f < (float) 1.0; ) {
      if (rand()) {
        f = (float) 1.0;
      }
    }
  }

  void ignore_double_symbols_constant(double d) {
    for (; d < (double) 1.0; ) {
      if (rand()) {
        d = 1.0;
      }
    }
  }

  void ignore_character_symbols_constant(char c) {
    for (; c < 'z'; ) {
      if (rand()) {
        c = 'a';
      }
    }
  }

  void call_inputstream_read_constant(InputStream is) throws IOException {
    int total = 0;
    int r;
    byte[] buf = new byte[20];
    while (total < 100 && (r = is.read(buf, 0, 20))!= -1) {
      total += r;
    }
  }

  static int global;

  int get_global() {
    return global;
  }

  /* It instantiates the return value of `get_global` (= `global`, the value of which is unknown) to
  the `global` symbol, instead of top, in order to avoid useless top-cost results.  */
  void loop_on_unknown_global_linear() {
    for (int a = 0; a < get_global(); a++) {}
  }

  void band_constant(int x) {
    for (int a = 0; a < (int) (x & 0xff); a++) {}
  }

  void mult_symbols_quadratic(int x, int y) {
    for (int a = 0; a < x * y; a++) {}
  }

  void call_mult_symbols_quadratic(int n) {
    for (int a = 0; a < n; a++) {}
    mult_symbols_quadratic(n, n);
  }

  void quadratic(int x) {
    for (int a = 0; a < x * x; a++) {}
  }
}

class CloneTest {
  int i;

  void clone_test_constant() throws CloneNotSupportedException {
    this.i = 10;
    CloneTest o = (CloneTest) this.clone();
    for (int a = 0; a < o.i; a++) {}
  }
}