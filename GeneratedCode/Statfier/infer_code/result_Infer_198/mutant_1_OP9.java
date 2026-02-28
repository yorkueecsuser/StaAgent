import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksLoop {

  void openCloseLoopOk(String[] files) throws IOException, FileNotFoundException {
    FileInputStream stream;
    int i = 0;
    do {
      String file = files[i];
      stream = new FileInputStream(file);
      stream.close();
      i++;
    } while (i < files.length);
  }

  void openAllCloseAllLoopOk(String[] files) throws IOException, FileNotFoundException {
    FileInputStream[] streams = new FileInputStream[files.length];
    int i = 0;
    do {
      streams[i] = new FileInputStream(files[i]);
      i++;
    } while (i < files.length);
    i = 0;
    do {
      streams[i].close();
      i++;
    } while (i < files.length);
  }
}