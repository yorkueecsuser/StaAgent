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

    int y = 0;
    do {
      int ci = 0;
      do {
        di = d.cci[ci];
        final int s = di.s;
        output = y * s;
        ci++;
      } while (ci < cis);
      y++;
    } while (y < yy);
    return output;
  }
}