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
    // Mutant: Duplicate the assignment statement
    FileInputStream streamDuplicate = new FileInputStream("file.txt");
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    // Mutant: Duplicate the assignment statement
    FileInputStream stream1Duplicate = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    // Mutant: Duplicate the assignment statement
    FileInputStream stream1Duplicate = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
  }
}