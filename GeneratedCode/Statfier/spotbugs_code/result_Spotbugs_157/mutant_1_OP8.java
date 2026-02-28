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
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe4() throws IOException {
    use(PATH.getFileName().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe5() throws IOException {
    use(PATH.getParent().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe6() throws IOException {
    use(PATH.getRoot().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe7() throws IOException {
    use(FILE.list().length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe8() throws IOException {
    use(FILE.list(null).length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe9() throws IOException {
    use(FILE.listFiles().length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe10() throws IOException {
    use(FILE.listFiles((FileFilter) null).length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe11() throws IOException {
    use(FILE.listFiles((FilenameFilter) null).length);
  }

  private void use(Object o) {
    System.out.println(o);
  }

  // Mutated code
  private static final Path p = Paths.get("");
  private static final File f = p.toFile();

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe3m() throws IOException {
    use(Files.probeContentType(p).length());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe4m() throws IOException {
    use(p.getFileName().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe5m() throws IOException {
    use(p.getParent().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe6m() throws IOException {
    use(p.getRoot().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe7m() throws IOException {
    use(f.list().length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe8m() throws IOException {
    use(f.list(null).length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe9m() throws IOException {
    use(f.listFiles().length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe10m() throws IOException {
    use(f.listFiles((FileFilter) null).length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe11m() throws IOException {
    use(f.listFiles((FilenameFilter) null).length);
  }

  private void usem(Object x) {
    System.out.println(x);
  }
}