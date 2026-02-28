import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    return r.readLine().trim();
  }

  // Mutated method
  String bugx(BufferedReader x) throws IOException {
    return x.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    return r.readLine().trim();
  }

  // Mutated method
  String falsePositivex(BufferedReader x) throws IOException {
    if (!x.ready()) return "";
    return x.readLine().trim();
  }
}