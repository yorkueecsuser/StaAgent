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
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return new File(taintedString);
  }

  public Path fileSystemConstructorSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return FileSystems.getDefault().getPath(taintedString);
  }

  // testing varags
  public Path fileSystemConstructorSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return FileSystems.getDefault().getPath("", taintedString);
  }

  public Path pathsSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return Paths.get(taintedString);
  }

  // testing varags
  public Path pathsSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return Paths.get("", taintedString);
  }

  private boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}