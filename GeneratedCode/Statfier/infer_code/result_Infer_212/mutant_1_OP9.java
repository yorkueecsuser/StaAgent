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

    int i = 0, j;

    j = i;
    i = ++i;
  }

  private static void alias2_constant() {

    int i = 0, j, z;

    j = 1;
    z = 2;

    j = i;
    i = z;
  }

  private static int loop0_constant() {

    int i = 0;
    do {
      alias2_constant();
      i++;
    } while (i < 100);
    return 0;
  }

  private static int loop1_constant() {

    int k = 100;
    int i = 0;
    do {
      alias2_constant();
      i++;
    } while (i < k);
    return 0;
  }

  private static int loop2_linear(int k) {

    int i = 0;
    do {
      alias2_constant();
      i++;
    } while (i < k);
    return 0;
  }

  private static int loop3_constant(int k) {

    int i = k;
    do {
      alias2_constant();
      i++;
    } while (i < k + 18);
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
    int i = 0;
    do {
      b = true;
      i++;
    } while (b && i < n);
  }

  void ignore_boolean_symbols1_constant(boolean b) {
    do {
      if (rand()) {
        b = true;
      }
    } while (b);
  }

  void ignore_boolean_symbols2_constant(boolean b) {
    do {
      if (rand()) {
        b = false;
      }
    } while (b);
  }

  void ignore_float_symbols_constant(float f) {
    do {
      if (rand()) {
        f = (float) 1.0;
      }
    } while (f < (float) 1.0);
  }

  void ignore_double_symbols_constant(double d) {
    do {
      if (rand()) {
        d = 1.0;
      }
    } while (d < (double) 1.0);
  }

  void ignore_character_symbols_constant(char c) {
    do {
      if (rand()) {
        c = 'a';
      }
    } while (c < 'z');
  }

  void call_inputstream_read_constant(InputStream is) throws IOException {
    int total = 0;
    int r;
    byte[] buf = new byte[20];
    do {
      r = is.read(buf, 0, 20);
      if (r!= -1) {
        total += r;
      }
    } while (total < 100 && r!= -1);
  }

  static int global;

  int get_global() {
    return global;
  }

  /* It instantiates the return value of `get_global` (= `global`, the value of which is unknown) to
  the `global` symbol, instead of top, in order to avoid useless top-cost results.  */
  void loop_on_unknown_global_linear() {
    int i = 0;
    do {
      i++;
    } while (i < get_global());
  }

  void band_constant(int x) {
    int i = 0;
    do {
      i++;
    } while (i < (int) (x & 0xff));
  }

  void mult_symbols_quadratic(int x, int y) {
    int i = 0;
    do {
      i++;
    } while (i < x * y);
  }

  void call_mult_symbols_quadratic(int n) {
    int i = 0;
    do {
      i++;
    } while (i < n);
    mult_symbols_quadratic(n, n);
  }

  void quadratic(int x) {
    int i = 0;
    do {
      i++;
    } while (i < x * x);
  }
}

class CloneTest {
  int i;

  void clone_test_constant() throws CloneNotSupportedException {
    this.i = 10;
    CloneTest o = (CloneTest) this.clone();
    int i = 0;
    do {
      i++;
    } while (i < o.i);
  }
}