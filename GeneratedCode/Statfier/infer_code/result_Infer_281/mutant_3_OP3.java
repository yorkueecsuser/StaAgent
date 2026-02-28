import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksBranch {

  void mayLeakBad(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream;
    if (b) {
      stream = new FileInputStream("file.txt");
    }
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      stream = new FileInputStream("unreachableFile.txt");
    }
  }

  void choiceCloseOk(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    if (b) {
      stream.close();
    } else {
      stream.close();
    }
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      stream.close();
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}