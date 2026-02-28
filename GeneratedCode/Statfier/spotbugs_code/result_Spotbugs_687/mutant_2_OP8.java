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
  long notBug(BufferedInputStream x, long y) throws IOException {
    return x.skip(y);
  }

  @NoWarning("SR_NOT_CHECKED")
  void notBug2(BufferedInputStream z, long w) throws IOException {
    while (w > 0) {
      w -= z.skip(w);
    }
  }
}