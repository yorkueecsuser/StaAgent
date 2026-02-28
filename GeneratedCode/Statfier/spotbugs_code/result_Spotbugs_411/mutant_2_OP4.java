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
      // Mutant: Adding an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is reachable if condition is true
        System.out.println("This is reachable if condition is true");
      } else {
        // This block is unreachable if condition is false
        System.out.println("This is unreachable if condition is false");
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
      // Mutant: Adding an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is reachable if condition is true
        System.out.println("This is reachable if condition is true");
      } else {
        // This block is unreachable if condition is false
        System.out.println("This is unreachable if condition is false");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the else block is unreachable
  }
}