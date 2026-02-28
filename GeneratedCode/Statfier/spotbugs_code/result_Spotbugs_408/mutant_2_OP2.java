import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

class Bug3031882 {

  public static void testZip(String filename, boolean b) throws IOException {
    ZipFile zip = new ZipFile(filename);
    zip = new ZipFile(filename); // Duplicate assignment
    if (b) zip.close();
  }

  public static void testJar(String filename, boolean b) throws IOException {
    JarFile jar = new JarFile(filename);
    jar = new JarFile(filename); // Duplicate assignment
    if (b) jar.close();
  }
}