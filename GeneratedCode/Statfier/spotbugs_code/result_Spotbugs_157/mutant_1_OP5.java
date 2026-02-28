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
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        // This case is unreachable because getValue() never returns 1
        System.out.println("Unreachable case");
        break;
    }
    use(Files.probeContentType(PATH).length());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe4() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 2:
        // This case is unreachable because getValue() never returns 2
        System.out.println("Unreachable case");
        break;
    }
    use(PATH.getFileName().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe5() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 3:
        // This case is unreachable because getValue() never returns 3
        System.out.println("Unreachable case");
        break;
    }
    use(PATH.getParent().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe6() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 4:
        // This case is unreachable because getValue() never returns 4
        System.out.println("Unreachable case");
        break;
    }
    use(PATH.getRoot().getNameCount());
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe7() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 5:
        // This case is unreachable because getValue() never returns 5
        System.out.println("Unreachable case");
        break;
    }
    use(FILE.list().length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe8() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 6:
        // This case is unreachable because getValue() never returns 6
        System.out.println("Unreachable case");
        break;
    }
    use(FILE.list(null).length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe9() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 7:
        // This case is unreachable because getValue() never returns 7
        System.out.println("Unreachable case");
        break;
    }
    use(FILE.listFiles().length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe10() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 8:
        // This case is unreachable because getValue() never returns 8
        System.out.println("Unreachable case");
        break;
    }
    use(FILE.listFiles((FileFilter) null).length);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  void npe11() throws IOException {
    boolean condition = getCondition();
    switch (getValue()) {
      case 9:
        // This case is unreachable because getValue() never returns 9
        System.out.println("Unreachable case");
        break;
    }
    use(FILE.listFiles((FilenameFilter) null).length);
  }

  private void use(Object o) {
    System.out.println(o);
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }
}