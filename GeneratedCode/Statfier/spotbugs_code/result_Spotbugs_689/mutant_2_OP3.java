import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Bug1609941 {
  boolean b(File f) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(f));
    boolean result = "o".equals(in.readLine());
    in.close();
    
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      result =!result;
    }
    
    return result;
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}