import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPaths {

  void acquireTwoThenReleaseOneTwiceBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file1.txt");
    FileInputStream stream2 = new FileInputStream("file2.txt");
    stream1.close();
    stream1.close();

    // Mutant code: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      stream2.close();
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}