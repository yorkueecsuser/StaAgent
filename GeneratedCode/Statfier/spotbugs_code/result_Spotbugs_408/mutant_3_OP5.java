import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

class Bug3031882 {

  public static void testZip(String filename, boolean b) throws IOException {
    ZipFile zip = new ZipFile(filename);
    if (b) zip.close();

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case in testZip");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case in testZip");
        break;
    }
  }

  public static void testJar(String filename, boolean b) throws IOException {
    JarFile jar = new JarFile(filename);
    if (b) jar.close();

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case in testJar");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case in testJar");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the switch statement is mostly unreachable
    return false;
  }
}