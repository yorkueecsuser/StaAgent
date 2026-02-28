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
}