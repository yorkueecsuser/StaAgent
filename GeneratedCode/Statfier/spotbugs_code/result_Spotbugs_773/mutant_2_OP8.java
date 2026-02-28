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
    return result;
  }

  // Mutated method
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
    return result;
  }

  // Mutated method with renamed variable
  public static HashSet getWordSet(Reader x) throws IOException {
    HashSet y = new HashSet();
    BufferedReader z = null;
    try {
      if (x instanceof BufferedReader) {
        z = (BufferedReader) x;
      } else {
        z = new BufferedReader(x);
      }
      String w;
      while ((w = z.readLine())!= null) {
        y.add(w.trim());
      }
    } finally {
      if (z!= null) z.close();
    }
    return y;
  }
}