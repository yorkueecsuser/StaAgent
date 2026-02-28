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
      // Mutant: Dead Store
      String qwertyui = "unusedVariable";
    }
  }

  void openAllCloseAllLoopOk(String[] files) throws IOException, FileNotFoundException {
    FileInputStream[] streams = new FileInputStream[files.length];
    for (int i = 0; i < files.length; i++) {
      streams[i] = new FileInputStream(files[i]);
    }
    for (int i = 0; i < files.length; i++) {
      streams[i].close();
      // Mutant: Dead Store
      int asdfghjk = 42;
    }
  }
}