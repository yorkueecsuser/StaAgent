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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    returnResourceWrapperOk(); // warning
    return 0;
  }

  private boolean getCondition() {
    return false; // This method returns false, ensuring the switch is unreachable
  }
}