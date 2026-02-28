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

    // Mutated code: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }

    return in.read();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else is unreachable
  }
}