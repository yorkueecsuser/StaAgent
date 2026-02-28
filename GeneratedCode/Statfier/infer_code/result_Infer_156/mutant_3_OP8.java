import codetoanalyze.java.InferTaint;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

class Files {

  public File fileConstructorSinkBad() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return new File(taintedString);
  }

  public Path fileSystemConstructorSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return FileSystems.getDefault().getPath(taintedString);
  }

  // testing varags
  public Path fileSystemConstructorSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return FileSystems.getDefault().getPath("", taintedString);
  }

  public Path pathsSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return Paths.get(taintedString);
  }

  // testing varags
  public Path pathsSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    return Paths.get("", taintedString);
  }

  // Mutated code
  public File fileConstructorSinkBadMutant() {
    String x = (String) InferTaint.inferSecretSource();
    return new File(x);
  }

  public Path fileSystemConstructorSinkBad1Mutant() {
    String y = (String) InferTaint.inferSecretSource();
    return FileSystems.getDefault().getPath(y);
  }

  // testing varags
  public Path fileSystemConstructorSinkBad2Mutant() {
    String z = (String) InferTaint.inferSecretSource();
    return FileSystems.getDefault().getPath("", z);
  }

  public Path pathsSinkBad1Mutant() {
    String a = (String) InferTaint.inferSecretSource();
    return Paths.get(a);
  }

  // testing varags
  public Path pathsSinkBad2Mutant() {
    String b = (String) InferTaint.inferSecretSource();
    return Paths.get("", b);
  }
}