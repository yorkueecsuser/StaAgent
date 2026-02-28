import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Bug1609941 {
  boolean b(File f) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(f));
    boolean result = "o".equals(in.readLine());
    in.close();
    return result;
  }

  // Mutant code with renamed variable
  boolean c(File g) throws IOException {
    BufferedReader j = new BufferedReader(new FileReader(g));
    boolean k = "o".equals(j.readLine());
    j.close();
    return k;
  }
}