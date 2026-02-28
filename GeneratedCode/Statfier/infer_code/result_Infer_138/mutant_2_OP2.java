import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Leaks {

  void basicLeakBad() throws FileNotFoundException {
    new FileInputStream("file.txt");
  }

  void doubleLeakBad() throws FileNotFoundException {
    new FileInputStream("file1.txt");
    new FileInputStream("file2.txt");
  }

  void basicReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    stream.close();
    FileInputStream streamCopy = new FileInputStream("file.txt"); // Mutant
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    FileInputStream stream1Copy = new FileInputStream("file.txt"); // Mutant
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
    FileInputStream stream1Copy = new FileInputStream("file.txt"); // Mutant
    FileInputStream stream2Copy = new FileInputStream("file.txt"); // Mutant
  }
}