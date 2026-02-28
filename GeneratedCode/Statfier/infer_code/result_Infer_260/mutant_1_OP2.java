class IntTest {
  void intValue_linear(Integer mKBytesToSend) {
    for (int count = 0; count < mKBytesToSend; count++) {}
    for (int count = 0; count < mKBytesToSend; count++) {} // Mutant: duplicated assignment
  }

  static Integer static_Integer;

  static void static_Integer_top() {
    for (int count = 0; count < static_Integer; count++) {}
    for (int count = 0; count < static_Integer; count++) {} // Mutant: duplicated assignment
  }

  static void valueOf_linear(int p) {
    Integer x = p; // call to valueOf
    Integer x2 = p; // Mutant: duplicated assignment
    for (int count = 0; count < x; count++) {}
  }

  boolean unknown_bool;

  void control_var_band_constant(int x, int y) {
    int z;
    int z2; // Mutant: duplicated assignment
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = x & y;
        z2 = x & y; // Mutant: duplicated assignment
      } else {
        z = x | y;
        z2 = x | y; // Mutant: duplicated assignment
      }
      if (z == 0) {
        break;
      }
    }
  }

  void control_var_band_add_constant(int x, int y) {
    int z;
    int z2; // Mutant: duplicated assignment
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = (x & y) + 1;
        z2 = (x & y) + 1; // Mutant: duplicated assignment
      } else {
        z = (x | y) + 1;
        z2 = (x | y) + 1; // Mutant: duplicated assignment
      }
      if (z == 0) {
        break;
      }
    }
  }
}