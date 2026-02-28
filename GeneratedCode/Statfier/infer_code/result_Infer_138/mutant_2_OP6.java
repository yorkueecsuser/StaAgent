import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Leaks {

  void basicLeakBad() throws FileNotFoundException {
    new FileInputStream("file.txt");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void doubleLeakBad() throws FileNotFoundException {
    new FileInputStream("file1.txt");
    new FileInputStream("file2.txt");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void basicReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    stream.close();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}