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
    
    // Mutant 1: Renaming 'file' to 'a'
    File a = new File("temp.txt");
    try (FileReader fr = new FileReader(a)) {
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
    
    // Mutant 2: Renaming 'fr' to 'c'
    File file2 = new File("temp.txt");
    try (FileReader c = new FileReader(file2)) {
      char[] d = new char[BUFFER_LENGTH];
      c.read(d, 0, BUFFER_LENGTH + 2);
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
    
    // Mutant 3: Renaming 'buffer' to 'e'
    File file3 = new File("temp.txt");
    try (FileReader fr = new FileReader(file3)) {
      char[] e = new char[BUFFER_LENGTH];
      fr.read(e, 1, BUFFER_LENGTH);
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
    
    // Mutant 4: Renaming 'file' to 'f'
    File f = new File("temp.txt");
    try (FileReader fr = new FileReader(f)) {
      char[] g = new char[BUFFER_LENGTH];
      fr.read(g, 2, BUFFER_LENGTH);
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
    
    // Mutant 5: Renaming 'fr' to 'h'
    File file5 = new File("temp.txt");
    try (FileReader h = new FileReader(file5)) {
      char[] i = new char[BUFFER_LENGTH];
      h.read(i, BUFFER_LENGTH, 1);
    } catch (Exception e) {
    }
  }
}