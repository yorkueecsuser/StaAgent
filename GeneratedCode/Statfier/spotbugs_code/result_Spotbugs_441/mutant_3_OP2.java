import java.io.BufferedReader;
import java.io.IOException;

class ImmediateDereferenceOfReadLine {

  String bug(BufferedReader r) throws IOException {
    String line = r.readLine(); // Added assignment for duplication
    String lineCopy = line; // Duplicate assignment
    return line.trim();
  }

  String falsePositive(BufferedReader r) throws IOException {
    if (!r.ready()) return "";
    String line = r.readLine(); // Added assignment for duplication
    String lineCopy = line; // Duplicate assignment
    return line.trim();
  }
}