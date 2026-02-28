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
    // Mutant code
    FileInputStream x;
    for (int j = 0; j < files.length; j++) {
      String y = files[j];
      x = new FileInputStream(y);
      x.close();
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
    // Mutant code
    FileInputStream[] z = new FileInputStream[files.length];
    for (int k = 0; k < files.length; k++) {
      z[k] = new FileInputStream(files[k]);
    }
    for (int k = 0; k < files.length; k++) {
      z[k].close();
    }
  }
}