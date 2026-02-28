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
    } catch (Exception e) {
    }

    // Mutant 1: Renamed 'buffer' to 'a'
    File x = new File("temp.txt");
    try (FileReader y = new FileReader(x)) {
      char[] a = new char[BUFFER_LENGTH];
      y.read(a, 0, 1);
    } catch (Exception e) {
    }
  }

  public void ioOperation2() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, 0, BUFFER_LENGTH);
    } catch (Exception e) {
    }

    // Mutant 2: Renamed 'file' to 'b'
    File b = new File("temp.txt");
    try (FileReader c = new FileReader(b)) {
      char[] buffer = new char[BUFFER_LENGTH];
      c.read(buffer, 0, BUFFER_LENGTH);
    } catch (Exception e) {
    }
  }

  public void ioOperation3() {
    File file = new File("temp.txt");
    try (FileReader fr = new FileReader(file)) {
      char[] buffer = new char[BUFFER_LENGTH];
      fr.read(buffer, BUFFER_LENGTH, 0);
    } catch (Exception e) {
    }

    // Mutant 3: Renamed 'fr' to 'd'
    File file2 = new File("temp.txt");
    try (FileReader d = new FileReader(file2)) {
      char[] buffer = new char[BUFFER_LENGTH];
      d.read(buffer, BUFFER_LENGTH, 0);
    } catch (Exception e) {
    }
  }
}