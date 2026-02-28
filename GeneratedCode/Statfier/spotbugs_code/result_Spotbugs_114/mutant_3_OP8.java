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

  // Mutant code with renamed variable
  PrintWriter z;

  UninitializedRead(boolean x, File y) throws IOException {
    if (x) {
      // TODO: generate a high priority warning here
      z.println("Debugging started");
    }
    z = new PrintWriter(new FileWriter(y));
  }
}