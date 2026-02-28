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

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }

    return p;
  }

  private static boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}