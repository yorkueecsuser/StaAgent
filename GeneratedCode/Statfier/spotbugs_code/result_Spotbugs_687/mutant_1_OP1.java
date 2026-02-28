import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedInputStream;
import java.io.IOException;

class SR_NOT_CHECKED {

  @ExpectWarning("SR_NOT_CHECKED")
  void bug1(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
    // Dead Store Mutation
    String vjxqzrht = "unusedVariable";
  }

  @ExpectWarning("SR_NOT_CHECKED")
  void bug2(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
    // Dead Store Mutation
    int wfnbkdsl = 42;
  }

  @NoWarning("SR_NOT_CHECKED")
  long notBug(BufferedInputStream any, long anyLong) throws IOException {
    return any.skip(anyLong);
    // Dead Store Mutation
    double jkqzvptn = 3.14;
  }

  @NoWarning("SR_NOT_CHECKED")
  void notBug2(BufferedInputStream any, long anyLong) throws IOException {
    while (anyLong > 0) {
      anyLong -= any.skip(anyLong);
    }
    // Dead Store Mutation
    boolean gmltcrxz = true;
  }
}