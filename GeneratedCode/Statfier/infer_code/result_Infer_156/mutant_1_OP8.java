import codetoanalyze.java.InferTaint;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

class Files {

  public File fileConstructorSinkBad() {
    String taintedString = (String) InferTaint.inferSecretSource();
    String b = taintedString; // Mutant: Renamed 'taintedString' to 'b'
    return new File(b);
  }

  public Path fileSystemConstructorSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    String c = taintedString; // Mutant: Renamed 'taintedString' to 'c'
    return FileSystems.getDefault().getPath(c);
  }

  // testing varags
  public Path fileSystemConstructorSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    String d = taintedString; // Mutant: Renamed 'taintedString' to 'd'
    return FileSystems.getDefault().getPath("", d);
  }

  public Path pathsSinkBad1() {
    String taintedString = (String) InferTaint.inferSecretSource();
    String e = taintedString; // Mutant: Renamed 'taintedString' to 'e'
    return Paths.get(e);
  }

  // testing varags
  public Path pathsSinkBad2() {
    String taintedString = (String) InferTaint.inferSecretSource();
    String f = taintedString; // Mutant: Renamed 'taintedString' to 'f'
    return Paths.get("", f);
  }
}