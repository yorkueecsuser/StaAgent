import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally unreachable
      return "unreachable";
    }
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally unreachable
      return "unreachable";
    }
    return r.readLine().trim();
  }

  private boolean getCondition() {
    // This method always returns false, making the if-blocks unreachable
    return false;
  }
}