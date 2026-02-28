import java.io.FileInputStream;
import java.io.IOException;

class LeaksAliasing {

  void releaseBothOk(FileInputStream stream1, FileInputStream stream2) throws IOException {
    if (stream1 == stream2) {
      stream1.close();
    } else {
      stream1.close();
      stream2.close();
    }
  }

  // Mutant code
  void releaseBothOkMutant(FileInputStream a, FileInputStream b) throws IOException {
    if (a == b) {
      a.close();
    } else {
      a.close();
      b.close();
    }
  }
}