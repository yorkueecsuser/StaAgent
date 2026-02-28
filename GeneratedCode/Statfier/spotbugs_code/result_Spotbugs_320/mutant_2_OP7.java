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
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH + 2);
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 1, BUFFER_LENGTH);
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation4() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 2, BUFFER_LENGTH);
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation5() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 1);
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}