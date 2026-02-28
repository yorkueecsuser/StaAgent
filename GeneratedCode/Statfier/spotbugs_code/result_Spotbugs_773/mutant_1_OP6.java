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
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
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
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
    return result;
  }

  // Method to provide a dynamic condition that is expected to be false
  private static boolean getCondition() {
    return false;
  }
}