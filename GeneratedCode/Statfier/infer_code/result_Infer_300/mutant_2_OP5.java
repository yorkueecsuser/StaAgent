import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPaths {

  void acquireTwoThenReleaseOneTwiceBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file1.txt");
    FileInputStream stream2 = new FileInputStream("file2.txt");
    stream1.close();
    stream1.close();

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This default case will also never be reached
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}