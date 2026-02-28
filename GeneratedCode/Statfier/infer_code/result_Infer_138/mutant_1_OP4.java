import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Leaks {

  void basicLeakBad() throws FileNotFoundException {
    new FileInputStream("file.txt");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void doubleLeakBad() throws FileNotFoundException {
    new FileInputStream("file1.txt");
    new FileInputStream("file2.txt");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void basicReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream = new FileInputStream("file.txt");
    stream.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void acquireTwoForgetOneBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void acquireTwoThenReleaseOk() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file.txt");
    FileInputStream stream2 = new FileInputStream("file.txt");
    stream1.close();
    stream2.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, ensuring the branches are unreachable
  }
}