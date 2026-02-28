import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPaths {

  void acquireTwoThenReleaseOneTwiceBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file1.txt");
    FileInputStream stream2 = new FileInputStream("file2.txt");
    stream1.close();
    stream1.close();

    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed.");
    } else {
      // Alternative code that will run instead
      System.out.println("This is the alternative code.");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}