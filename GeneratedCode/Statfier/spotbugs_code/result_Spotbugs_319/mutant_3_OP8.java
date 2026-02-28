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

    // Mutant 1: Renaming 'file' to 'a'
    File a = new File("temp.txt");
    try (FileReader fr = new FileReader(a)) {
      char[] b = new char[BUFFER_LENGTH];
      fr.read(b, 0, 1);
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

    // Mutant 2: Renaming 'fr' to 'c'
    File file2 = new File("temp.txt");
    try (FileReader c = new FileReader(file2)) {
      char[] d = new char[BUFFER_LENGTH];
      c.read(d, 0, BUFFER_LENGTH);
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

    // Mutant 3: Renaming 'buffer' to 'e'
    File file3 = new File("temp.txt");
    try (FileReader fr = new FileReader(file3)) {
      char[] e = new char[BUFFER_LENGTH];
      fr.read(e, BUFFER_LENGTH, 0);
    } catch (Exception e) {
    }
  }
}