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

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    return in.read();
  }

  private boolean getCondition() {
    // This method returns false, ensuring the while loop remains unreachable
    return false;
  }
}