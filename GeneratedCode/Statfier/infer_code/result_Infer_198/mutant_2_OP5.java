import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksLoop {

  void openCloseLoopOk(String[] files) throws IOException, FileNotFoundException {
    FileInputStream stream;
    for (int i = 0; i < files.length; i++) {
      String file = files[i];
      stream = new FileInputStream(file);
      stream.close();

      // Unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("This is an unreachable case.");
          break;
      }
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}