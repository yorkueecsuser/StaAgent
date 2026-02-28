import java.io.FileInputStream;
import java.io.IOException;

class LeaksAliasing {

  void releaseBothOk(FileInputStream stream1, FileInputStream stream2) throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    if (stream1 == stream2) {
      stream1.close();
    } else {
      stream1.close();
      stream2.close();
    }
  }

  private boolean getCondition() {
    return false;
  }
}