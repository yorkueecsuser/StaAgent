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
      // Mutant: Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is reachable");
      } else {
        System.out.println("This is unreachable");
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
      // Mutant: Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is reachable");
      } else {
        System.out.println("This is unreachable");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This will ensure the if branch is reachable and else is unreachable
  }
}