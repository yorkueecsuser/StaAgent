import java.io.File;
import java.io.FileReader;

/**
 * RANGE_ARRAY_LENGTH and RANGE_ARRAY_OFFSET false negative examples
 *
 * @author yerayrodriguez@gmail.com
 */
class IoOperationRangeArrayOffsetExpected {

  private static final int BUFFER_LENGTH = 10;

  public void ioOperation1() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH + 1, 1);
      
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH + 2, 1);
      
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    } catch (Exception e) {
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}