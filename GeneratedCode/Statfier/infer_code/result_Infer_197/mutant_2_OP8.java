import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksInterprocedural {

  FileInputStream returnResourceOk() throws IOException, FileNotFoundException {
    return new FileInputStream("file.txt");
  }

  FileInputStream returnResourceWrapperOk() throws IOException, FileNotFoundException {
    return returnResourceOk();
  }

  void returnResourceThenCloseOk() throws IOException, FileNotFoundException {
    returnResourceWrapperOk().close();
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    returnResourceWrapperOk(); // warning
    return 0;
  }

  // Mutated code starts here
  FileInputStream x() throws IOException, FileNotFoundException {
    return new FileInputStream("file.txt");
  }

  FileInputStream y() throws IOException, FileNotFoundException {
    return x();
  }

  void z() throws IOException, FileNotFoundException {
    y().close();
  }

  int w() throws IOException, FileNotFoundException {
    y(); // warning
    return 0;
  }
}