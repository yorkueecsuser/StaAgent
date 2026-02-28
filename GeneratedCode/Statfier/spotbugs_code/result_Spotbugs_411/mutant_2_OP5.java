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
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition? 0 : 1 will always be 1
          System.out.println("This is unreachable");
          break;
        case 1:
          // This case is always executed
          break;
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
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 2 : 3) {
        case 2:
          // This case is unreachable because condition? 2 : 3 will always be 3
          System.out.println("This is unreachable");
          break;
        case 3:
          // This case is always executed
          break;
      }
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}