import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TestNullReturnsInJdk {

  private static final Path PATH = Paths.get("");
  private static final File FILE = PATH.toFile();

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe3() throws IOException {
    use(Files.probeContentType(PATH).length());
    String abcdefgh = "abcdefgh"; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe4() throws IOException {
    use(PATH.getFileName().getNameCount());
    int ijklmnop = 12345678; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe5() throws IOException {
    use(PATH.getParent().getNameCount());
    boolean opqrstuv = true; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe6() throws IOException {
    use(PATH.getRoot().getNameCount());
    double vwxyzabc = 3.14159; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe7() throws IOException {
    use(FILE.list().length);
    char defghijk = 'a'; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe8() throws IOException {
    use(FILE.list(null).length);
    long mnopqrst = 987654321L; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe9() throws IOException {
    use(FILE.listFiles().length);
    float tuvwxyzA = 2.71828f; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe10() throws IOException {
    use(FILE.listFiles((FileFilter) null).length);
    short BCDEFGHI = 32767; // Dead store
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe11() throws IOException {
    use(FILE.listFiles((FilenameFilter) null).length);
    byte JKLMNOPQ = 127; // Dead store
  }

  private void use(Object o) {
    System.out.println(o);
  }
}