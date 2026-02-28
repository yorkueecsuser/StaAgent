class IntTest {
  void intValue_linear(Integer mKBytesToSend) {
    int count = 0;
    do {
    } while (count++ < mKBytesToSend);
  }

  static Integer static_Integer;

  static void static_Integer_top() {
    int count = 0;
    do {
    } while (count++ < static_Integer);
  }

  static void valueOf_linear(int p) {
    Integer x = p; // call to valueOf
    int count = 0;
    do {
    } while (count++ < x);
  }

  boolean unknown_bool;

  void control_var_band_constant(int x, int y) {
    int z;
    int i = 0;
    do {
      if (unknown_bool) {
        z = x & y;
      } else {
        z = x | y;
      }
      if (z == 0) {
        break;
      }
    } while (++i < 10);
  }

  void control_var_band_add_constant(int x, int y) {
    int z;
    int i = 0;
    do {
      if (unknown_bool) {
        z = (x & y) + 1;
      } else {
        z = (x | y) + 1;
      }
      if (z == 0) {
        break;
      }
    } while (++i < 10);
  }
}