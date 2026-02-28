import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is another unreachable statement");
    }
    return r.readLine().trim();
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}