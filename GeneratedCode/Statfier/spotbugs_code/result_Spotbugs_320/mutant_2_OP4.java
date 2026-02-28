import java.io.File;
import java.io.FileReader;

/**
 * RANGE_ARRAY_LENGTH and RANGE_ARRAY_OFFSET false negative examples
 *
 * @author yerayrodriguez@gmail.com
 */
class IoOperationRangeArrayLengthExpected {

  private static final int BUFFER_LENGTH = 10;

  public void ioOperation1() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH + 1);
      
      // Unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is reachable if condition is true
      } else {
        // This block is unreachable if condition is false
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH + 2);
      
      // Unreachable if-else statement
      boolean condition = getAnotherCondition();
      if (condition) {
        // This block is reachable if condition is true
      } else {
        // This block is unreachable if condition is false
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 1, BUFFER_LENGTH);
      
      // Unreachable if-else statement
      boolean condition = yetAnotherCondition();
      if (condition) {
        // This block is reachable if condition is true
      } else {
        // This block is unreachable if condition is false
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation4() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 2, BUFFER_LENGTH);
      
      // Unreachable if-else statement
      boolean condition = determineCondition();
      if (condition) {
        // This block is reachable if condition is true
      } else {
        // This block is unreachable if condition is false
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation5() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 1);
      
      // Unreachable if-else statement
      boolean condition = checkCondition();
      if (condition) {
        // This block is reachable if condition is true
      } else {
        // This block is unreachable if condition is false
      }
    } catch (Exception e) {
    }
  }

  // Methods to provide dynamic conditions
  private boolean getCondition() {
    return false;
  }

  private boolean getAnotherCondition() {
    return false;
  }

  private boolean yetAnotherCondition() {
    return false;
  }

  private boolean determineCondition() {
    return false;
  }

  private boolean checkCondition() {
    return false;
  }
}