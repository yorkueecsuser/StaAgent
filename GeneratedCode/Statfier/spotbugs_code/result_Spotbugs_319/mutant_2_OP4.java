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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never print in ioOperation1");
      } else {
        // Alternative code that should also never run
        System.out.println("This alternative should also never print in ioOperation1");
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never print in ioOperation2");
      } else {
        // Alternative code that should also never run
        System.out.println("This alternative should also never print in ioOperation2");
      }
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 0);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never print in ioOperation3");
      } else {
        // Alternative code that should also never run
        System.out.println("This alternative should also never print in ioOperation3");
      }
    } catch (Exception e) {
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the if-else branches unreachable
  }
}