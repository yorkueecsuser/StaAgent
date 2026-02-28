import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

class Bug3031882 {

  public static void testZip(String filename, boolean b) throws IOException {
    ZipFile zip = new ZipFile(filename);
    if (b) zip.close();
    // Dead Store Mutation
    String xwqjfnrj = "unusedVariable";
  }

  public static void testJar(String filename, boolean b) throws IOException {
    JarFile jar = new JarFile(filename);
    if (b) jar.close();
    // Dead Store Mutation
    int qkxvbnfl = 42;
  }
}