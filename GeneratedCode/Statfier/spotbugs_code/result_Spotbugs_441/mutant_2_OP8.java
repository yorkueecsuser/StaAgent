import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    return r.readLine().trim();
  }

  // Mutant 1: Renaming 'r' to 'a' in the bug method
  String bug(BufferedReader a) throws IOException {
    return a.readLine().trim();
  }

  // Mutant 2: Renaming 'r' to 'b' in the falsePositive method
  String falsePositive(BufferedReader b) throws IOException {
    if (!b.ready()) return "";
    return b.readLine().trim();
  }
}