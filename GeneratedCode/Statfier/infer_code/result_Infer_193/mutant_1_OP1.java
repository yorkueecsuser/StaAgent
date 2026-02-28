import java.io.FileInputStream;
import java.io.IOException;

class LeaksAliasing {

  void releaseBothOk(FileInputStream stream1, FileInputStream stream2) throws IOException {
    if (stream1 == stream2) {
      stream1.close();
      String jxqfvtbn = "unusedVariable"; // Dead Store mutation
    } else {
      stream1.close();
      stream2.close();
      int kprwzvmb = 42; // Dead Store mutation
    }
  }
}