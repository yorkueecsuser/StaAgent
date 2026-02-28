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
  long notBug(BufferedInputStream b, long l) throws IOException {
    return b.skip(l);
  }

  @NoWarning("SR_NOT_CHECKED")
  void notBug2(BufferedInputStream i, long n) throws IOException {
    while (n > 0) {
      n -= i.skip(n);
    }
  }
}