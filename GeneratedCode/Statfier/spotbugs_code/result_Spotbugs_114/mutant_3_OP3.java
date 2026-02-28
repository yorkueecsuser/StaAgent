import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class UninitializedRead {
  PrintWriter out;

  UninitializedRead(boolean debug, File f) throws IOException {
    if (debug) {
      // TODO: generate a high priority warning here
      out.println("Debugging started");
    }
    out = new PrintWriter(new FileWriter(f));

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    return false;
  }
}