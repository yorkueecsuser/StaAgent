import codetoanalyze.java.InferTaint;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

class Files {

  public File fileConstructorSinkBad() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return new File(taintedString);
  }

  public Path fileSystemConstructorSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return FileSystems.getDefault().getPath(taintedString);
  }

  // testing varags
  public Path fileSystemConstructorSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return FileSystems.getDefault().getPath("", taintedString);
  }

  public Path pathsSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return Paths.get(taintedString);
  }

  // testing varags
  public Path pathsSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return Paths.get("", taintedString);
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}