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
  }

  // Mutated code with renaming operator
  PrintWriter q;

  UninitializedRead(boolean x, File g) throws IOException {
    if (x) {
      // TODO: generate a high priority warning here
      q.println("Debugging started");
    }
    q = new PrintWriter(new FileWriter(g));
  }
}