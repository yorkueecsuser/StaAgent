import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedInputStream;
import java.io.IOException;

class SR_NOT_CHECKED {

  @ExpectWarning("SR_NOT_CHECKED")
  void bug1(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
  }

  @ExpectWarning("SR_NOT_CHECKED")
  void bug2(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
  }

  @NoWarning("SR_NOT_CHECKED")
  long notBug(BufferedInputStream any, long anyLong) throws IOException {
    return any.skip(anyLong);
  }

  @NoWarning("SR_NOT_CHECKED")
  void notBug2(BufferedInputStream any, long anyLong) throws IOException {
    while (anyLong > 0) {
      anyLong -= any.skip(anyLong);
    }
  }

  // Mutated code
  @ExpectWarning("SR_NOT_CHECKED")
  void bug1a(BufferedInputStream z, long x) throws IOException {
    z.skip(x);
  }

  @ExpectWarning("SR_NOT_CHECKED")
  void bug2a(BufferedInputStream y, long w) throws IOException {
    y.skip(w);
  }

  @NoWarning("SR_NOT_CHECKED")
  long notBuga(BufferedInputStream v, long u) throws IOException {
    return v.skip(u);
  }

  @NoWarning("SR_NOT_CHECKED")
  void notBug2a(BufferedInputStream t, long s) throws IOException {
    while (s > 0) {
      s -= t.skip(s);
    }
  }
}