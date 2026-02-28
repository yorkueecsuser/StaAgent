import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return r.readLine().trim();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}