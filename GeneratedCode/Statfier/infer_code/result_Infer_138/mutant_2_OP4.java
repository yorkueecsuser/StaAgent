import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Leaks {

  void basicLeakBad() throws FileNotFoundException {
    new FileInputStream("file.txt");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will not run
    } else {
      // Some alternative code that will not run
    }
  }

  void doubleLeakBad() throws FileNotFoundException {
    new FileInputStream("file1.txt");
    new FileInputStream("file2.txt");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will not run
    } else {
      // Some alternative code that will not run
    }
  }

  void basicReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    stream.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will not run
    } else {
      // Some alternative code that will not run
    }
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will not run
    } else {
      // Some alternative code that will not run
    }
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will not run
    } else {
      // Some alternative code that will not run
    }
  }

  private boolean getCondition() {
    return false; // This method can be used to dynamically determine the condition at runtime
  }
}