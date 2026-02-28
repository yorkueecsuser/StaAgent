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

    // Inserting an unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}