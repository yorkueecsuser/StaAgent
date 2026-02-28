import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksLoop {

  void openCloseLoopOk(String[] files) throws IOException, FileNotFoundException {
    FileInputStream stream;
    for (int i = 0; i < files.length; i++) {
      String file = files[i];
      stream = new FileInputStream(file);
      // Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable branch");
      }
      stream.close();
    }
  }

  void openAllCloseAllLoopOk(String[] files) throws IOException, FileNotFoundException {
    FileInputStream[] streams = new FileInputStream[files.length];
    for (int i = 0; i < files.length; i++) {
      streams[i] = new FileInputStream(files[i]);
    }
    for (int i = 0; i < files.length; i++) {
      streams[i].close();
    }
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
        System.out.println("This is another unreachable branch");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}