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

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      System.out.println("This loop is unreachable");
    }

    return in.read();
  }

  private boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}