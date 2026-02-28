import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class NullDeref8 {

  public int foo(String filename) throws IOException {
    InputStream in = null;
    try {
      in = new FileInputStream(filename);
    } finally {
      if (in == null) System.out.println("Failure");
    }
    // can't generate a NPE; if in isn't assigned to,
    // threw an exception and won't execute this code

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    return in.read();
  }

  private boolean getCondition() {
    return false;
  }
}