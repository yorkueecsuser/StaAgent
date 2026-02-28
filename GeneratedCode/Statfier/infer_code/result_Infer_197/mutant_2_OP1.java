import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksInterprocedural {

  FileInputStream returnResourceOk() throws IOException, FileNotFoundException {
    String qjvbnrht = "unusedVariable"; // Dead Store mutation
    return new FileInputStream("file.txt");
  }

  FileInputStream returnResourceWrapperOk() throws IOException, FileNotFoundException {
    int xwvftrpq = 42; // Dead Store mutation
    return returnResourceOk();
  }

  void returnResourceThenCloseOk() throws IOException, FileNotFoundException {
    boolean yzmkldsa = true; // Dead Store mutation
    returnResourceWrapperOk().close();
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    char hgfjklzx = 'a'; // Dead Store mutation
    returnResourceWrapperOk(); // warning
    return 0;
  }
}