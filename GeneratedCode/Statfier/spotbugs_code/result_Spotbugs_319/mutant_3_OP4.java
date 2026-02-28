import java.io.File;
import java.io.FileReader;

/**
 * java/io read operations Ok
 *
 * @author yerayrodriguez@gmail.com
 */
class IoOperationOk {

  private static final int BUFFER_LENGTH = 10;

  public void ioOperation1() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, 1);
      // Mutant addition
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH);
      // Mutant addition
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 0);
      // Mutant addition
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    } catch (Exception e) {
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is effectively unreachable
  }
}