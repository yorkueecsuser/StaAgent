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
    } catch (Exception e) {
    }

    // Mutant 1
    File f = new File("temp.txt");
    try (FileReader fr = new FileReader(f)) {
      char[] b = new char[BUFFER_LENGTH];
      fr.read(b, 0, BUFFER_LENGTH + 1);
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH + 2);
    } catch (Exception e) {
    }

    // Mutant 2
    File f = new File("temp.txt");
    try (FileReader fr = new FileReader(f)) {
      char[] b = new char[BUFFER_LENGTH];
      fr.read(b, 0, BUFFER_LENGTH + 2);
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 1, BUFFER_LENGTH);
    } catch (Exception e) {
    }

    // Mutant 3
    File f = new File("temp.txt");
    try (FileReader fr = new FileReader(f)) {
      char[] b = new char[BUFFER_LENGTH];
      fr.read(b, 1, BUFFER_LENGTH);
    } catch (Exception e) {
    }
  }

  public void ioOperation4() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 2, BUFFER_LENGTH);
    } catch (Exception e) {
    }

    // Mutant 4
    File f = new File("temp.txt");
    try (FileReader fr = new FileReader(f)) {
      char[] b = new char[BUFFER_LENGTH];
      fr.read(b, 2, BUFFER_LENGTH);
    } catch (Exception e) {
    }
  }

  public void ioOperation5() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 1);
    } catch (Exception e) {
    }

    // Mutant 5
    File f = new File("temp.txt");
    try (FileReader fr = new FileReader(f)) {
      char[] b = new char[BUFFER_LENGTH];
      fr.read(b, BUFFER_LENGTH, 1);
    } catch (Exception e) {
    }
  }
}