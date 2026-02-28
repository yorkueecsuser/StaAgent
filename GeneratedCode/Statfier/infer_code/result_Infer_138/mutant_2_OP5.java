import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Leaks {

  void basicLeakBad() throws FileNotFoundException {
    new FileInputStream("file.txt");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void doubleLeakBad() throws FileNotFoundException {
    new FileInputStream("file1.txt");
    new FileInputStream("file2.txt");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void basicReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    stream.close();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the switch is unreachable
  }
}