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

    // Mutant code: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will always execute");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}