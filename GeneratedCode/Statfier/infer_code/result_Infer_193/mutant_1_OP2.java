import java.io.FileInputStream;
import java.io.IOException;

class LeaksAliasing {

  void releaseBothOk(FileInputStream stream1, FileInputStream stream2) throws IOException {
    if (stream1 == stream2) {
      stream1.close();
      // Mutant: Duplicate the close call for stream1
      stream1.close();
    } else {
      stream1.close();
      // Mutant: Duplicate the close call for stream1
      stream1.close();
      stream2.close();
    }
  }
}