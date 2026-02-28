import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksBranch {

  void mayLeakBad(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream;
    if (b) {
      stream = new FileInputStream("file.txt");
      stream = new FileInputStream("file.txt"); // Mutant: Duplicate assignment
    }
  }

  void choiceCloseOk(Boolean b) throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    stream = new FileInputStream("file.txt"); // Mutant: Duplicate assignment
    if (b) {
      stream.close();
    } else {
      stream.close();
    }
  }
}