import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return "Unreachable";
    } else {
      // This block is also unreachable due to the same reason
      return "Still Unreachable";
    }
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return "Unreachable";
    } else {
      // This block is also unreachable due to the same reason
      return "Still Unreachable";
    }
    return r.readLine().trim();
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}