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
    }
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
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
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the loop unreachable
  }
}