import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        return "unreachable";
      } else {
        return "also unreachable";
      }
    }
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        return "unreachable";
      } else {
        return "also unreachable";
      }
    }
    return r.readLine().trim();
  }

  private boolean getCondition() {
    // This method can return true or false based on some logic
    return false;
  }

  private boolean getFalseCondition() {
    // This method always returns false, making the if-else branch unreachable
    return false;
  }
}