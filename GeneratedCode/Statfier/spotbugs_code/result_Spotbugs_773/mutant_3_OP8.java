import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;

class Bug1926397 {
  public static HashSet getWordSet(File wordfile) throws IOException {
    HashSet result = new HashSet();
    FileReader x = null; // Mutant: Renamed'reader' to 'x'
    try {
      x = new FileReader(wordfile);
      result = getWordSet(x); // Mutant: Updated'reader' to 'x'
    } finally {
      if (x!= null) x.close(); // Mutant: Updated'reader' to 'x'
    }
    return result;
  }

  public static HashSet getWordSet(Reader reader) throws IOException {
    HashSet z = new HashSet(); // Mutant: Renamed'result' to 'z'
    BufferedReader y = null; // Mutant: Renamed 'br' to 'y'
    try {
      if (reader instanceof BufferedReader) {
        y = (BufferedReader) reader; // Mutant: Updated 'br' to 'y'
      } else {
        y = new BufferedReader(reader); // Mutant: Updated 'br' to 'y'
      }
      String w; // Mutant: Renamed 'word' to 'w'
      while ((w = y.readLine())!= null) { // Mutant: Updated 'word' to 'w' and 'br' to 'y'
        z.add(w.trim()); // Mutant: Updated'result' to 'z' and 'word' to 'w'
      }
    } finally {
      if (y!= null) y.close(); // Mutant: Updated 'br' to 'y'
    }
    return z; // Mutant: Updated'result' to 'z'
  }
}