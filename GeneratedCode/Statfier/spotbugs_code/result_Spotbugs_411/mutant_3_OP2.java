import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/** Make sure the null-check detection feature of ObligationAnalysis works correctly. */
class CompareToNull {

  @NoWarning("OBL")
  public void ok1(String filename) throws IOException {
    InputStream in = null;
    InputStream in_duplicate = null; // Duplicate assignment

    try {
      in = new FileInputStream(filename);
      in = new FileInputStream(filename); // Duplicate assignment
      int c = in.read();
      System.out.println(c);
    } finally {
      if (in!= null) {
        in.close();
      }
    }
  }

  @NoWarning("OBL")
  public void ok2(String filename) throws IOException {
    InputStream nullIS = null;
    InputStream in = null;
    InputStream nullIS_duplicate = null; // Duplicate assignment

    try {
      in = new FileInputStream(filename);
      in = new FileInputStream(filename); // Duplicate assignment
      int c = in.read();
      System.out.println(c);
    } finally {
      if (in!= nullIS) { // slightly trickier to analyze this null
        // comparison
        in.close();
      }
    }
  }
}