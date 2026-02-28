import codetoanalyze.java.InferTaint;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

class Files {

  public File fileConstructorSinkBad() {
    String taintedString = (String) InferTaint.inferSecretSource();
    String qjvbnrht; // Dead store
    return new File(taintedString);
  }

  public Path fileSystemConstructorSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    int kxwvbnrj; // Dead store
    return FileSystems.getDefault().getPath(taintedString);
  }

  // testing varags
  public Path fileSystemConstructorSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    boolean zjvbnrht; // Dead store
    return FileSystems.getDefault().getPath("", taintedString);
  }

  public Path pathsSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    double yjvbnrht; // Dead store
    return Paths.get(taintedString);
  }

  // testing varags
  public Path pathsSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    char xjvbnrht; // Dead store
    return Paths.get("", taintedString);
  }
}