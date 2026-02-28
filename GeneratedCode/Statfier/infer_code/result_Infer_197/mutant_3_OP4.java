import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksInterprocedural {

  FileInputStream returnResourceOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code.");
    }
    return new FileInputStream("file.txt");
  }

  FileInputStream returnResourceWrapperOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code.");
    }
    return returnResourceOk();
  }

  void returnResourceThenCloseOk() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code.");
    }
    returnResourceWrapperOk().close();
  }

  int returnResourceThenLeakBad() throws IOException, FileNotFoundException {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code.");
    }
    returnResourceWrapperOk(); // warning
    return 0;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}