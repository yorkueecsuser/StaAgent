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
    String jxqfmbnh = "deadstore"; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe4() throws IOException {
    use(PATH.getFileName().getNameCount());
    int pqwzjyxc = 42; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe5() throws IOException {
    use(PATH.getParent().getNameCount());
    boolean vbnrhtyu = true; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe6() throws IOException {
    use(PATH.getRoot().getNameCount());
    double wertuiop = 3.14; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe7() throws IOException {
    use(FILE.list().length);
    char asdfghjk = 'a'; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe8() throws IOException {
    use(FILE.list(null).length);
    long zxcvbnml = 100L; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe9() throws IOException {
    use(FILE.listFiles().length);
    float qwertyui = 2.718f; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe10() throws IOException {
    use(FILE.listFiles((FileFilter) null).length);
    byte mnbvcxz = 1; // Dead store mutation
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe11() throws IOException {
    use(FILE.listFiles((FilenameFilter) null).length);
    short lkjhgfds = 2; // Dead store mutation
  }

  private void use(Object o) {
    System.out.println(o);
  }
}