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

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return in.read();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}