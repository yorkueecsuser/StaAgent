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
      
      // Mutant: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable block in ioOperation1");
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH + 2, 1);
      
      // Mutant: Inserting unreachable if branch
      boolean condition = getAnotherCondition();
      if (condition) {
        // This block is unreachable because getAnotherCondition() always returns false
        System.out.println("This is an unreachable block in ioOperation2");
      }
    } catch (Exception e) {
    }
  }

  // Method to return false dynamically
  private boolean getCondition() {
    return false;
  }

  // Another method to return false dynamically
  private boolean getAnotherCondition() {
    return false;
  }
}