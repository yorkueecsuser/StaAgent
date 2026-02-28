import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;

class Bug1926397 {
  public static HashSet getWordSet(File wordfile) throws IOException {
    HashSet result = new HashSet();
    FileReader reader = null;
    try {
      reader = new FileReader(wordfile);
      result = getWordSet(reader);
    } finally {
      if (reader!= null) reader.close();
    }
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      result.add("unreachable");
    } else {
      // This block is reachable
      result.add("reachable");
    }
    return result;
  }

  public static HashSet getWordSet(Reader reader) throws IOException {
    HashSet result = new HashSet();
    BufferedReader br = null;
    try {
      if (reader instanceof BufferedReader) {
        br = (BufferedReader) reader;
      } else {
        br = new BufferedReader(reader);
      }
      String word;
      while ((word = br.readLine())!= null) {
        result.add(word.trim());
      }
    } finally {
      if (br!= null) br.close();
    }
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      result.add("unreachable");
    } else {
      // This block is reachable
      result.add("reachable");
    }
    return result;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}