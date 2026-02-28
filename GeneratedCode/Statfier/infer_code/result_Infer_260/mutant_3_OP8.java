class IntTest {
  void intValue_linear(Integer mKBytesToSend) {
    for (int count = 0; count < mKBytesToSend; count++) {}
    // Mutant: Renaming 'count' to 'a'
    for (int a = 0; a < mKBytesToSend; a++) {}
  }

  static Integer static_Integer;

  static void static_Integer_top() {
    for (int count = 0; count < static_Integer; count++) {}
    // Mutant: Renaming 'count' to 'b'
    for (int b = 0; b < static_Integer; b++) {}
  }

  static void valueOf_linear(int p) {
    Integer x = p; // call to valueOf
    for (int count = 0; count < x; count++) {}
    // Mutant: Renaming 'count' to 'c'
    for (int c = 0; c < x; c++) {}
  }

  boolean unknown_bool;

  void control_var_band_constant(int x, int y) {
    int z;
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = x & y;
      } else {
        z = x | y;
      }
      if (z == 0) {
        break;
      }
    }
    // Mutant: Renaming 'i' to 'd'
    int d;
    for (d = 0; d < 10; d++) {
      if (unknown_bool) {
        z = x & y;
      } else {
        z = x | y;
      }
      if (z == 0) {
        break;
      }
    }
  }

  void control_var_band_add_constant(int x, int y) {
    int z;
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = (x & y) + 1;
      } else {
        z = (x | y) + 1;
      }
      if (z == 0) {
        break;
      }
    }
    // Mutant: Renaming 'i' to 'e'
    int e;
    for (e = 0; e < 10; e++) {
      if (unknown_bool) {
        z = (x & y) + 1;
      } else {
        z = (x | y) + 1;
      }
      if (z == 0) {
        break;
      }
    }
  }
}