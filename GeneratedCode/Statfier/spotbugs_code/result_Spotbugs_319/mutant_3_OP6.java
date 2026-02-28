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
      
      // Unreachable for loop
      boolean conditionFor1 = getCondition();
      for (int i = 0; conditionFor1; i++) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH);
      
      // Unreachable for loop
      boolean conditionFor2 = getCondition();
      for (int i = 0; conditionFor2; i++) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 0);
      
      // Unreachable for loop
      boolean conditionFor3 = getCondition();
      for (int i = 0; conditionFor3; i++) {
        // This loop is unreachable
      }
    } catch (Exception e) {
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}