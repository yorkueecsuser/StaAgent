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
    }

    // Mutant code
    InputStream x = null;
    try {
      x = new FileInputStream(filename);
      int y = x.read();
      System.out.println(y);
    } finally {
      if (x!= null) {
        x.close();
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
    }

    // Mutant code
    InputStream z = null;
    try {
      z = new FileInputStream(filename);
      int w = z.read();
      System.out.println(w);
    } finally {
      if (z!= nullIS) { // slightly trickier to analyze this null
        // comparison
        z.close();
      }
    }
  }
}