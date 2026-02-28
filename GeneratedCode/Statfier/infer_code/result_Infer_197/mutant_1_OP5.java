import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksInterprocedural {

  FileInputStream returnResourceOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return new FileInputStream("file.txt");
  }

  FileInputStream returnResourceWrapperOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    return returnResourceOk();
  }

  void returnResourceThenCloseOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    returnResourceWrapperOk().close();
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
    returnResourceWrapperOk(); // warning
    return 0;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}