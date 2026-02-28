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
    // Dead store mutation
    String jkdhfjla = "unusedVariable";
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
    // Dead store mutation
    int qzjxvbnr = 42;
    return result;
  }
}