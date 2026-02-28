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
  private static final Path PATH_MUTANT = Paths.get(""); // Mutant addition
  private static final File FILE = PATH.toFile();
  private static final File FILE_MUTANT = PATH.toFile(); // Mutant addition

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe3() throws IOException {
    use(Files.probeContentType(PATH).length());
    use(Files.probeContentType(PATH_MUTANT).length()); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe4() throws IOException {
    use(PATH.getFileName().getNameCount());
    use(PATH_MUTANT.getFileName().getNameCount()); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe5() throws IOException {
    use(PATH.getParent().getNameCount());
    use(PATH_MUTANT.getParent().getNameCount()); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe6() throws IOException {
    use(PATH.getRoot().getNameCount());
    use(PATH_MUTANT.getRoot().getNameCount()); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe7() throws IOException {
    use(FILE.list().length);
    use(FILE_MUTANT.list().length); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe8() throws IOException {
    use(FILE.list(null).length);
    use(FILE_MUTANT.list(null).length); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe9() throws IOException {
    use(FILE.listFiles().length);
    use(FILE_MUTANT.listFiles().length); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe10() throws IOException {
    use(FILE.listFiles((FileFilter) null).length);
    use(FILE_MUTANT.listFiles((FileFilter) null).length); // Mutant addition
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe11() throws IOException {
    use(FILE.listFiles((FilenameFilter) null).length);
    use(FILE_MUTANT.listFiles((FilenameFilter) null).length); // Mutant addition
  }

  private void use(Object o) {
    System.out.println(o);
  }
}