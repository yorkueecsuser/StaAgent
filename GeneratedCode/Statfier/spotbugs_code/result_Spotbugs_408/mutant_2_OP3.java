import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

class Bug3031882 {

  public static void testZip(String filename, boolean b) throws IOException {
    ZipFile zip = new ZipFile(filename);
    if (b) zip.close();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement in testZip");
    }
  }

  public static void testJar(String filename, boolean b) throws IOException {
    JarFile jar = new JarFile(filename);
    if (b) jar.close();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement in testJar");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}