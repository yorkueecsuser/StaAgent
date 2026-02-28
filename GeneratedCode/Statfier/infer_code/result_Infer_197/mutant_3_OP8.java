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

  FileInputStream a() throws IOException, FileNotFoundException {
    return new FileInputStream("file.txt");
  }

  FileInputStream b() throws IOException, FileNotFoundException {
    return a();
  }

  void c() throws IOException, FileNotFoundException {
    b().close();
  }

  int d() throws IOException, FileNotFoundException {
    b(); // warning
    return 0;
  }
}