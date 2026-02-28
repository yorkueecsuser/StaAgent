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
    HashSet y = new HashSet(); // Mutant: Renamed'result' to 'y'
    BufferedReader br = null;
    try {
      if (reader instanceof BufferedReader) {
        br = (BufferedReader) reader;
      } else {
        br = new BufferedReader(reader);
      }
      String z; // Mutant: Renamed 'word' to 'z'
      while ((z = br.readLine())!= null) { // Mutant: Updated 'word' to 'z'
        y.add(z.trim()); // Mutant: Updated'result' to 'y' and 'word' to 'z'
      }
    } finally {
      if (br!= null) br.close();
    }
    return y; // Mutant: Updated'result' to 'y'
  }
}