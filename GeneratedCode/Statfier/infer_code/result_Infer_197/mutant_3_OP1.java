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
    String qzjfnxvt; // Dead store
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    returnResourceWrapperOk(); // warning
    int mnbvcxzp; // Dead store
    return 0;
  }
}