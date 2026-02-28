import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

class Bug3031882 {

  public static void testZip(String filename, boolean b) throws IOException {
    ZipFile zip = new ZipFile(filename);
    if (b) zip.close();

    // Inserted unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in testZip");
    }
  }

  public static void testJar(String filename, boolean b) throws IOException {
    JarFile jar = new JarFile(filename);
    if (b) jar.close();

    // Inserted unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in testJar");
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}