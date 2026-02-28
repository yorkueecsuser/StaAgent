import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksBranch {

  void mayLeakBad(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream;
    if (b) {
      stream = new FileInputStream("file.txt");
    }
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      stream = new FileInputStream("unreachable.txt");
    } else {
      // This block will also never execute because condition is always false
      stream = new FileInputStream("also_unreachable.txt");
    }
  }

  void choiceCloseOk(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    if (b) {
      stream.close();
    } else {
      stream.close();
    }
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      stream.close();
    } else {
      // This block will also never execute because condition is always false
      stream.close();
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}