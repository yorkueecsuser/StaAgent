import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksBranch {

  void mayLeakBad(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream;
    if (b) {
      stream = new FileInputStream("file.txt");
    }
    // Mutant: Renaming'stream' to 'a'
    FileInputStream a;
    if (b) {
      a = new FileInputStream("file.txt");
    }
  }

  void choiceCloseOk(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    if (b) {
      stream.close();
    } else {
      stream.close();
    }
    // Mutant: Renaming 'b' to 'c'
    Boolean c = b;
    FileInputStream d = new FileInputStream("file.txt");
    if (c) {
      d.close();
    } else {
      d.close();
    }
  }
}