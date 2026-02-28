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

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will always execute");
    }

    return p;
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}