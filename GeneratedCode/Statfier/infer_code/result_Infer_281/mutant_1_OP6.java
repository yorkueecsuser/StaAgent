import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksBranch {

  void mayLeakBad(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream;
    if (b) {
      stream = new FileInputStream("file.txt");
      // Introduced unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
      }
    }
  }

  void choiceCloseOk(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    if (b) {
      stream.close();
    } else {
      stream.close();
    }
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and assumed to be false
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the loop condition always false at runtime
  }
}