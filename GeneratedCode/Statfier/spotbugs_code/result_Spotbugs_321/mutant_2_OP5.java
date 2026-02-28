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

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          System.out.println("This is unreachable");
          break;
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH + 2, 1);

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          System.out.println("This is also unreachable");
          break;
      }
    } catch (Exception e) {
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}