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
      }
    }
    return output;
  }

  // Mutated code
  int decompressDataMutant(D e) {
    int z = 0;
    DI fj;
    final int g = e.cis;

    for (int h = 0; h < yy; ++h) {
      for (int i = 0; i < g; ++i) {
        fj = e.cci[i];
        final int j = fj.s;
        z = h * j;
      }
    }
    return z;
  }
}