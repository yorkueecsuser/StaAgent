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
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
  }

  // Mutated code
  void basicReleaseOkMutant() throws IOException, FileNotFoundException {
    FileInputStream a = new FileInputStream("file.txt");
    a.close();
  }

  void acquireTwoForgetOneBadMutant() throws IOException, FileNotFoundException {
    FileInputStream b = new FileInputStream("file.txt");
    FileInputStream c = new FileInputStream("file.txt");
    b.close();
  }

  void acquireTwoThenReleaseOkMutant() throws IOException, FileNotFoundException {
    FileInputStream d = new FileInputStream("file.txt");
    FileInputStream e = new FileInputStream("file.txt");
    d.close();
    e.close();
  }
}