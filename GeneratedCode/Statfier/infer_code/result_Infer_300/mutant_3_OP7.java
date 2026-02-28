import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPaths {

  void acquireTwoThenReleaseOneTwiceBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = new FileInputStream("file1.txt");
    FileInputStream stream2 = new FileInputStream("file2.txt");
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
      System.out.println("This is an unreachable loop");
    }
    
    stream1.close();
    stream1.close();
  }

  // Method to provide a dynamic condition that evaluates to false
  private boolean getCondition() {
    return false;
  }
}