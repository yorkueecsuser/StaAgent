import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksInterprocedural {

  FileInputStream returnResourceOk() throws IOException, FileNotFoundException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new FileInputStream("file.txt");
  }

  FileInputStream returnResourceWrapperOk() throws IOException, FileNotFoundException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return returnResourceOk();
  }

  void returnResourceThenCloseOk() throws IOException, FileNotFoundException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    returnResourceWrapperOk().close();
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    returnResourceWrapperOk(); // warning
    return 0;
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}