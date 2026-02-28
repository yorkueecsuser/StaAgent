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

        // Inserted unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block is intended to be unreachable
          output += s * 100;
        } else {
          // This block is also intended to be unreachable due to the nature of shouldRun
          output -= s * 100;
        }
      }
    }
    return output;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}