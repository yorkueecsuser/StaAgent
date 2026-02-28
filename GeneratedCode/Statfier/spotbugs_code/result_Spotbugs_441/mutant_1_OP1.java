import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    String jxqfvtbn; // Dead store
    return r.readLine().trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    int pqwzjyxc; // Dead store
    if (!r.ready()) return "";
    return r.readLine().trim();
  }
}