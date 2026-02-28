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
      // Inserting unreachable while loop
      boolean conditionWhile1 = getCondition();
      while (conditionWhile1) {
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
      // Inserting unreachable while loop
      boolean conditionWhile2 = getCondition();
      while (conditionWhile2) {
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
      // Inserting unreachable while loop
      boolean conditionWhile3 = getCondition();
      while (conditionWhile3) {
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
      // Inserting unreachable while loop
      boolean conditionWhile4 = getCondition();
      while (conditionWhile4) {
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
      // Inserting unreachable while loop
      boolean conditionWhile5 = getCondition();
      while (conditionWhile5) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will ensure the loop is unreachable
  }
}