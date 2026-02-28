class IntTest {
  void intValue_linear(Integer mKBytesToSend) {
    for (int count = 0; count < mKBytesToSend; count++) {}
    for (int count = 0; count < mKBytesToSend; count++) {} // Duplicate
  }

  static Integer static_Integer;

  static void static_Integer_top() {
    for (int count = 0; count < static_Integer; count++) {}
    for (int count = 0; count < static_Integer; count++) {} // Duplicate
  }

  static void valueOf_linear(int p) {
    Integer x = p; // call to valueOf
    Integer x_duplicate = p; // Duplicate
    for (int count = 0; count < x; count++) {}
  }

  boolean unknown_bool;

  void control_var_band_constant(int x, int y) {
    int z;
    int z_duplicate; // Duplicate
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = x & y;
        z_duplicate = x & y; // Duplicate
      } else {
        z = x | y;
        z_duplicate = x | y; // Duplicate
      }
      if (z == 0) {
        break;
      }
    }
  }

  void control_var_band_add_constant(int x, int y) {
    int z;
    int z_duplicate; // Duplicate
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = (x & y) + 1;
        z_duplicate = (x & y) + 1; // Duplicate
      } else {
        z = (x | y) + 1;
        z_duplicate = (x | y) + 1; // Duplicate
      }
      if (z == 0) {
        break;
      }
    }
  }
}