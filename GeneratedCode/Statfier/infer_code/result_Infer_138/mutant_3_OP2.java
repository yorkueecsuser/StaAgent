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
    // Mutant: Duplicate assignment statement
    FileInputStream streamDuplicate = new FileInputStream("file.txt");
    streamDuplicate.close();
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    // Mutant: Duplicate assignment statement
    FileInputStream stream1Duplicate = new FileInputStream("file.txt");
    stream1Duplicate.close();
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
    // Mutant: Duplicate assignment statement
    FileInputStream stream1Duplicate = new FileInputStream("file.txt");
    stream1Duplicate.close();
    FileInputStream stream2Duplicate = new FileInputStream("file.txt");
    stream2Duplicate.close();
  }
}