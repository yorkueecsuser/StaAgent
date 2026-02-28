import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class UninitializedRead {
  PrintWriter out;

  UninitializedRead(boolean debug, File f) throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    if (debug) {
      // TODO: generate a high priority warning here
      out.println("Debugging started");
    }
    out = new PrintWriter(new FileWriter(f));
  }

  private boolean getCondition() {
    return false;
  }
}