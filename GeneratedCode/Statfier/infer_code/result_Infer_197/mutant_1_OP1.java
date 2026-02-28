import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksInterprocedural {

  FileInputStream returnResourceOk() throws IOException, FileNotFoundException {
    String qwejklmn; // Dead store
    return new FileInputStream("file.txt");
  }

  FileInputStream returnResourceWrapperOk() throws IOException, FileNotFoundException {
    int abcd1234; // Dead store
    return returnResourceOk();
  }

  void returnResourceThenCloseOk() throws IOException, FileNotFoundException {
    boolean hijklmno; // Dead store
    returnResourceWrapperOk().close();
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    double pqrs5678; // Dead store
    returnResourceWrapperOk(); // warning
    return 0;
  }
}