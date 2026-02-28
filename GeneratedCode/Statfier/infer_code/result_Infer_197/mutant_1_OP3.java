import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksInterprocedural {

  FileInputStream returnResourceOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return new FileInputStream("file.txt");
  }

  FileInputStream returnResourceWrapperOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return returnResourceOk();
  }

  void returnResourceThenCloseOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    returnResourceWrapperOk().close();
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    returnResourceWrapperOk(); // warning
    return 0;
  }

  private boolean getCondition() {
    // This method returns a condition that is always false at runtime
    return false;
  }
}