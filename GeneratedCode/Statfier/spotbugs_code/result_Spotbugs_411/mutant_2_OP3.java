import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/** Make sure the null-check detection feature of ObligationAnalysis works correctly. */
class CompareToNull {

  @NoWarning("OBL")
  public void ok1(String filename) throws IOException {
    InputStream in = null;

    try {
      in = new FileInputStream(filename);
      int c = in.read();
      System.out.println(c);
    } finally {
      if (in!= null) {
        in.close();
      }
      // Mutant: Adding an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
    }
  }

  @NoWarning("OBL")
  public void ok2(String filename) throws IOException {
    InputStream nullIS = null;
    InputStream in = null;

    try {
      in = new FileInputStream(filename);
      int c = in.read();
      System.out.println(c);
    } finally {
      if (in!= nullIS) { // slightly trickier to analyze this null
        // comparison
        in.close();
      }
      // Mutant: Adding an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is another unreachable statement");
      }
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}