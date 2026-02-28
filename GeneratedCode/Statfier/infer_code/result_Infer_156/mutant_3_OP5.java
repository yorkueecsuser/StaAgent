import codetoanalyze.java.InferTaint;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

class Files {

  public File fileConstructorSinkBad() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return new File(taintedString);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  public Path fileSystemConstructorSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return FileSystems.getDefault().getPath(taintedString);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  // testing varags
  public Path fileSystemConstructorSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return FileSystems.getDefault().getPath("", taintedString);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  public Path pathsSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return Paths.get(taintedString);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  // testing varags
  public Path pathsSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return Paths.get("", taintedString);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}