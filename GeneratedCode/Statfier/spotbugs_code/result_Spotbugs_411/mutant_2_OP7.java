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
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // This loop is unreachable because conditionWhile is dynamically determined and set to false
        conditionWhile = false;
      }
      if (in!= null) {
        in.close();
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
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // This loop is unreachable because conditionWhile is dynamically determined and set to false
        conditionWhile = false;
      }
      if (in!= nullIS) { // slightly trickier to analyze this null comparison
        in.close();
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but set to false
  }
}