import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    boolean condition = getUnreachableCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    boolean condition = getUnreachableCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
    return r.readLine().trim();
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if branches unreachable
    return false;
  }
}