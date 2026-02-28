import java.io.FileInputStream;
import java.io.IOException;

class LeaksAliasing {

  void releaseBothOk(FileInputStream stream1, FileInputStream stream2) throws IOException {
    if (stream1 == stream2) {
      stream1.close();
      stream1.close(); // Mutant: duplicated close call
    } else {
      stream1.close();
      stream2.close();
      stream2.close(); // Mutant: duplicated close call
    }
  }
}