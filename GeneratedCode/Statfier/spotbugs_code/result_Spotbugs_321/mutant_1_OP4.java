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
      
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block in ioOperation1");
      } else {
        // Alternative block
        System.out.println("This is the alternative block in ioOperation1");
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH + 2, 1);
      
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block in ioOperation2");
      } else {
        // Alternative block
        System.out.println("This is the alternative block in ioOperation2");
      }
    } catch (Exception e) {
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}