import java.io.FileInputStream;
import java.io.IOException;

class LeaksAliasing {

  void releaseBothOk(FileInputStream stream1, FileInputStream stream2) throws IOException {
    if (stream1 == stream2) {
      stream1.close();
      // Dead Store Mutation
      String jxqfhtyz = "unusedVariable";
    } else {
      stream1.close();
      stream2.close();
      // Dead Store Mutation
      int kbnrwtvs = 42;
    }
  }
}