import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class EscapeIntoLoadProperties {

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  static Properties f(File f) throws FileNotFoundException, IOException {
    Properties p = new Properties();
    p.load(new FileInputStream(f));
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code.");
        break;
    }
    
    return p;
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}