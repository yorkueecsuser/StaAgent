import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Bug1609941 {
  boolean b(File f) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(f));
    boolean result = "o".equals(in.readLine());
    in.close();
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case.");
        break;
    }
    
    return result;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}