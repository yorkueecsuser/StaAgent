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

        // Unreachable if statement mutant
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() always returns false
          output = output + 1;
        }
      }
    }
    return output;
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}