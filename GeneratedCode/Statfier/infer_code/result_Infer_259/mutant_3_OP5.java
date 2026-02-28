/* Mimics https://fburl.com/f61h6rbl */
class CompressedData {
  class C {
    public static final int CCI = 4;
  }

  class DI {
    int s;
  }

  class D {
    final DI[] cci = new DI[C.CCI];
    int cis;
  }

  int yy;

  int decompressData(D d) {
    int output = 0;
    DI di;
    final int cis = d.cis;

    for (int y = 0; y < yy; ++y) {
      for (int ci = 0; ci < cis; ++ci) {
        di = d.cci[ci];
        final int s = di.s;
        output = y * s;

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
          case 1:
            // This case will never be reached because condition is always false
            output += 100; // Unique code to ensure mutant uniqueness
            break;
        }
      }
    }
    return output;
  }

  // Method to simulate a condition that is always false
  private boolean getCondition() {
    return false;
  }
}