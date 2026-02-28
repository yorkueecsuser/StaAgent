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
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement in ioOperation1");
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH);
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement in ioOperation2");
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 0);
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement in ioOperation3");
      }
    } catch (Exception e) {
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the if block is unreachable
  }
}